package br.com.klima.desafio.demo.principal;

import br.com.klima.desafio.demo.model.Artista;
import br.com.klima.desafio.demo.model.Musica;
import br.com.klima.desafio.demo.repository.ArtistaRepository;
import br.com.klima.desafio.demo.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private List<Artista> artistas = new ArrayList<>();
    private List<Musica> musicas = new ArrayList<>();

    private ArtistaRepository artistaRepository;
    private MusicaRepository musicaRepository;

    public Principal(ArtistaRepository artistaRepository, MusicaRepository musicaRepository) {
        this.artistaRepository = artistaRepository;
        this.musicaRepository = musicaRepository;
    }

    public void exibeMenu() {

        var opcao = -1;
        while (opcao != 9) {
            var menu = """
                    \n
                    *** SCREEN SOUND MÚSICAS ***
                    
                    1 - Cadastrar artista
                    2 - Cadastrar músicas
                    3 - Listar músicas
                    4 - Buscar músicas por artistas
                    
                    9 - Sair
                    """;

            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarArtista();
                    break;
                case 2:
                    cadastrarMusicas();
                    break;
                case 3:
                    listarMusicas();
                    break;
                case 4:
                    buscarMusicasPorArtista();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private void cadastrarArtista() {
        var opcaoCadastrarArtista = "s";
        while (!opcaoCadastrarArtista.toLowerCase().contains("n")) {
            System.out.println("Informe o nome desse artista: ");
            var nomeArtista = leitura.nextLine();

            System.out.println("Informe o tipo desse artista: (solo, dupla, banda)");
            var tipoArtista = leitura.nextLine();

            Artista artista = new Artista(nomeArtista, tipoArtista);
            artistaRepository.save(artista);

            System.out.println("Cadastrar outro artista? (S/N)");
            opcaoCadastrarArtista = leitura.nextLine();
        }

    }

    private void cadastrarMusicas() {
        System.out.println("Cadastrar música para qual artista?");
        artistas = artistaRepository.findAll();

        var nomes = artistas.stream().map(Artista::getNome)
                .collect(Collectors.toCollection(ArrayList::new));
        nomes.forEach(System.out::println);

        var nomeArtista = leitura.nextLine();

        Optional<Artista> artista = artistaRepository.findByNomeContainingIgnoreCase(nomeArtista);
        if (artista.isPresent()){
            System.out.println("\nInforme o título da música: ");
            var nomeMusica = leitura.nextLine();
            Musica musica = new Musica(nomeMusica);
            musica.setArtista(artista.get());
            artista.get().getMusicas().add(musica);
            artistaRepository.save(artista.get());
        }else {
            System.out.println("Artista não localizado\n");
        }

    }

    private void listarMusicas() {
        musicas = musicaRepository.findAll();
        musicas.forEach(System.out::println);
    }

    private void buscarMusicasPorArtista() {
        artistas = artistaRepository.findAll();

        var nomes = artistas.stream().map(Artista::getNome)
                .collect(Collectors.toCollection(ArrayList::new));
        nomes.forEach(System.out::println);

        System.out.println("Informe o nome desse artista: ");
        var nomeArtista = leitura.nextLine();
        System.out.println();

        Optional<Artista> artista = artistaRepository.findByNomeContainingIgnoreCase(nomeArtista);

        if (artista.isPresent()){
            musicas = artista.get().getMusicas();
            musicas.forEach(System.out::println);
        }else {
            System.out.println("Artista não localizado\n");
        }

    }

}

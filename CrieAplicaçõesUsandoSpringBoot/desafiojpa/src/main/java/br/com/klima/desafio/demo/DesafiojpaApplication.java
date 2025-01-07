package br.com.klima.desafio.demo;

import br.com.klima.desafio.demo.principal.Principal;
import br.com.klima.desafio.demo.repository.ArtistaRepository;
import br.com.klima.desafio.demo.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafiojpaApplication implements CommandLineRunner {

    @Autowired
    private ArtistaRepository artistaRepository;

    @Autowired
    private MusicaRepository musicaRepository;

    public static void main(String[] args) {
        SpringApplication.run(DesafiojpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal(artistaRepository, musicaRepository);
        principal.exibeMenu();
    }
}
package br.com.klima.desafio.demo.repository;


import br.com.klima.desafio.demo.model.Artista;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ArtistaRepository extends JpaRepository<Artista, Long> {

    Optional<Artista> findByNomeContainingIgnoreCase(String nomeArtista);
}

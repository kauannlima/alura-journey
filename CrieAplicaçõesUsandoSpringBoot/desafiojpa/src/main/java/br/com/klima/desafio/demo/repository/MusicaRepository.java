package br.com.klima.desafio.demo.repository;

import br.com.klima.desafio.demo.model.Artista;
import br.com.klima.desafio.demo.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicaRepository extends JpaRepository<Musica, Long> {
}

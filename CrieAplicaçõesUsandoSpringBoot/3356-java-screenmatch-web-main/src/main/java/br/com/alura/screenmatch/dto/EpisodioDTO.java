package br.com.alura.screenmatch.dto;

import br.com.alura.screenmatch.model.Serie;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

public record EpisodioDTO(
        Integer temporada,
        Integer numeroEpisodio,
        String titulo
) {
}

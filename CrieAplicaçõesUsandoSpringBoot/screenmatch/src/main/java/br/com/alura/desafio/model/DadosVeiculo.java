package br.com.alura.desafio.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosVeiculo(
        @JsonAlias("Valor") String Valor,
        @JsonAlias("Marca") String Marca,
        @JsonAlias("Modelo") String Modelo,
        @JsonAlias("AnoModelo") Integer AnoModelo
) {

}

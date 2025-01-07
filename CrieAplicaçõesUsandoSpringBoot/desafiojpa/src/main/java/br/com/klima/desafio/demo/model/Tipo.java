package br.com.klima.desafio.demo.model;

public enum Tipo {

    SOLO("solo"),
    DUPLA("dupla"),
    BANDA("banda");


    private String tipoString;

    Tipo(String tipoString) {
        this.tipoString = tipoString;
    }

    public static Tipo fromString(String text) {
        for (Tipo tipo : Tipo.values()) {
            if (tipo.tipoString.equalsIgnoreCase(text)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Nenhum tipo encontrada para a string fornecida: " + text);
    }
    }

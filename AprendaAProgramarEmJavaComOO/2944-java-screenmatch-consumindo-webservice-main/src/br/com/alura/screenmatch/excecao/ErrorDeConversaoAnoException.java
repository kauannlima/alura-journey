package br.com.alura.screenmatch.excecao;

public class ErrorDeConversaoAnoException extends RuntimeException {

    private String mensagem;

    public ErrorDeConversaoAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return this.mensagem;
    }
}

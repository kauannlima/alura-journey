package br.com.alura.screenmatch.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPT {
    public static String obterTraducao(String texto) {
        OpenAiService service = new OpenAiService("sk-proj-1Dzce20HfajPJRnN9kGWVK_FtSZ36a-QSr_fm99Qi9FykvWaOkYTH8hYw7mKm2jObl25hkZYp0T3BlbkFJubZoiwv8Uc8vlBxXuNQJz8SpKgWfHla4kX9tHPlnaiCsdLX2dN8XJaL443lS60JGh7ropxUUsA1");

        CompletionRequest requisicao = CompletionRequest.builder()
                .model("gpt-3.5-turbo-instruct")
                .prompt("traduza para o português o texto: " + texto)
                .maxTokens(1000)
                .temperature(0.7)
                .build();

        var resposta = service.createCompletion(requisicao);
        return resposta.getChoices().get(0).getText();
    }
}
package desafio;

import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();
        System.out.println("Informe um CEP para buscar na API: ");
        String cepBusca = leitura.nextLine().replace("-","").replace(" ", "");
        URI endereco = URI.create("https://viacep.com.br/ws/" + cepBusca + "/json/");

        String json = "";
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = (HttpRequest) HttpRequest.newBuilder()
                    .uri(endereco)
                    .build();
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            json = response.body();

            EnderecoJson enderecoJson = gson.fromJson(json, EnderecoJson.class);

        } catch (IOException | InterruptedException e) {
            e.getMessage();
        }
        FileWriter escrita = new FileWriter("endereco.json");
        escrita.write(json);
        escrita.close();
        System.out.println(json);
        System.out.println("O programa finalizou corretamente!");
    }
}

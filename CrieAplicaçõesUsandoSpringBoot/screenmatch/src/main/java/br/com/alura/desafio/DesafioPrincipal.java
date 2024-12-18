package br.com.alura.desafio;

import br.com.alura.desafio.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

public class DesafioPrincipal implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DesafioPrincipal.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal();
        principal.exibeMenu();
    }
}

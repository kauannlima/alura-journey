package br.com.alura.screenmatch;

import br.com.alura.screenmatch.principal.Principal;
import br.com.alura.screenmatch.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

<<<<<<< HEAD:CrieAplicaçõesUsandoSpringBoot/3355-java-screenmatch-com-jpa-aula05/src/main/java/br/com/alura/screenmatch/ScreenmatchApplication.java
	@Autowired
	private SerieRepository repositorio;
=======
    @Autowired
    private SerieRepository repository;
>>>>>>> 3b28c85f64fe0cdb29ea9745d3e336879f05fc86:CrieAplicaçõesUsandoSpringBoot/3355-java-screenmatch-com-jpa-main/src/main/java/br/com/alura/screenmatch/ScreenmatchApplication.java

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
<<<<<<< HEAD:CrieAplicaçõesUsandoSpringBoot/3355-java-screenmatch-com-jpa-aula05/src/main/java/br/com/alura/screenmatch/ScreenmatchApplication.java
		Principal principal = new Principal(repositorio);
=======
		Principal principal = new Principal(repository);
>>>>>>> 3b28c85f64fe0cdb29ea9745d3e336879f05fc86:CrieAplicaçõesUsandoSpringBoot/3355-java-screenmatch-com-jpa-main/src/main/java/br/com/alura/screenmatch/ScreenmatchApplication.java
		principal.exibeMenu();
	}
}

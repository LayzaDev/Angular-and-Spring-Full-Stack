package layzadev.github.io;

import layzadev.github.io.model.entity.Client;
import layzadev.github.io.model.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//Diz ao spring boot que essa classe deve inicializar a aplicação e também configura todo o escaneamento de injeção de dependências.
@SpringBootApplication
public class ClientsApplication {

    @Bean
    public CommandLineRunner run(@Autowired ClientRepository repository){
        return args -> {
            Client client = Client.builder().cpf("00000000000").name("Fulano").build();
            repository.save(client);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientsApplication.class, args);
    }
}

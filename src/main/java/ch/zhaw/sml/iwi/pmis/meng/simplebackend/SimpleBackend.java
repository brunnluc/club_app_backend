package ch.zhaw.sml.iwi.pmis.meng.simplebackend;

import ch.zhaw.sml.iwi.pmis.meng.simplebackend.model.Party;
import ch.zhaw.sml.iwi.pmis.meng.simplebackend.repository.PartyServiceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SimpleBackend {
  public static void main(String[] args) {
        SpringApplication.run(SimpleBackend.class, args);
    }
  
    @Autowired
    private PartyServiceRepository partyServiceRepository ;

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            Party p = new Party();
            p.
            p.setQuantity(new QuantityTons(25));
            Attribute a = new Attribute();
            a.setName("BottleMaterial");
            a.setValue("pp");
            p.getAttributes().add(a);

            a = new Attribute();
            a.setName("BottleColor");
            a.setValue("red");
            p.getAttributes().add(a);
            inventoryRepository.save(p);
            
            p = new Part();
            p.setName("Fanta");
            p.setQuantity(new QuantityTons(50));
            inventoryRepository.save(p);
            
            
        };
    }
    
}

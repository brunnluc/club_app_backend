package ch.zhaw.sml.iwi.pmis.meng.simplebackend;

import ch.zhaw.sml.iwi.pmis.meng.simplebackend.model.Club;
import ch.zhaw.sml.iwi.pmis.meng.simplebackend.model.Dj;
import ch.zhaw.sml.iwi.pmis.meng.simplebackend.model.Music;
import ch.zhaw.sml.iwi.pmis.meng.simplebackend.model.Organizer;
import ch.zhaw.sml.iwi.pmis.meng.simplebackend.model.Party;
import ch.zhaw.sml.iwi.pmis.meng.simplebackend.repository.PartyServiceRepository;

import java.util.Date;

// import java.sql.Date;

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
    private PartyServiceRepository partyServiceRepository;

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            Party p = new Party();
            p.setDate(new Date());
            p.setTitel("Smooth & Sexy");
            p.setImageUrl("https://diginights.com/uploads/images/event/2017/07/15/2017-07-15-smooth-n-sexy-at-hiltl-club-sa-15-juli-2017-hiltl-club/headline_image-default-1.jpg");
            p.setDescription("Hip Hop, Club Music, R&B");
            p.setPrice(30.00);

            Club c = new Club();
            c.setName("Badenerstrasse 22");
            c.setLongitude(1.0384);
            c.setLatitude(8.9585);
            p.setClub(c);
            
            Dj d = new Dj();
            d.setName("DJ Lucas Brrrrruunnner");
            p.setDj(d);

            Music m = new Music();
            m.setName("R&B, Latino");
            p.setMusic(m);

            Organizer o = new Organizer();
            o.setFirstName("Salahudini");
            o.setLastName("Zumberi");
            p.setOrganizer(o); 
            
            partyServiceRepository.save(p);

            Party p1 = new Party();
            p1.setDate(new Date());
            p1.setTitel("Smooth & Sexy");
            p1.setImageUrl("https://diginights.com/uploads/images/event/2017/07/15/2017-07-15-smooth-n-sexy-at-hiltl-club-sa-15-juli-2017-hiltl-club/headline_image-default-1.jpg");
            p1.setDescription("Hip Hop, Club Music, R&B");
            p1.setPrice(30.00);

            Club c1 = new Club();
            c1.setName("Badenerstrasse 22");
            c1.setLongitude(1.0384);
            c1.setLatitude(8.9585);
            p1.setClub(c1);
            
            Dj d1 = new Dj();
            d1.setName("DJ Lucas Brrrrruunnner");
            p1.setDj(d1);

            Music m1 = new Music();
            m1.setName("R&B, Latino");
            p1.setMusic(m1);

            Organizer o1 = new Organizer();
            o1.setFirstName("Salahudini");
            o1.setLastName("Zumberi");
            p1.setOrganizer(o1); 
            
            partyServiceRepository.save(p1);
        };
    }
    
}

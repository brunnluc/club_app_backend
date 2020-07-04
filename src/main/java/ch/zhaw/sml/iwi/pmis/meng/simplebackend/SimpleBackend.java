package ch.zhaw.sml.iwi.pmis.meng.simplebackend;

import ch.zhaw.sml.iwi.pmis.meng.simplebackend.model.Club;
import ch.zhaw.sml.iwi.pmis.meng.simplebackend.model.Dj;
import ch.zhaw.sml.iwi.pmis.meng.simplebackend.model.Music;
import ch.zhaw.sml.iwi.pmis.meng.simplebackend.model.Organizer;
import ch.zhaw.sml.iwi.pmis.meng.simplebackend.model.Party;
import ch.zhaw.sml.iwi.pmis.meng.simplebackend.model.User;
import ch.zhaw.sml.iwi.pmis.meng.simplebackend.repository.PartyServiceRepository;
import ch.zhaw.sml.iwi.pmis.meng.simplebackend.repository.UserServiceRepository;

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
    // private UserServiceRepository userServiceRepository;

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            /*User u1 = new User();
            u1.setFirstName("Salahudin");
            u1.setLastName("Zumberi");
            u1.seteMail("salahudin.z@hotmail.com");
            u1.setAddress("Knüsslistrasse 3");
            u1.setPlz(8004);
            u1.setPlace("Zürich");;
            u1.setPhoneNumber("0791362932");
            u1.setPassword("asdf");

            userServiceRepository.save(u1);*/

            Party p1 = new Party();
            Party p2 = new Party();
            Party p3 = new Party();
            Party p4 = new Party();

            p1.setDate(new Date());
            p2.setDate(new Date());
            p3.setDate(new Date());
            p4.setDate(new Date());

            p1.setTitel("Smooth & Sexy");
            p2.setTitel("Snapback");
            p3.setTitel("Silk");
            p4.setTitel("Lemon Dayrave");

            p1.setImageUrl("https://diginights.com/uploads/images/event/2017/07/15/2017-07-15-smooth-n-sexy-at-hiltl-club-sa-15-juli-2017-hiltl-club/headline_image-default-1.jpg");
            p2.setImageUrl("https://jade.ch/wp-content/uploads/2017/07/99A6349-1100x756.jpg");
            p3.setImageUrl("https://jade.ch/wp-content/uploads/2016/08/jade_club_zuerich_7-jahre-jade-text-01-1024x672.jpg");
            p4.setImageUrl("https://media-3.virtualnights.com/media/EventPicture2018/350735/f42211eb29011f0d9664f11c83050822-321-159-1/350735.jpg");

            p1.setDescription("in the daytime is best");
            p2.setDescription("as never before");
            p3.setDescription("today is not tomorrow");
            p4.setDescription("The night of your life");

            p1.setPrice(35.00);
            p2.setPrice(30.00);
            p3.setPrice(25.00);
            p4.setPrice(20.00);

            Club c1 = new Club();
            Club c2 = new Club();
            Club c3 = new Club();
            Club c4 = new Club();


            c1.setName("Hiltl");
            c2.setName("Jade");
            c3.setName("Plaza");
            c4.setName("Hard One");


            c1.setLongitude(47.373284);
            c2.setLongitude(47.371772);
            c3.setLongitude(47.374265);
            c4.setLongitude(47.388766);

            c1.setLatitude(8.536676);
            c2.setLatitude(8.535834);
            c3.setLatitude(8.524707);
            c4.setLatitude(8.520672);


            p1.setClub(c1);
            p2.setClub(c2);
            p3.setClub(c3);
            p4.setClub(c4);

            
            Dj d1 = new Dj();
            Dj d2 = new Dj();
            Dj d3 = new Dj();
            Dj d4 = new Dj();


            d1.setName("dj kitra");
            d2.setName("dj balado");
            d3.setName("dj domino");
            d4.setName("dj summer");


            p1.setDj(d1);
            p2.setDj(d2);
            p3.setDj(d3);
            p4.setDj(d4);


            Music m1 = new Music();
            Music m2 = new Music();
            Music m3 = new Music();
            Music m4 = new Music();

            m1.setName("Hip Hop, Club Music, R&B");
            m2.setName("Latino, Reggeaton");
            m3.setName("Hip-Hop, 80er R&B");
            m4.setName("Goa, Techno");

            p1.setMusic(m1);
            p2.setMusic(m2);
            p3.setMusic(m3);
            p4.setMusic(m4);


            Organizer o1 = new Organizer();
            Organizer o2 = new Organizer();
            Organizer o3 = new Organizer();
            Organizer o4 = new Organizer();

            o1.setFirstName("Argjend");
            o2.setFirstName("Sala");
            o3.setFirstName("Luca");
            o4.setFirstName("Lucas");

            o1.setLastName("Baftiji");
            o2.setLastName("Zym");
            o3.setLastName("Kais");
            o4.setLastName("Brun");

            p1.setOrganizer(o1); 
            p2.setOrganizer(o2); 
            p3.setOrganizer(o3); 
            p4.setOrganizer(o4); 
            
            partyServiceRepository.save(p1);
            partyServiceRepository.save(p2);
            partyServiceRepository.save(p3);
            partyServiceRepository.save(p4);
        };
    }
    
}

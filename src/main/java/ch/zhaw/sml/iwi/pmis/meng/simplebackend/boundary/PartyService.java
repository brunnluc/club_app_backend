package ch.zhaw.sml.iwi.pmis.meng.simplebackend.boundary;

import ch.zhaw.sml.iwi.pmis.meng.simplebackend.model.Party;
import ch.zhaw.sml.iwi.pmis.meng.simplebackend.repository.PartyServiceRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Transactional
@RestController
public class PartyService {

    @Autowired
    private PartyServiceRepository partyServiceRepository;
    
    @GetMapping(path = "/partys")
    public List<Party> getAll() {
        List<Party> partyList = new ArrayList<>();
        for(Party p : partyServiceRepository.findAll()) {
            Hibernate.initialize(p.getClub());
            Hibernate.initialize(p.getDj());
            Hibernate.initialize(p.getMusic());
            Hibernate.initialize(p.getOrganizer());

            // p.getAttributes().size();
            partyList.add(p);
        }
        return partyList;
    }

    @RequestMapping(path = "partys/{id}", method = RequestMethod.GET)
    public ResponseEntity<Party> getParty(@PathVariable Long id){
        Optional<Party> party = partyServiceRepository.findById(id);

        if(party.isPresent()){
            return new ResponseEntity<Party>(party.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    /*

    @RequestMapping(path = "/partys", method=RequestMethod.GET)
    public List<Party> getAll() {
        List<Party> partyList = new ArrayList<>();
        for(Party p : partyServiceRepository.findAll()) {
            Hibernate.initialize(p.getClub());
            Hibernate.initialize(p.getDj());
            Hibernate.initialize(p.getMusic());
            Hibernate.initialize(p.getOrganizer());

            // p.getAttributes().size();
            partyList.add(p);
        }
        return partyList;
    }
    @RequestMapping(path = "/partys/{id}", method = RequestMethod.GET)
    public Party getParty(@RequestParam("id") Long id) {        
        //return partyServiceRepository.findById(id).get();
        return partyServiceRepository.findById(id).get();
*/
   /*
    @PutMapping(path = "/inventory/{id}")
    public void updateEntry(@RequestBody Part part, @RequestParam("id") Long id) {  
        part.setId(id);
        inventoryRepository.save(part);
    }

    @PostMapping(path = "/inventory")
    public void addEntry(@RequestBody Part part) {
        part.setId(null);
        inventoryRepository.save(part);
    }
    

    @GetMapping(path = "/inventory/min")
    public List<Part> getMinAmout() {  
        List<Part> resList = new ArrayList<>();
        for(Part p : inventoryRepository.getPartByQuantityMinTons(40)) {
            resList.add(p);
        }
        return resList;
    }
    */
}

//lol
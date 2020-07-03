package ch.zhaw.sml.iwi.pmis.meng.simplebackend.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ch.zhaw.sml.iwi.pmis.meng.simplebackend.model.Party;

/**
 * PartyServiceRepository
 */
public interface PartyServiceRepository extends CrudRepository<Party, Long>{

    public List<Party> findAll();

}
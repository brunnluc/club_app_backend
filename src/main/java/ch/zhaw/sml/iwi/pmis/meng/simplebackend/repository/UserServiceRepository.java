package ch.zhaw.sml.iwi.pmis.meng.simplebackend.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import ch.zhaw.sml.iwi.pmis.meng.simplebackend.model.User;

/**
 * UserServiceRepository
 */
public interface UserServiceRepository extends CrudRepository<User, Long>{

    public List<User> findAll();
    Optional<User> findById(Long id);
   // public Party findbyId(Long id);
}

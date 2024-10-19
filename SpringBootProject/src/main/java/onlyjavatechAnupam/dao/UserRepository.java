package onlyjavatechAnupam.dao;

import onlyjavatechAnupam.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
    public List<User> findByName(String name);
}

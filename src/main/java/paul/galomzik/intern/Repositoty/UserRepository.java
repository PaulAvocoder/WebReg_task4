package paul.galomzik.intern.Repositoty;

import paul.galomzik.intern.Entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByName(String name);

}

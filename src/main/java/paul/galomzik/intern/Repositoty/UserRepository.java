package paul.galomzik.intern.Repositoty;

import paul.galomzik.intern.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}

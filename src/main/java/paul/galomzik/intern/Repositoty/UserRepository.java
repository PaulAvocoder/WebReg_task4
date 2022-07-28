package maria.pikus.ItransitionTask4.Repositoty;

import maria.pikus.ItransitionTask4.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}

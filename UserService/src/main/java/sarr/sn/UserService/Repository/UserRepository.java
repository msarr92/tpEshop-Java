package sarr.sn.UserService.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import sarr.sn.UserService.Entity.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
}

package sarr.sn.CommandeService.Repository;

import jakarta.persistence.criteria.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import sarr.sn.CommandeService.Entity.Commandes;

public interface CommandeRepository extends JpaRepository<Commandes, Long> {
}

package sarr.sn.ProduitService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sarr.sn.ProduitService.Entity.Produits;

public interface ProduitRepository extends JpaRepository<Produits, Long> {

}

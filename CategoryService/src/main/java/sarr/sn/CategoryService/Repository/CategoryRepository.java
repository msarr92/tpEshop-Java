package sarr.sn.CategoryService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sarr.sn.CategoryService.Entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

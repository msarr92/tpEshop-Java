package sarr.sn.ProduitService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sarr.sn.ProduitService.Entity.Produits;
import sarr.sn.ProduitService.Repository.ProduitRepository;


import java.util.List;

@RestController
@RequestMapping("/products")
public class ProduitsController {

    @Autowired
    private ProduitRepository productRepository;

    @GetMapping
    public List<Produits> getAll() {
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Produits getOne(@PathVariable Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Produits create(@RequestBody Produits product) {
        return productRepository.save(product);
    }

    @PutMapping("/{id}")
    public Produits update(@PathVariable Long id, @RequestBody Produits product) {
        return productRepository.findById(id)
                .map(p -> {
                    p.setName(product.getName());
                    p.setPrice(product.getPrice());
                    p.setDescription(product.getDescription());
                    return productRepository.save(p);
                })
                .orElseGet(() -> {
                    product.setId(id);
                    return productRepository.save(product);
                });
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productRepository.deleteById(id);
    }


}

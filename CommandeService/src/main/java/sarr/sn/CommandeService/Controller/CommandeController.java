package sarr.sn.CommandeService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sarr.sn.CommandeService.Entity.Commandes;
import sarr.sn.CommandeService.Repository.CommandeRepository;

import java.util.List;

@RestController
@RequestMapping("/commandes")
public class CommandeController {

    @Autowired
    private CommandeRepository orderRepository;

    @GetMapping
    public List<Commandes> getAllOrders() {
        return orderRepository.findAll();
    }

    @PostMapping
    public Commandes createOrder(@RequestBody Commandes order) {
        return orderRepository.save(order);
    }

    @GetMapping("/{id}")
    public Commandes getOrderById(@PathVariable Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id) {
        orderRepository.deleteById(id);
    }
}

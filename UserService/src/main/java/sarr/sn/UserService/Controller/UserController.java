package sarr.sn.UserService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sarr.sn.UserService.Entity.Users;
import sarr.sn.UserService.Repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired  // Injection automatique du repository pour accede aux données utilisateurs
    private UserRepository userRepository;


    // Récupère tous les utilisateurs GET /users
    @GetMapping
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    // Récupère un utilisateur par son ID
    @GetMapping("/{id}")
    public Users getUserById(@PathVariable Long id) {
        return userRepository.findById(id).orElse(null);
    }

    // Crée un nouvel utilisateur
    @PostMapping
    public Users createUser(@RequestBody Users user) {
        return userRepository.save(user);
    }

    // Met à jour un utilisateur existant ou le crée s’il n’existe pas
    @PutMapping("/{id}")
    public Users updateUser(@PathVariable Long id, @RequestBody Users user) {
        return userRepository.findById(id)
                .map(u -> {
                    u.setUsername(user.getUsername());
                    u.setPassword(user.getPassword());
                    u.setRole(user.getRole());
                    return userRepository.save(u);
                })
                .orElseGet(() -> {
                    user.setId(id);
                    return userRepository.save(user);
                });
    }

    // Supprime un utilisateur
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
    }
}

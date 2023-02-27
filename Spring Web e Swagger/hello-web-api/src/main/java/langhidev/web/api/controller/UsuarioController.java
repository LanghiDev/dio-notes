package langhidev.web.api.controller;

import langhidev.web.api.model.Usuario;
import langhidev.web.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    @GetMapping()
    public List<Usuario> getUsers(){
        return repository.findAll();
    }

    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String nomeUsusario){
        return repository.findByUsername(nomeUsusario);
    }

    @DeleteMapping("/delete/{userid}")
    public void deleteOne(@PathVariable("userid") int userId){
        repository.deleteById(userId);
    }

    @PostMapping()
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }

    @PutMapping()
    public void putUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
}

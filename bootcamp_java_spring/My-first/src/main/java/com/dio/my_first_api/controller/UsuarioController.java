package com.dio.my_first_api.controller;

import com.dio.my_first_api.repository.UseRepository;
import com.dio.my_first_api.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
 @RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UseRepository useRepository;

    @GetMapping
    public List<Usuario> getUsers(){
        return useRepository.findAll();
    }

    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable ("username") String username){
        return useRepository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
         useRepository.remove(id);
    }
    @PostMapping
    public void postUser(@ RequestBody Usuario usuario){
        useRepository.save(usuario);
    }

    @PutMapping
    public void PutUser(@RequestBody Usuario usuario){
       useRepository.save(usuario);
    }
}

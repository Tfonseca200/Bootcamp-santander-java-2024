package com.dio.my_first_api.repository;

import com.dio.my_first_api.handler.BusinessException;
import com.dio.my_first_api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UseRepository {

    public void save(Usuario usuario) {
        if (usuario.getLogin() == null ) {
            throw new BusinessException("O campo nulo é obrigatório bobão");
        } else {
            if (usuario.getId() == null) {
                System.out.println("SAVE - Recebendo o usuário na camada de repositório");
            } else {
                System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
            }
            System.out.println(usuario);
        }
    }

    public void update(Usuario usuario) {
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }

    public void remove(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }

    public List<Usuario> findAll() {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("gleyson", "password"));
        usuarios.add(new Usuario("frank", "masterpass"));
        return usuarios;
    }

    public Usuario finById(Integer id) {
        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("gleyson", "password");
    }

    public Usuario findByUsername(String username) {

        System.out.println(String.format("FIND/id - Recebendo o username: %s para localizar um usuário", username));
        return new Usuario("gleyson", "password");
    }
}


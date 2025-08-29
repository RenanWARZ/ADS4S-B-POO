package com.bn.api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.bn.api.Model.UsuarioModel;
import com.bn.api.Services.UsuarioServices;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioServices usuarioServices;

    @GetMapping
    public List<UsuarioModel> listarTodos() {
        return usuarioServices.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<UsuarioModel> buscarPorId(@PathVariable Long id) {
        return usuarioServices.buscarPorId(id);
    }

    @PostMapping
    public UsuarioModel salvar(@RequestBody UsuarioModel usuario) {
        return usuarioServices.salvar(usuario);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        usuarioServices.deletar(id);
    }
}

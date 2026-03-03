package br.uniesp.si.techback.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/generos")
public class GeneroController {

    @PostMapping
    public String criar(){
        return "Post criação de Genero exec.";
    }

    @GetMapping
    public String listar(){
        return "Get criação de Genero exec.";
    }

    @PutMapping
    public String atualizar(){
        return "Put criação de Genero exec.";
    }

    @DeleteMapping
    public String deletar(){
        return "Delete criação de Genero exec.";
    }
}

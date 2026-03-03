package br.uniesp.si.techback.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Getters e Setters
@NoArgsConstructor // Cria um construtor vazio
@AllArgsConstructor // Cria um construtor com todos os parâmetros
public class Genero {
    private int id;
    private String nome;
    private String descricao;
}

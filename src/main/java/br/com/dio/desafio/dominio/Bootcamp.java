package br.com.dio.desafio.dominio;

import lombok.Data;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
public class Bootcamp {

    private String nome;
    private String descricao;

    private final LocalDate dataInicial = LocalDate.now(); //encapsulamento
    private final LocalDate dataFinal = dataInicial.plusDays(45); //encapsulamento


    private Set<Dev> devsInscritos = new HashSet<>(); //composição
    private Set<Conteudo> conteudos = new LinkedHashSet<>(); //composição

}

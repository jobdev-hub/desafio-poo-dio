package br.com.dio.desafio.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conteudo { //viabiliza herança

    protected static final double XP_PADRAO = 10d; //encapsulamento

    private String titulo;
    private String descricao;

    public abstract double calcularXp(); //viabiliza polimorfismo

}

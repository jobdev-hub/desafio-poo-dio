package br.com.dio.desafio.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Curso extends Conteudo { //herança
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria; //polimorfismo e encapsulamento
    }

    @Override
    public String toString() {
        return "Curso{titulo='" + getTitulo() + "', descricao='" + getDescricao() + "', cargaHoraria=" + cargaHoraria + '}'; //polimorfismo
    }
}

package br.com.dio.desafio.dominio;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Mentoria extends Conteudo { //herança
    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d; //polimorfismo e encapsulamento
    }

    @Override
    public String toString() {
        return "Mentoria{titulo='" + getTitulo() + "', descricao='" + getDescricao() + "', data=" + data + '}'; //polimorfismo
    }
}

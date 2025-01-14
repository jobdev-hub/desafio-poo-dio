package br.com.dio.desafio.dominio;

import lombok.Data;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

@Data
public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>(); //composição
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>(); //composição

    public void inscreverBootcamp(Bootcamp bootcamp){ //encapsulamento
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() { //encapsulamento
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXp() { //encapsulamento
        Iterator<Conteudo> iterator = this.conteudosConcluidos.iterator();
        double soma = 0;
        while(iterator.hasNext()){
            double next = iterator.next().calcularXp();
            soma += next;
        }
        return soma;
    }

}

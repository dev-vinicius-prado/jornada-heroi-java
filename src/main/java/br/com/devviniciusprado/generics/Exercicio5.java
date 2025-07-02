package br.com.devviniciusprado.generics;

import java.util.List;

public class Exercicio5 {
    public static void main(String[] args) {
        /**
         * Criação de HeroBox para diferentes tipos de dados, como Integer, String e Double.
         * Cada HeroBox imprime a classe do objeto armazenado.
         */
        HeroBox<Integer> poderAllMight = new HeroBox<>(1_000_000_000);
        HeroBox<String> nomeDeHeroi = new HeroBox<>("All Might");
        HeroBox<Double> velocidadeMaxima = new HeroBox<>(999.0);

        nomeDeHeroi.printClass();
        poderAllMight.printClass();
        velocidadeMaxima.printClass();
    }
}


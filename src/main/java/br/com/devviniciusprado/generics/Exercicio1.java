package br.com.devviniciusprado.generics;

import java.util.ArrayList;

public class Exercicio1 {
    public static void main(String[] args) {
        /**
         * Dada a definição do tipo String para o ArrayList, é possível adicionar os nomes sendo eles, apenas do tipo String.
         */
        ArrayList<String> herois = new ArrayList<>();
        herois.add("All Might");
        herois.add("Deku");
        herois.add("Bakugo");

        herois.forEach(heroi -> System.out.println("Heroi: " + heroi));
    }
}

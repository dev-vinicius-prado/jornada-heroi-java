package br.com.devviniciusprado.generics;

import java.util.List;

public class Exercicio3 {
    public static void main(String[] args) {
        List<Integer> inteiros = List.of(1, 2, 3, 4, 5);
        List<Double> decimais = List.of(1.1, 2.2, 3.3, 4.4, 5.5);

        imprimirLista(inteiros);
        imprimirLista(decimais);
    }

    /**
     * Método que recebe uma lista de objetos que estendem a classe Number e imprime seus valores.
     *
     * @param numeros Lista de números que sejam subtipos de Number
     */
    public static void imprimirLista(List<? extends Number> numeros) {
        //numeros.add(100); // Isso causará erro de compilação, pois não é permitido adicionar elementos a uma lista com wildcard
        numeros.forEach(numero -> System.out.println("Valor: " + numero));
    }
}

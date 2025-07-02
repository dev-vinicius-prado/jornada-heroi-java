package br.com.devviniciusprado.generics;

import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {
        imprimirLista(List.of("Midoriya", "Bakugo", "Todoroki"));
        imprimirLista(List.of(1, 2, 3, 4, 5));
    }
    /**
     * Método genérico que recebe uma lista de qualquer tipo e imprime seus itens.
     *
     * @param lista Lista de itens do tipo T
     * @param <T>   Tipo genérico
     */
    public static <T> void imprimirLista(List<T> lista) {
        lista.forEach(item -> System.out.println("Item: " + item));
    }
}

package br.com.devviniciusprado.generics;

import java.util.ArrayList;
import java.util.List;

public class Exercicio4 {
    public static void main(String[] args) {
        List<Integer> inteiros = new ArrayList<>();
        adicionarNumero(inteiros, 2);
        adicionarNumero(inteiros, 4);
        adicionarNumero(inteiros, 6);
        adicionarNumero(inteiros, 8);
        System.out.println("Lista após adicionar números: " + inteiros);
    }

    public static void adicionarNumero(List<? super Integer> numeros, Integer numero) {
        // Adiciona um número à lista, que aceita Integer ou superclasses de Integer
        numeros.add(numero);
    }
}


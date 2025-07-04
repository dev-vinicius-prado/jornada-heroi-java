package br.com.devviniciusprado.annotations;

public class Heroina {
    /**
     * A classe Heroina serve como uma superclasse para heroínas específicas, como Ochaco Uravity e Professora Midnight.
     * Ela pode conter métodos comuns ou propriedades que todas as heroínas compartilham.
     * As subclasses podem sobrescrever o metodo apresentar() para fornecer uma implementação/comportamento específico.
     */

    public void apresentar() {
        System.out.println("Sou uma horoína da U.A.");
    }

    public void listarPoderes(String nome, String... poderes) {
        System.out.println("⚡ " + nome + " possui os seguintes poderes:");
        for (String poder : poderes) {
            System.out.println(" - " + poder);
        }
    }

    public void atacar() {
        System.out.println("Atacando PLUS ULTRA!!!");
    }
}

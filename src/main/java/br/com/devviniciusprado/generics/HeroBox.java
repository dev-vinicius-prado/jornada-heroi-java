package br.com.devviniciusprado.generics;

public class HeroBox<T> {
    private T hero;

    public HeroBox(T hero) {
        this.hero = hero;
    }

    public T getHero() {
        return hero;
    }

    public void setHero(T hero) {
        this.hero = hero;
    }

    public void printClass() {
        System.out.println("Classe do heroí: " + hero.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "HeroBox{" +
                "hero=" + hero +
                '}';
    }
}

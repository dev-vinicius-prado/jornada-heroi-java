package br.com.devviniciusprado.enums;

import java.util.Arrays;

public enum NivelAcesso {
    ADMIN(0), MODERADOR(1), USUARIO(2);
    private int nivel;

    NivelAcesso(int nivel) {
        this.nivel = nivel;
    }

    public static NivelAcesso getNivelAcesso(int i) {
        return Arrays.stream(NivelAcesso.values())
                .filter(n -> n.getNivel() == i)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Nível de acesso inválido: " + i));
    }

    public int getNivel() {
        return nivel;
    }
}

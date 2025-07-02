package br.com.devviniciusprado.enums;

public enum DiaSemana {
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;

    public boolean isFinalDeSemana() {
        return this == SABADO || this == DOMINGO;
    }
}

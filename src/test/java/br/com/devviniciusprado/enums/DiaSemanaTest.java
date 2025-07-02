package br.com.devviniciusprado.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DiaSemanaTest {

    @Test
    void deveRetornarTrueParaSábado() {
        assertTrue(DiaSemana.SABADO.isFinalDeSemana());
    }

    @Test
    void deveRetornarTrueParaDomingo() {
        assertTrue(DiaSemana.DOMINGO.isFinalDeSemana());
    }

    @Test
    void deveRetornarFalseParaDiasUteis() {
        assertFalse(DiaSemana.SEGUNDA.isFinalDeSemana()
                || DiaSemana.TERCA.isFinalDeSemana()
                || DiaSemana.QUARTA.isFinalDeSemana()
                || DiaSemana.QUINTA.isFinalDeSemana()
                || DiaSemana.SEXTA.isFinalDeSemana());
    }
}
package br.com.devviniciusprado.autoboxing_unboxing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoltagemRedeTest {

    @Test
    void deveRetornarTrueParaVoltagem110() {
        VoltagemRede voltagemRede = new VoltagemRede(110, 128);
        Integer baseVoltagem = 110;
        boolean resultado = baseVoltagem == voltagemRede.voltagem110Wrapper;
        assertTrue(resultado);
    }
    @Test
    void deveRetornarTrueParaVoltagem110EqualsVoltagem110Wrapper() {
        VoltagemRede voltagemRede = new VoltagemRede(110, 128);
        Integer baseVoltagem = 110;
        boolean resultado = baseVoltagem.equals(voltagemRede.voltagem110Wrapper);
        assertTrue(resultado);
    }

    @Test
    void deveRetornarTrueParaVoltagem128() {
        VoltagemRede voltagemRede = new VoltagemRede(110, 128);
        Integer baseVoltagem = 128;
        boolean resultado = baseVoltagem.equals(voltagemRede.voltagem128Wrapper);
        assertTrue(resultado);
    }

    @Test
    void deveRetornarFalseParaBaseVoltagem128IgualVoltagem128Wrapper() {
        VoltagemRede voltagemRede = new VoltagemRede(110, 128);
        Integer baseVoltagem = 128;
        boolean resultado = baseVoltagem == voltagemRede.voltagem128Wrapper;
        assertFalse(resultado, "De -128 a 127, o valor é considerado como um inteiro primitivo, mas fora desse intervalo, o valor é considerado como um objeto Integer.");
    }
}
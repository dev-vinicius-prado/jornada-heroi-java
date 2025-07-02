package br.com.devviniciusprado.enums;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NivelAcessoTest {
    
    @Test
    void deveRetornarNivel0ParaAdmin() {
        NivelAcesso nivelAcesso = NivelAcesso.ADMIN;
        assertEquals(0, nivelAcesso.getNivel());
    }

    @Test
    void deveRetornarNivel1ParaModerador() {
        NivelAcesso nivelAcesso = NivelAcesso.MODERADOR;
        assertEquals(1, nivelAcesso.getNivel());
    }

    @Test
    void deveRetornarNivel2ParaUsuario() {
        NivelAcesso nivelAcesso = NivelAcesso.USUARIO;
        assertEquals(2, nivelAcesso.getNivel());
    }

    @Test
    void deveRetornarNivelAcessoParaNivel2() {
        NivelAcesso nivelAcesso = NivelAcesso.getNivelAcesso(2);
        assertEquals(NivelAcesso.USUARIO, nivelAcesso);
    }

    @Test
    void deveRetornarNivelAcessoParaNivel1() {
        NivelAcesso nivelAcesso = NivelAcesso.getNivelAcesso(1);
        assertEquals(NivelAcesso.MODERADOR, nivelAcesso);
    }

    @Test
    void deveRetornarExcecaoParaNivelDesconhecido() {
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> {
            NivelAcesso.getNivelAcesso(9);
        });
        assertEquals("Nível de acesso inválido: 9", illegalArgumentException.getMessage());
    }
}
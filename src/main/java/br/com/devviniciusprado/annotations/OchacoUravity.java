package br.com.devviniciusprado.annotations;

public class OchacoUravity extends Heroina {
    @Override
    public void apresentar() {
        System.out.println("Olá! Sou a Ochaco Uraraka, a heroína Uravity da U.A. \uD83D\uDE80");
    }

    @Override
    @Heroico(valor = "Uravity Style")
    public void atacar() {
        System.out.println("Ataque de gravidade zero da Uravity ativado! \uD83D\uDE80");
    }
}

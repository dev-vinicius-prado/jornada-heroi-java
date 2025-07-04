package br.com.devviniciusprado.annotations;

public class ProfessoraMidnight extends Heroina {
    @Override
    public void apresentar() {
        System.out.println("Midnight no palco ... pronta para ensinar e controlar. \uD83D\uDC8B!");
    }

    @Override
    @Heroico(valor = "Midnight Style")
    public void atacar() {
        System.out.println("Ataque paralisante da Midnight ativado! \uD83D\uDC8B");
    }
}

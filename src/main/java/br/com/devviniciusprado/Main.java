package br.com.devviniciusprado;

import br.com.devviniciusprado.annotations.Heroico;
import br.com.devviniciusprado.annotations.Heroina;
import br.com.devviniciusprado.annotations.OchacoUravity;
import br.com.devviniciusprado.annotations.ProfessoraMidnight;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Heroina professoraMidnight = new ProfessoraMidnight();
        Heroina uravity = new OchacoUravity();
        professoraMidnight.apresentar();
        uravity.apresentar();
        /*
          Através de herança, a classe Heroina pode ser estendida por outras classes e o metodo apresentar()
          pode ser sobrescrito para fornecer uma implementação específica para cada heroína.
          Isso permite que cada heroína tenha sua própria apresentação personalizada, enquanto ainda herda da mesma
          classe base Heroina.
        */

        professoraMidnight.listarPoderes("Professora Midnight", "Controle do sono", "Sedução", "Inteligência");
        uravity.listarPoderes("Ochaco Uravity", "Flutuação de objetos", "Força aumentada", "Habilidade de combate corpo a corpo");

        /*
          O metodo listarPoderes() é um exemplo de como a classe Heroina pode fornecer uma funcionalidade comum
          que pode ser usada por todas as heroínas, independentemente de suas implementações específicas.
          Isso demonstra o conceito de reutilização de código e encapsulamento em programação orientada a objetos.
         */

        /*
          Neste metodo &eacute; usado o VARARGS (varargs) para permitir que um n&uacute;mero vari&aacute;vel de argumentos seja usado.
          Este tipo de par&acirc;metro &eacute; indicado pelo uso de tr&ecirc;s pontos (...) antes do nome do par&acirc;metro.
          E deve ser &uacute;nico e o &uacute;ltimo par&acirc;metro do metodo.
         */

        Method metodo = ProfessoraMidnight.class.getMethod("atacar");
        if (metodo.isAnnotationPresent(Heroico.class)) {
            Heroico ataque = metodo.getAnnotation(Heroico.class);
            System.out.println("Ataque heroico: " + ataque.valor());
        }

        professoraMidnight.atacar();
        uravity.atacar();
    }
}
package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TerraMedia terra = new TerraMedia();

        Arma armaanao = new Arma("picareta",false);
        Arma armaelf = new Arma("Bastão",true);
        Arma armamag = new Arma("Cajado",true);

        Elfo elf = new Elfo("Matheus",22,100,armaelf,"Eldar");
        Anao an = new Anao("dudu",20,100,armaanao,1.5f,"Machado");
        Mago mag = new Mago("Gabriel",22,100,armamag,"preto");

        terra.addHabitante(an);
        terra.addHabitante(elf);
        terra.addHabitante(mag);

        terra.listarHabitantes();



    }
}


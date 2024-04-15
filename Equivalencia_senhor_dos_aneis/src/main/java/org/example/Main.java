package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Habitante[] herois = new Habitante[10];
        Anao an = new Anao(1, "Dudu",20,100,"Machado",false,1.68f,"Condado");
        Elfo elf = new Elfo(2,"Matheus", 22,70,"Arco",false,"Sentinela");
        Mago mag = new Mago(3,"Gabriel",22,100,"Cajado",true,"preto");

        herois[0] = an;
        herois[1] = elf;
        herois[3] = mag;

        System.out.println("Total de habitantes: " + Habitante.contador);
        for (int i = 0; i < herois.length; i++){
            if(herois[i] != null){
                if(herois[i] instanceof Anao){
                    Anao ax = (Anao) herois[i];
                    ax.mostraInfo();
                    ax.atacar();
                    ax.minerar();
                    System.out.println();
                }
                if(herois[i] instanceof Elfo){
                    Elfo ex = (Elfo) herois[i];
                    ex.mostraInfo();
                    ex.atacar();
                    ex.viajar();
                    ex.curar();
                    System.out.println();
                }
                if(herois[i] instanceof Mago){
                    Mago mx = (Mago) herois[i];
                    mx.mostraInfo();
                    mx.atacar();
                    mx.curar();
                    mx.lancaFeitico();
                    System.out.println();
                }
            }
        }
    }
}

package org.example;

public class Anao extends Habitante implements Mineracao{
    private float altura;
    private String reino;

    public Anao(String nome, int idade, float energia, Arma nomeArma, float altura, String reino) {
        super(nome, idade, energia, nomeArma);
        this.altura = altura;
        this.reino = reino;
    }

    @Override
    public void atacar(){
        super.atacar();
    }
    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Altura: " + this.altura);
        System.out.println("Reino: " + this.reino);
    }

    @Override
    public void minerar(){
        System.out.println("O anao esta minerando...");
    }
}

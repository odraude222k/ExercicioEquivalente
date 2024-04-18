package org.example;

public class Elfo extends Habitante implements Cura{
    private String tribo;

    public Elfo(String nome, int idade, float energia, Arma nomeArma, String tribo) {
        super(nome, idade, energia, nomeArma);
        this.tribo = tribo;
    }

    public void viajar(){
        System.out.println("Elfo esta viajando");
    }

    @Override
    public void atacar(){
        super.atacar();
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Tribo: " + this.tribo);
    }

    @Override
    public void curar(){
        this.energia += this.energia*0.15;
        System.out.println(this.nome + "Foi curado");
    }
}

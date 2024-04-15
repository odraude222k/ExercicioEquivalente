package org.example;

public class Elfo extends Habitante implements Cura{
    private String tribo;

    public Elfo(int id, String nome, int idade, float energia, String nomeArma, boolean magicaArma, String tribo) {
        super(id, nome, idade, energia, nomeArma, magicaArma);
        this.tribo = tribo;
    }

    public void viajar(){
        System.out.println("Elfo esta viajando");
    }

    @Override
    public void atacar(){
        if (arma.isMagica()){
            this.energia -= 20;
        } else {
            this.energia -= 10;
        }
        System.out.println("Heroi atacou com " + this.arma.getNomeArma());
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

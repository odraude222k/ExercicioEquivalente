package org.example;

public abstract class  Habitante {
    public static int contador = 0;
    protected int id;
    protected String nome;
    protected int idade;
    protected float energia;
    protected Arma arma;

    public void mostraInfo(){
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade" + this.idade);
        System.out.println("Energia " + this.energia);
        System.out.println("Arma: " + this.arma.getNomeArma());
        if (arma.isMagica()){
            System.out.println("Arma magica");
        }else{
            System.out.println("Arma sem magia");
        }
    }

    public Habitante(int id, String nome, int idade, float energia, String nomeArma, boolean magicaArma) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.energia = energia;
        this.arma = new Arma (nomeArma,magicaArma);
        contador++;
    }

    public void atacar (){
        if (arma.isMagica()){
            this.energia -= 20;
        } else {
            this.energia -= 10;
        }
        System.out.println("Heroi atacou com " + this.arma.getNomeArma());
    }


}

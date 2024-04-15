package org.example;

public class Mago extends Habitante implements Feitico, Cura{
   private String cor;

   public Mago(int id, String nome, int idade, float energia, String nomeArma, boolean magicaArma, String cor) {
      super(id, nome, idade, energia, nomeArma, magicaArma);
      this.cor = cor;
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
      System.out.println("Cor: " + this.cor);

   }

   @Override
   public void lancaFeitico(){
      this.energia -= this.energia*0.1;
      System.out.println("Mago lancou um feitico");
   }

   @Override
   public void curar(){
      this.energia += this.energia*0.15;
      System.out.println(this.nome + "Foi curado");
   }

}

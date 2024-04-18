package org.example;

public class Mago extends Habitante implements Feitico, Cura{
   private String cor;

   public Mago(String nome, int idade, float energia, Arma nomeArma, String cor) {
      super(nome, idade, energia, nomeArma);
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
      super.atacar();

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

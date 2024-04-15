package org.example;

public class TerraMedia {
    Habitante[] herois;

    public TerraMedia(Habitante[] herois) {
        herois = new Habitante[10];
    }

    public void addHabitante(Habitante habitante){
        for(int i = 0; i < herois.length; i++){
            if(herois[i] == null){
                herois[i] = habitante;
            }
        }

    }

    public void listarHabitantes(){
        for(int i = 0; i < herois.length; i++){
            if(herois[i] != null){
                herois[i].mostraInfo();
            }
        }
    }
}

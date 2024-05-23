package org.exercise.java;

public class Main {

    // Metodo per far volare un animale che implementa l'interfaccia IVolante
    static void faiVolare(IVolante animale) {
        animale.vola();
    }

    // Metodo per far nuotare un animale che implementa l'interfaccia INuotante
    static void faiNuotare(INuotante animale) {
        animale.nuota();
    }

    //istanze per i vari animali
    public static void main(String[] args) {
        Cane cane = new Cane();
        Passerotto passerotto = new Passerotto();
        Aquila aquila = new Aquila();
        Delfino delfino = new Delfino();

        //stampa Sto volando
        faiVolare(passerotto);
        faiVolare(aquila);

        //stampa sto nuotando
        faiNuotare(delfino);
    }
}

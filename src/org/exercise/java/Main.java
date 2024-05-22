package org.exercise.java;

public class Main {

    static void faiVolare(IVolante animale) {
        animale.vola();
    }

    static void faiNuotare(INuotante animale) {
        animale.nuota();
    }

    public static void main(String[] args) {
        Cane cane = new Cane();
        Passerotto passerotto = new Passerotto();
        Aquila aquila = new Aquila();
        Delfino delfino = new Delfino();

        faiVolare(passerotto);
        faiVolare(aquila);

        faiNuotare(delfino);
    }
}

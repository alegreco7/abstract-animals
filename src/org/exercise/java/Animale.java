package org.exercise.java;

interface IVolante {
    void vola();
}

interface INuotante {
    void nuota();
}

// definizione di una classe atratta base per tutti gli animali
abstract class Animale {}

class Cane extends Animale {}

// Definizione della classe Passerotto che estende Animale e implementa IVolante
class Passerotto extends Animale implements IVolante {
    @Override
    public void vola() {
        // Implementazione del metodo vola
        System.out.println("Sto volando!!!");
    }
}

class Aquila extends Animale implements IVolante {
    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}

// Definizione della classe Delfino che estende Animale e implementa INuotante
class Delfino extends Animale implements INuotante {
    @Override
    public void nuota() {
        // Implementazione del metodo nuota
        System.out.println("Sto nuotando!!!");
    }
}
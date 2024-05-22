package org.exercise.java;

interface IVolante {
    void vola();
}

interface INuotante {
    void nuota();
}

abstract class Animale {}

class Cane extends Animale {}

class Passerotto extends Animale implements IVolante {
    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}

class Aquila extends Animale implements IVolante {
    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}

class Delfino extends Animale implements INuotante {
    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}
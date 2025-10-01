package org.example.cola;

public class Cola<E> {
    private Nodocola<E> frente;
    private Nodocola<E> fin;
    private int tam;

    public Cola() {
        frente = null;
        fin = null;
        tam = 0;
    }

    public Nodocola<E> getFrente() {
        return frente;
    }

    public void setFrente(Nodocola<E> frente) {
        this.frente = frente;
    }

    public Nodocola<E> getFin() {
        return fin;
    }

    public void setFin(Nodocola<E> fin) {
        this.fin = fin;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
}

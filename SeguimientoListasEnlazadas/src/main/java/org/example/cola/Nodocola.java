package org.example.cola;

public class Nodocola<E> {
    private E dato;
    private Nodocola<E> siguiente;

    public Nodocola(E dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public Nodocola<E> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodocola<E> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "NodoCola{" +
                "dato=" + dato +
                ", siguiente=" + (siguiente != null ? "existe" : "null") +
                '}';
    }
}

package org.example.BiCola;

import org.example.cola.Nodocola;

public class NodoBiCola <E>{
    private NodoBiCola<E> anterior;
    private Nodocola<E> siguiente;
    private E dato;

    public NodoBiCola(E dato) {
        this.anterior = null;
        this.siguiente = null;
        this.dato = dato;
    }

    public NodoBiCola<E> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoBiCola<E> anterior) {
        this.anterior = anterior;
    }

    public Nodocola<E> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodocola<E> siguiente) {
        this.siguiente = siguiente;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }
}

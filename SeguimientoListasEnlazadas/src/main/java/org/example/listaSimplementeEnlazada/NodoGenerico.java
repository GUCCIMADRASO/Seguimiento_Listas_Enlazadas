package org.example.listaSimplementeEnlazada;

public class NodoGenerico<E> implements Comparable<NodoGenerico<E>> {
    private E dato;
    private NodoGenerico<E> siguiente;

    public NodoGenerico(E dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public NodoGenerico<E> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoGenerico<E> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "dato=" + dato +
                ", siguiente=" + siguiente +
                '}';
    }

    @Override
    public int compareTo(NodoGenerico<E> otro) {
        return ((Comparable<E>) this.dato).compareTo(otro.dato);
    }

}

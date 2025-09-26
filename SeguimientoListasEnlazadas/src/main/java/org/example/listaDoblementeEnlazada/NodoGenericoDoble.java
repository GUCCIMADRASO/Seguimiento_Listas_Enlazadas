package org.example.listaDoblementeEnlazada;


public class NodoGenericoDoble<E> {
    private E dato;
    private NodoGenericoDoble<E> siguiente;
    private NodoGenericoDoble<E> anterior;

    public NodoGenericoDoble(E dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public NodoGenericoDoble<E> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoGenericoDoble<E> siguiente) {
        this.siguiente = siguiente;
    }

    public NodoGenericoDoble<E> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoGenericoDoble<E> anterior) {
        this.anterior = anterior;
    }
}

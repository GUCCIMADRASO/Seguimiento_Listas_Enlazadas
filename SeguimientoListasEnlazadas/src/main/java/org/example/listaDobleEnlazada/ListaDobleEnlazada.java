package org.example.listaDobleEnlazada;

import java.util.Iterator;

public class ListaDobleEnlazada<E> implements Iterable<E> {
    private NodoDoble<E> primero;
    private NodoDoble<E> ultimo;
    private int tam;

    public ListaDobleEnlazada(){
        this.primero = null;
        this.ultimo = null;
        this.tam = 0;
    }

    public void agregarPrimero(E dato){
        NodoDoble<E> newNodo = new NodoDoble<>(dato);

        if(this.primero == null){
            this.primero = newNodo;
            this.ultimo = newNodo;
        } else {
            newNodo.setSiguiente(this.primero);
            this.primero.setAnterior(newNodo);
            this.primero = newNodo;
        }
        this.tam++;
    }

    public void agregarUltimo(E dato){
        NodoDoble<E> newNodo = new NodoDoble<>(dato);

        if(this.ultimo == null){
            this.primero = newNodo;
            this.ultimo = newNodo;
        } else {
            this.ultimo.setSiguiente(newNodo);
            newNodo.setAnterior(this.ultimo);
            this.ultimo = newNodo;
        }
        this.tam++;
    }

    public void agregarEnPosicion(E dato, int posicion){
        if(posicion < 0 || posicion > this.tam){
            System.out.println("Posición inválida");
            return;
        }

        if(posicion == 0){
            agregarPrimero(dato);
        } else if(posicion == this.tam){
            agregarUltimo(dato);
        } else {
            NodoDoble<E> actual = this.primero;
            int contador = 0;

            while(contador < posicion){
                actual = actual.getSiguiente();
                contador++;
            }
            NodoDoble<E> anterior = actual.getAnterior();
            NodoDoble<E> newNodo = new NodoDoble<>(dato);

            newNodo.setAnterior(anterior);
            newNodo.setSiguiente(actual);
            anterior.setSiguiente(newNodo);
            this.tam++;
        }
    }

    public void mostrar() {
        NodoDoble<E> actual = primero;
        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getSiguiente();
        }
        System.out.println();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {
            private NodoDoble<E> actual = primero;

            @Override
            public boolean hasNext() {
                return actual != null;
            }

            @Override
            public E next() {
                E dato = actual.getDato();
                actual = actual.getSiguiente();
                return dato;
            }
        };
    }
}

package org.example.listaSimplementeEnlazada;

import java.util.Iterator;

public class ListaGenericaSimpleEnlazada<E> implements Iterable<E>{
    private NodoGenerico<E> primero;
    private int tam;

    public ListaGenericaSimpleEnlazada(){
        this.primero = null;
        this.tam = 0;
    }

    public void agregarOrdenado(E dato) {
        NodoGenerico<E> newNodo = new NodoGenerico<>(dato);

        if (primero == null || ((Comparable<E>)dato).compareTo(primero.getDato()) < 0) {
            agregarPrimero(dato);
            return;
        }

        NodoGenerico<E> actual = primero;
        while (actual.getSiguiente() != null &&
                ((Comparable<E>)dato).compareTo(actual.getSiguiente().getDato()) > 0) {
            actual = actual.getSiguiente();
        }

        newNodo.setSiguiente(actual.getSiguiente());
        actual.setSiguiente(newNodo);
        tam++;
    }


    public void agregarPrimero(E dato){
        NodoGenerico<E> newNodo = new NodoGenerico<>(dato);

        if(this.primero == null){
            this.primero = newNodo;
            this.tam++;
        }
        else{
            newNodo.setSiguiente(this.primero);
            this.primero = newNodo;
            this.tam++;
        }
    }

    public void agregarUltimo(E dato){
        NodoGenerico<E> newNodo = new NodoGenerico<>(dato);

        if(this.primero == null){
            this.primero = newNodo;
            this.tam++;
        }
        else{
            NodoGenerico<E> actual = this.primero;

            while(actual.getSiguiente() != null){
                actual = actual.getSiguiente();
            }

            actual.setSiguiente(newNodo);
            this.tam++;
        }
    }

    public void agregarEnPosicion(E dato, int posicion){
        if(posicion < 0 || posicion > this.tam){
            System.out.println("Posición inválida");
            return;
        }

        NodoGenerico<E> newNodo = new NodoGenerico<>(dato);

        if(posicion == 0){
            agregarPrimero(dato);
        }
        else{
            NodoGenerico<E> actual = this.primero;
            int contador = 0;

            while(contador < posicion - 1){
                actual = actual.getSiguiente();
                contador++;
            }

            newNodo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(newNodo);
            this.tam++;
        }
    }

    public void mostrar(){
        NodoGenerico<E> actual = this.primero;
        String mensaje = "{ ";

        while(actual != null){
            mensaje += actual.getDato() + " ";
            actual = actual.getSiguiente();
        }

        System.out.println(mensaje + "}");
    }

    public void listaVacia(){
        NodoGenerico<E> newNodo = new NodoGenerico<>(null);
    }

    public boolean esVacia(){
        if(this.primero == null){
            return true;
        }
        else{
            return false;
        }
    }

    public int localizar(E dato){
        NodoGenerico<E> actual = this.primero;
        int posicion = 0;

        while(actual != null){
            if(actual.getDato().equals(dato)){
                return posicion;
            }
            actual = actual.getSiguiente();
            posicion++;
        }

        return -1;
    }

    public void suprimir(E dato){
        if(esVacia()){
            System.out.println("La lista está vacía");
            return;
        }

        if(this.primero.getDato().equals(dato)){
            this.primero = this.primero.getSiguiente();
            this.tam--;
            return;
        }

        NodoGenerico<E> actual = this.primero;
        NodoGenerico<E> anterior = null;

        while(actual != null && !actual.getDato().equals(dato)){
            anterior = actual;
            actual = actual.getSiguiente();
        }

        if(actual == null){
            System.out.println("El dato no se encuentra en la lista");
            return;
        }

        anterior.setSiguiente(actual.getSiguiente());
        this.tam--;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private NodoGenerico<E> actual = primero;

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

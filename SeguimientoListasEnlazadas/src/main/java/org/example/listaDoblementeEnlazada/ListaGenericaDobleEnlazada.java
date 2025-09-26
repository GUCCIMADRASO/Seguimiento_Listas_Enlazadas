package org.example.listaDoblementeEnlazada;

public class ListaGenericaDobleEnlazada<E> {
    private NodoGenericoDoble<E> primero;
    private NodoGenericoDoble<E> ultimo;
    private int tam;

    public ListaGenericaDobleEnlazada(){
        this.primero = null;
        this.ultimo = null;
        this.tam = 0;
    }

    public void agregarPrimero(E dato){
        NodoGenericoDoble<E> newNodo = new NodoGenericoDoble<>(dato);

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
        NodoGenericoDoble<E> newNodo = new NodoGenericoDoble<>(dato);

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
            NodoGenericoDoble<E> actual = this.primero;
            int contador = 0;

            while(contador < posicion){
                actual = actual.getSiguiente();
                contador++;
            }
            NodoGenericoDoble<E> anterior = actual.getAnterior();
            NodoGenericoDoble<E> newNodo = new NodoGenericoDoble<>(dato);

            newNodo.setAnterior(anterior);
            newNodo.setSiguiente(actual);
            anterior.setSiguiente(newNodo);
            this.tam++;
        }
    }

    public void mostrar() {
        NodoGenericoDoble<E> actual = primero;
        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getSiguiente();
        }
        System.out.println();
    }
}

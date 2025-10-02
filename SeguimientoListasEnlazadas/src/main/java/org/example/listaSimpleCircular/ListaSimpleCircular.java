package org.example.listaSimpleCircular;

import java.util.Iterator;

public class ListaSimpleCircular<E> implements Iterable<E> {
    private NodoSimpleCircular<E> primero;
    private NodoSimpleCircular<E> ultimo;
    private int tam;

    public ListaSimpleCircular() {
        this.primero = null;
        this.ultimo = null;
        this.tam = 0;
    }

    // 🔹 Agregar al inicio
    public void agregarPrimero(E dato) {
        NodoSimpleCircular<E> newNodo = new NodoSimpleCircular<>(dato);

        if (primero == null) {
            primero = newNodo;
            ultimo = newNodo;
            ultimo.setSiguiente(primero);
        } else {
            newNodo.setSiguiente(primero);
            primero = newNodo;
            ultimo.setSiguiente(primero);
        }
        tam++;
    }

    // 🔹 Agregar al final
    public void agregarUltimo(E dato) {
        NodoSimpleCircular<E> newNodo = new NodoSimpleCircular<>(dato);

        if (primero == null) {
            primero = newNodo;
            ultimo = newNodo;
            ultimo.setSiguiente(primero);
        } else {
            ultimo.setSiguiente(newNodo);
            ultimo = newNodo;
            ultimo.setSiguiente(primero);
        }
        tam++;
    }

    // 🔹 Mostrar lista
    public void mostrar() {
        if (primero == null) {
            System.out.println("Lista vacía");
            return;
        }

        NodoSimpleCircular<E> actual = primero;
        String mensaje = "{ ";

        do {
            mensaje += actual.getDato() + " ";
            actual = actual.getSiguiente();
        } while (actual != primero);

        System.out.println(mensaje + "}");
    }

    // 🔹 Saber si está vacía
    public boolean esVacia() {
        return primero == null;
    }

    public int getTam() {
        return tam;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private NodoSimpleCircular<E> actual = primero;
            private boolean inicio = true;

            @Override
            public boolean hasNext() {
                return actual != null && (inicio || actual != primero);
            }

            @Override
            public E next() {
                E dato = actual.getDato();
                actual = actual.getSiguiente();
                inicio = false;
                return dato;
            }
        };
    }
}

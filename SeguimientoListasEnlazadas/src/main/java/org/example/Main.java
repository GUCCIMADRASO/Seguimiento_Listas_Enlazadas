package org.example;

import org.example.listaSimpleCircular.ListaSimpleCircular;
import org.example.listaDobleEnlazada.ListaDobleEnlazada;

public class Main {
    public static void main(String[] args) {
        ListaSimpleCircular<Integer> lista = new ListaSimpleCircular<>();

        lista.agregarPrimero(3);
        lista.agregarPrimero(2);
        lista.agregarPrimero(1);
        lista.agregarUltimo(4);

        lista.mostrar();

        ListaDobleEnlazada<Integer> listaDoble = new ListaDobleEnlazada<>();
        listaDoble.agregarPrimero(3);
        listaDoble.agregarPrimero(2);
        listaDoble.agregarPrimero(1);
        listaDoble.agregarUltimo(4);
        listaDoble.agregarEnPosicion(5, 2);

        listaDoble.mostrar();

    }
}
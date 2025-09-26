package org.example;

import org.example.listaSimplementeCircular.ListaGenericaSimpleCircular;
import org.example.listaDoblementeEnlazada.ListaGenericaDobleEnlazada;

public class Main {
    public static void main(String[] args) {
        ListaGenericaSimpleCircular<Integer> lista = new ListaGenericaSimpleCircular<>();

        lista.agregarPrimero(3);
        lista.agregarPrimero(2);
        lista.agregarPrimero(1);
        lista.agregarUltimo(4);

        lista.mostrar();

        ListaGenericaDobleEnlazada<Integer> listaDoble = new ListaGenericaDobleEnlazada<>();
        listaDoble.agregarPrimero(3);
        listaDoble.agregarPrimero(2);
        listaDoble.agregarPrimero(1);
        listaDoble.agregarUltimo(4);
        listaDoble.agregarEnPosicion(5, 2);

        listaDoble.mostrar();

    }
}
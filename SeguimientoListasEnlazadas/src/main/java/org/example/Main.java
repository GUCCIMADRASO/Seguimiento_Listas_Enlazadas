package org.example;

import org.example.listaSimplementeCircular.ListaGenericaSimpleCircular;

public class Main {
    public static void main(String[] args) {
        ListaGenericaSimpleCircular<Integer> lista = new ListaGenericaSimpleCircular<>();

        lista.agregarPrimero(3);
        lista.agregarPrimero(2);
        lista.agregarPrimero(1);
        lista.agregarUltimo(4);

        lista.mostrar();
    }
}
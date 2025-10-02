package org.example;

import org.example.listaDobleCircular.ListaDobleCircular;
import org.example.listaSimpleCircular.ListaSimpleCircular;
import org.example.listaDobleEnlazada.ListaDobleEnlazada;

public class Main {
    public static void main(String[] args) {
        ListaSimpleCircular<Integer> lista = new ListaSimpleCircular<>();
        ListaDobleCircular<Integer> lista2 = new ListaDobleCircular<>();
        ListaDobleEnlazada<Integer>  lista3 = new ListaDobleEnlazada<>();

        lista3.agregarOrdenado(2);
        lista3.agregarOrdenado(20);
        lista3.agregarOrdenado(3);
        lista3.agregarOrdenado(1);
        lista3.agregarOrdenado(5);
        lista3.mostrar();

        lista2.agregarOrdenado(30);
        lista2.agregarOrdenado(20);
        lista2.agregarOrdenado(40);
        lista2.agregarOrdenado(5);
        lista2.mostrar();




        lista.agregarPrimero(3);
        lista.agregarPrimero(2);
        lista.agregarPrimero(1);
        lista.agregarUltimo(4);

        lista.mostrar();

        ListaDobleEnlazada<Integer>  lista4 = new ListaDobleEnlazada<>();
        lista4.agregarPrimero(2);
        lista4.agregarPrimero(1);
        lista4.mostrar();


    }
}
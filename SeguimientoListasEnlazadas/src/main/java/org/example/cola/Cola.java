package org.example.cola;

public class Cola<E> {
    private Nodocola<E> frente;
    private Nodocola<E> fin;
    private int tam;

    public Cola() {
        frente = null;
        fin = null;
        tam = 0;
    }

    public Nodocola<E> getFrente() {
        return frente;
    }

    public void setFrente(Nodocola<E> frente) {
        this.frente = frente;
    }

    public Nodocola<E> getFin() {
        return fin;
    }

    public void setFin(Nodocola<E> fin) {
        this.fin = fin;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public void encolar(E dato) {
        Nodocola<E> nuevo = new Nodocola<>(dato);
        if (estaVacia()) {
            frente = fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
        tam++;
    }

    public E desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía.");
        }
        E dato = frente.getDato();
        frente = frente.getSiguiente();
        tam--;
        if (frente == null) {
            fin = null;
        }
        return dato;
    }

    public E peek() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía.");
        }
        return frente.getDato();
    }
    public boolean estaVacia() {
        return tam == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cola: [");
        Nodocola<E> actual = frente;
        while (actual != null) {
            sb.append(actual.getDato());
            if (actual.getSiguiente() != null) sb.append(" <- ");
            actual = actual.getSiguiente();
        }
        sb.append("]");
        return sb.toString();
    }
}

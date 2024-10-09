package com.alura.screenmacth.modelos;

import com.alura.screenmacth.calculos.Clasificable;

public class Pelicula  extends Titulos implements Clasificable {
    private String direcctor;


    public Pelicula(String nombre, int fechaDenLanzamiento) {
        super(nombre, fechaDenLanzamiento);
    }

    public String getDirecctor() {
        return direcctor;
    }
    public void setDirecctor(String direcctor) {
        this.direcctor = direcctor;
    }

    @Override
    public int getClasificable() {
        return (int) (calculaMedia() / 2);
    }

    @Override
    public String toString() {
        return "Pelicula: " + this.getNombre() + "(" + getFechaDenLanzamiento() + ")";
    }
}

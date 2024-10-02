package com.aluracursos.scrrenmacth.modelos;

import com.aluracursos.screenmacth.calculos.Clasificable;

public class Pelicula  extends Titulos implements Clasificable {
    private String direcctor;

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
}

package com.aluracursos.screenmacth.calculos;


import com.aluracursos.scrrenmacth.modelos.Titulos;


public class CalculadoraDeTiempo {

    private int tiempoTotal;

    public void incluye(Titulos titulos){
        tiempoTotal+= titulos.getDuracionEnMinutos();
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }
}

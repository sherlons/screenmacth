package com.alura.screenmacth.screenmacth.calculos;


import com.screenmacth.scrrenmacth.modelos.Titulos;


public class CalculadoraDeTiempo {

    private int tiempoTotal;

    public void incluye(Titulos titulos){
        tiempoTotal+= titulos.getDuracionEnMinutos();
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }
}

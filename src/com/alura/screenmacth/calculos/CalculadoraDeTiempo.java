package com.alura.screenmacth.calculos;

import com.alura.screenmacth.modelos.Titulos;


public class CalculadoraDeTiempo {

    private int tiempoTotal;

    public void incluye(Titulos titulos){
        tiempoTotal+= titulos.getDuracionEnMinutos();
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }
}

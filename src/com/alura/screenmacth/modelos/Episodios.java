package com.alura.screenmacth.scrrenmacth.modelos;

import com.alura.screenmacth.screenmacth.calculos.Clasificable;

public class Episodios implements Clasificable {
    private int numero;
    private String nombre;
    private Series series;
    private int totalVisualisasiones;

    public void setTotalVisualisasiones(int totalVisualisasiones) {
        this.totalVisualisasiones = totalVisualisasiones;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    @Override
    public int getClasificable() {
        if (totalVisualisasiones> 100){
            return 4;
        }else{
        return 2;
        }
    }
}

package com.alura.screenmacth.modelos;

public class Series extends Titulos {
    int temporadas;
    int episodiosPorTemporada;
    int minutosPorEpisodio;


    public Series(String nombre, int fechaDenLanzamiento) {
        super(nombre, fechaDenLanzamiento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodios() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
    @Override
    public int getDuracionEnMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }
}


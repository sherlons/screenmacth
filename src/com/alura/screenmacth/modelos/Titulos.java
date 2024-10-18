package com.alura.screenmacth.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulos implements Comparable<Titulos>{
    @SerializedName("Title")
    private String nombre;
    @SerializedName("Year")
    private int fechaDenLanzamiento;
    private int duracionEnMinutos;
    public boolean incluidoEnElplan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;
    private String genero;

    public Titulos(String nombre, int fechaDenLanzamiento) {
        this.nombre = nombre;
        this.fechaDenLanzamiento = fechaDenLanzamiento;
    }

    public Titulos(TituloOmdb miTituloOmdb) {
        this.nombre = miTituloOmdb.title();
        this.fechaDenLanzamiento = Integer.valueOf(miTituloOmdb.year());
        this.duracionEnMinutos = Integer.valueOf(miTituloOmdb.runtime().substring(0,2));
        this.genero = miTituloOmdb.genre();
    }
    public String getGenero(){return genero;}
    public String getNombre() {
        return nombre;
    }
    public int getFechaDenLanzamiento() {
        return fechaDenLanzamiento;
    }
    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }
    public boolean isIncluidoEnElplan() {
        return incluidoEnElplan;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setFechaDenLanzamiento(int fechaDenLanzamiento) {
        this.fechaDenLanzamiento = fechaDenLanzamiento;
    }
    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }
    public void setIncluidoEnElplan(boolean incluidoEnElplan) {
        this.incluidoEnElplan = incluidoEnElplan;
    }
    public int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;
    }
    public void muestraFichaTecnica() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("la Nombre de la pelicula es: " + nombre + "!!");
        System.out.println("su fecha de lazamiento fue: " + fechaDenLanzamiento);
        System.out.println("Duracion en Minutos:  " + getDuracionEnMinutos());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
    public void evalua(double nota){
        sumaDeLasEvaluaciones = sumaDeLasEvaluaciones + nota;
        totalDeLasEvaluaciones++;

    }
    public double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }

    @Override
    public int compareTo(Titulos otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", fechaDenLanzamiento=" + fechaDenLanzamiento +
                ", dutracion= "+ duracionEnMinutos +
                ", genero= "+ genero;
    }
}

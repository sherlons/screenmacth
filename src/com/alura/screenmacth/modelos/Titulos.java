package com.alura.screenmacth.modelos;

public class Titulos implements Comparable<Titulos>{
    private String nombre;
    private int fechaDenLanzamiento;
    private int duracionEnMinutos;
    public boolean incluidoEnElplan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;

    public Titulos(String nombre, int fechaDenLanzamiento) {
        this.nombre = nombre;
        this.fechaDenLanzamiento = fechaDenLanzamiento;
    }

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
}

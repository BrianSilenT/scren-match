package com.aluracursos.screnmatch.modelos;

public class pelicula {
    private String nombre;

    private int fechaDeLanzamiento;

    private int DuracionMinutos;

    private int duracionEpisodios;

    private boolean incluidoEnelPlan;

    private double sumaDelasEvaluaciones;

    private int totaEvaluaciones;

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionMinutos() {
        return DuracionMinutos;
    }

    public int getDuracionEpisodios() {
        return duracionEpisodios;
    }

    public boolean isIncluidoEnelPlan() {
        return incluidoEnelPlan;
    }

    public double getSumaDelasEvaluaciones() {
        return sumaDelasEvaluaciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        DuracionMinutos = duracionMinutos;
    }

    public void setDuracionEpisodios(int duracionEpisodios) {
        this.duracionEpisodios = duracionEpisodios;
    }

    public void setIncluidoEnelPlan(boolean incluidoEnelPlan) {
        this.incluidoEnelPlan = incluidoEnelPlan;
    }

    double getTotaEvaluaciones() {
        calculaMedia();
        return 0;
    }

    public void muestraFichaTecnica() {
        System.out.println("El nombre de la pelicula es " + nombre);
        System.out.println("Fue lanzada en el año " + fechaDeLanzamiento);
        System.out.println("Tiene una duracion de " + DuracionMinutos + " minutos");

    }

    public void muestraFichaAnime() {
        System.out.println("El nombre de el anime es  " + nombre);
        System.out.println("Fue lanzado en  " + fechaDeLanzamiento);
        System.out.println("Tiene una duracion de " + duracionEpisodios + " episodios");

    }

    public void evaluate(double nota) {
        sumaDelasEvaluaciones += nota;
        totaEvaluaciones++;
    }

    public double calculaMedia() {
        return sumaDelasEvaluaciones / totaEvaluaciones;
    }

}


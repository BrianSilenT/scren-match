package com.aluracursos.screnmatch.modelos;

public class serie extends pelicula {
    int episodiosDetemporada;

    int minutosEpisodiotemporada;

    int temporada;

    @Override
    public int getDuracionMinutos() {
        return temporada * episodiosDetemporada * minutosEpisodiotemporada;
    }

    public int getEpisodiosDetemporada() {
        return episodiosDetemporada;
    }

    public void setEpisodiosDetemporada(int episodiosDetemporada) {
        this.episodiosDetemporada = episodiosDetemporada;
    }

    public int getMinutosEpisodiotemporada() {
        return minutosEpisodiotemporada;
    }

    public void setMinutosEpisodiotemporada(int minutosEpisodiotemporada) {
        this.minutosEpisodiotemporada = minutosEpisodiotemporada;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}



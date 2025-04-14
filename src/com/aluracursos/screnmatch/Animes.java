package com.aluracursos.screnmatch;

import com.aluracursos.screnmatch.modelos.Pelicula;

public class Animes {

    public static void main(String[] args) {

        Pelicula anime = new Pelicula();
        anime.setNombre("invencible");
        anime.setFechaDeLanzamiento(2010);
        anime.setDuracionEpisodios(12);
        anime.setIncluidoEnelPlan(true);

        anime.muestraFichaAnime();
        anime.evaluate(9);
        anime.evaluate(8);
        anime.evaluate(10);
        System.out.println(anime.calculaMedia());

        Pelicula animeDos = new Pelicula();
        animeDos.setNombre("overlord");
        animeDos.setFechaDeLanzamiento(2010);
        animeDos.setDuracionEpisodios(10);
        animeDos.setIncluidoEnelPlan(true);

        animeDos.muestraFichaAnime();
        animeDos.evaluate(10);
        animeDos.evaluate(10);
        animeDos.evaluate(9);
        System.out.println(animeDos.calculaMedia());
    }
}

package com.aluracursos.screnmatch.calculos;

import com.aluracursos.screnmatch.modelos.Pelicula;

public class CalculadoraDeTiempo {

    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Pelicula pelicula){
        this.tiempoTotal += pelicula.getDuracionMinutos();
    }

}

import com.aluracursos.screnmatch.modelos.pelicula;

public class animes {

    public static void main(String[] args) {

        pelicula anime = new pelicula();
        anime.setNombre("invencible");
        anime.setFechaDeLanzamiento(2010);
        anime.setDuracionEpisodios(12);
        anime.setIncluidoEnelPlan(true);

        anime.muestraFichaAnime();
        anime.evaluate(9);
        anime.evaluate(8);
        anime.evaluate(10);
        System.out.println(anime.calculaMedia());

        pelicula animeDos = new pelicula();
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

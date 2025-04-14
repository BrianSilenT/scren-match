import com.aluracursos.screnmatch.modelos.pelicula;
import com.aluracursos.screnmatch.modelos.serie;

public class principal {
    public static void main(String[] args) {
        pelicula miPelicula = new pelicula();
        miPelicula.setNombre("encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionMinutos(120);

        miPelicula.muestraFichaTecnica();
        miPelicula.evaluate(9);
        miPelicula.evaluate(9);
        miPelicula.evaluate(9);
        System.out.println(miPelicula.calculaMedia());

        pelicula miOtraPelicula = new pelicula();
        miOtraPelicula.setNombre("matrix");
        miOtraPelicula.setFechaDeLanzamiento(1999);
        miOtraPelicula.setDuracionMinutos(125);
        miOtraPelicula.setIncluidoEnelPlan(true);

        miOtraPelicula.muestraFichaTecnica();
        miOtraPelicula.evaluate(8);
        miOtraPelicula.evaluate(9);
        miOtraPelicula.evaluate(8);
        System.out.println(miOtraPelicula.calculaMedia());

        serie casaDragon = new serie();
        casaDragon.setNombre("la casa del dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporada(1);
        casaDragon.setMinutosEpisodiotemporada(50);
        casaDragon.setEpisodiosDetemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionMinutos());

    }
}

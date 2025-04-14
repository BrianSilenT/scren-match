import com.aluracursos.screnmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screnmatch.modelos.Pelicula;
import com.aluracursos.screnmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionMinutos(120);


        miPelicula.muestraFichaTecnica();
        miPelicula.evaluate(9);
        miPelicula.evaluate(9);
        miPelicula.evaluate(9);
        System.out.println(miPelicula.calculaMedia());

        Pelicula miOtraPelicula = new Pelicula();
        miOtraPelicula.setNombre("matrix");
        miOtraPelicula.setFechaDeLanzamiento(1999);
        miOtraPelicula.setDuracionMinutos(125);
        miOtraPelicula.setIncluidoEnelPlan(true);

        miOtraPelicula.muestraFichaTecnica();
        miOtraPelicula.evaluate(8);
        miOtraPelicula.evaluate(9);
        miOtraPelicula.evaluate(8);
        System.out.println(miOtraPelicula.calculaMedia());

        Serie casaDragon = new Serie();
        casaDragon.setNombre("la casa del dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporada(1);
        casaDragon.setMinutosEpisodiotemporada(50);
        casaDragon.setEpisodiosDetemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionMinutos());

        
        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(miOtraPelicula);

        
        System.out.println(calculadora.getTiempoTotal());
    }
}

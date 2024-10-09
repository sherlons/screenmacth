import com.alura.screenmacth.calculos.CalculadoraDeTiempo;
import com.alura.screenmacth.calculos.FiltroRecomendaciones;
import com.alura.screenmacth.modelos.Episodios;
import com.alura.screenmacth.modelos.Pelicula;
import com.alura.screenmacth.modelos.Series;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        //cartelera
        Pelicula miPelicula = new Pelicula("termineitor", 1998);
        miPelicula.setDuracionEnMinutos(95);
        miPelicula.setIncluidoEnElplan(true);
        // PUNTUACION, USUARIOS

        miPelicula.evalua(8);
        miPelicula.evalua(10);
        miPelicula.evalua(10);

        // miPelicula.muestraFichaTecnica();
        //System.out.println("Nota media de esta pelicula es: "+ miPelicula.calculaMedia());


        Series casaDragon = new Series("la Casa Del Dragon", 2022);
        casaDragon.setTemporadas(1);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.setMinutosPorEpisodios(50);
        casaDragon.setIncluidoEnElplan(true);
        //casaDragon.muestraFichaTecnica();

        Pelicula miPelicula1 = new Pelicula("Avatar 2", 2023);
        miPelicula1.setDuracionEnMinutos(90);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(miPelicula1);
       // System.out.println(calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendaciones filtroRecomenDaciones = new FiltroRecomendaciones();
        //filtroRecomenDaciones.filtra(miPelicula);


        Episodios episodios = new Episodios();
        episodios.setNumero(1);
        episodios.setNombre("la Casa Dragon");
        episodios.setSeries(casaDragon);
        episodios.setTotalVisualisasiones(300);
        //filtroRecomenDaciones.filtra(episodios);

        var peliculaDearo =new Pelicula("El Aro", 2001);
        peliculaDearo.setDuracionEnMinutos(80);


        ArrayList<Pelicula> listadoDePeliculas = new ArrayList<>();
        listadoDePeliculas.add(miPelicula);
        listadoDePeliculas.add(peliculaDearo);
        listadoDePeliculas.add(miPelicula1);

        System.out.println("Numero peliculas: " + listadoDePeliculas.size());
        System.out.println("la segunda pelicula es "+ listadoDePeliculas.get(1).getNombre());
        System.out.println(listadoDePeliculas);



    }
}

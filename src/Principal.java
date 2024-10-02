import com.aluracursos.screenmacth.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmacth.calculos.FiltroRecomenDaciones;
import com.aluracursos.scrrenmacth.modelos.Episodios;
import com.aluracursos.scrrenmacth.modelos.Pelicula;
import com.aluracursos.scrrenmacth.modelos.Series;

public class Principal {

    public static void main(String[] args) {
        //cartelera
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("termineitor");
        miPelicula.setDuracionEnMinutos(95);
        ;
        miPelicula.setFechaDenLanzamiento(1998);
        miPelicula.setIncluidoEnElplan(true);
        // PUNTUACION, USUARIOS

        miPelicula.evalua(8);
        miPelicula.evalua(10);
        miPelicula.evalua(10);

        miPelicula.muestraFichaTecnica();
        //System.out.println("Nota media de esta pelicula es: "+ miPelicula.calculaMedia());


        Series casaDragon = new Series();
        casaDragon.setNombre("la Casa Del Dragon");
        casaDragon.setFechaDenLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.setMinutosPorEpisodios(50);
        casaDragon.setIncluidoEnElplan(true);
        casaDragon.muestraFichaTecnica();

        Pelicula miPelicula1 = new Pelicula();
        miPelicula1.setNombre("Avatar 2");
        miPelicula1.setFechaDenLanzamiento(2023);
        miPelicula1.setDuracionEnMinutos(90);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(miPelicula1);
        System.out.println(calculadora.getTiempoTotal() + " minutos");

        FiltroRecomenDaciones filtroRecomenDaciones = new FiltroRecomenDaciones();
        filtroRecomenDaciones.filtra(miPelicula);


        Episodios episodios = new Episodios();
        episodios.setNumero(1);
        episodios.setNombre("la Casa Dragon");
        episodios.setSeries(casaDragon);
        episodios.setTotalVisualisasiones(50);

        filtroRecomenDaciones.filtra(episodios);

    }
}

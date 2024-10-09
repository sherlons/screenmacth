package com.alura.screenmacth.principal;

import com.alura.screenmacth.modelos.Pelicula;
import com.alura.screenmacth.modelos.Series;
import com.alura.screenmacth.modelos.Titulos;

import java.util.*;

public class PrincipalConLista {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("termineitor", 1998);
        miPelicula.evalua(9);
        Pelicula miPelicula1 = new Pelicula("Avatar 2", 2023);
        miPelicula1.evalua(8);
        var peliculaDearo = new Pelicula("El Aro", 2001);
        peliculaDearo.evalua(7);
        Series casaDragon = new Series("la Casa Del Dragon", 2022);
        casaDragon.evalua(10);

        //List<Titulos> lista = new LinkedList<>();
        ArrayList<Titulos> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(peliculaDearo);
        lista.add(miPelicula1);
        lista.add(casaDragon);

        for (Titulos Item : lista) {
            System.out.println("nombre: " + Item.getNombre());

            // modificable al camiviar elavaluacion de Series
            if (Item instanceof Pelicula pelicula && pelicula.getClasificable() > 2) {
                // Pelicula pelicula = (Pelicula) Item;
                System.out.println(pelicula.getClasificable());
            }
        }

        ArrayList<String>listaArtistas = new ArrayList<>();
        listaArtistas.add("Richar Nixon");
        listaArtistas.add("Antonio Banderas");
        listaArtistas.add("Silvestre Stalone");
        listaArtistas.add("Andrea Lopez");

        Collections.sort(listaArtistas);
        System.out.println("ordenadas" +listaArtistas);

        Collections.sort(lista);
        System.out.println("lista de Titulos" + lista);

         lista.sort(Comparator.comparing(Titulos::getFechaDenLanzamiento).reversed());
        System.out.println("lista ordenada por fecha: " +lista);
    }
}

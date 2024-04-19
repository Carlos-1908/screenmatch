package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalConListas {

    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2016);
        miPelicula.evalua(10);

        Serie casaDragon = new Serie("La casa del dragon", 2022);
        casaDragon.evalua(8);

        Pelicula otraPelicula = new Pelicula("Matrix", 1999);
        otraPelicula.evalua(6);

        var nuevaPelicula = new Pelicula("El señor de los anillos", 2001);
        nuevaPelicula.evalua(7);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(nuevaPelicula);
        lista.add(casaDragon);

        for (Titulo item: lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula){
                System.out.println(pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darin");
        System.out.println(listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada:" + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha: " + lista);

    }
}

package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2016);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        miPelicula.muestraFichaTecnica();

        Serie casaDragon = new Serie("La casa del dragon", 2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPoTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Matrix", 1999);
        otraPelicula.setDuracionEnMinutos(180);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNombre("Casa Targaryen");
        episodio.setNumero(1);
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(300);

        var nuevaPelicula = new Pelicula("El señor de los anillos", 2001);
        nuevaPelicula.setDuracionEnMinutos(180);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);
        listaDePeliculas.add(nuevaPelicula);

        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("La primera pelicula de la lista es: " + listaDePeliculas.getFirst().getNombre());

        System.out.println("toString de la pelicula: " + listaDePeliculas.getFirst().toString());
    }
}

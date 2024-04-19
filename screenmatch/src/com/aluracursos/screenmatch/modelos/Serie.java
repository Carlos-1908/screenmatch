package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo{
    int temporadas;
    int episodiosPoTemporada;
    int minutosPorEpisodio;

    public Serie(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }

    @Override
    public int getDuracionEnMinutos() {
        return temporadas * episodiosPoTemporada * minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodiosPoTemporada() {
        return episodiosPoTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setEpisodiosPoTemporada(int episodiosPoTemporada) {
        this.episodiosPoTemporada = episodiosPoTemporada;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNombre() + " (" + this.getFechaDeLanzamiento() + ")";
    }
}

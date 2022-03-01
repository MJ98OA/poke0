package com.example.pokemongame;

public class Pokemons {
    public String nombrepokemon;
    public int nivelpokemon;
    private String imgenpokemon;
    private String imagengenero;
    private String imagenps;
    public int vidaActual;
    private int vidaMaxima;
    boolean  seleccionado;
    int vecesSeleccionado;
  

    Pokemons(String nombrepokemon,int nivelpokemon,String imgenpokemon,String imagengenero,String imagenps,int vidaActual,int vidaMaxima,boolean seleccionado, int vecesSeleccionado){
        this.nombrepokemon=nombrepokemon;
        this.nivelpokemon=nivelpokemon;
        this.imgenpokemon=imgenpokemon;
        this.imagengenero=imagengenero;
        this.imagenps=imagenps;
        this.vidaActual=vidaActual;
        this.vidaMaxima=vidaMaxima;
        this.seleccionado=seleccionado;
        this.vecesSeleccionado=vecesSeleccionado;
    }



    public String getNombrepokemon() {
        return nombrepokemon;
    }

    public void setNombrepokemon(String nombrepokemon) {
        this.nombrepokemon = nombrepokemon;
    }

    public int getNivelpokemon() {
        return nivelpokemon;
    }

    public void setNivelpokemon(int nivelpokemon) {
        this.nivelpokemon = nivelpokemon;
    }

    public String getImgenpokemon() {
        return imgenpokemon;
    }

    public void setImgenpokemon(String imgenpokemon) {
        this.imgenpokemon = imgenpokemon;
    }

    public String getImagengenero() {
        return imagengenero;
    }

    public void setImagengenero(String imagengenero) {
        this.imagengenero = imagengenero;
    }

    public String getImagenps() {
        return imagenps;
    }

    public void setImagenps(String imagenps) {
        this.imagenps = imagenps;
    }

    public int getVidaActual() {return vidaActual;}

    public void setVidaActual(int vidaActual) {
        this.vidaActual = vidaActual;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) {this.vidaMaxima = vidaMaxima;}

    public boolean isSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(boolean seleccionado) {
        this.seleccionado = seleccionado;
    }

    public int getVecesSeleccionado() {
        return vecesSeleccionado;
    }

    public void setVecesSeleccionado(int vecesSeleccionado) {
        this.vecesSeleccionado = vecesSeleccionado;
    }
}

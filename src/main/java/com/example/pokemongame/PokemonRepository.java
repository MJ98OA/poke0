package com.example.pokemongame;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PokemonRepository {


    private static List<Pokemons> listaPokemons=new ArrayList<>();



    static public List<Pokemons> getData() {
        if (!listaPokemons.isEmpty()){
            return listaPokemons;
        }

        Pokemons p1=new Pokemons("Miutu",126,"src\\main\\java\\com\\example\\pokemongame\\img\\mewtwo.gif","src\\main\\java\\com\\example\\pokemongame\\img\\male.png","src\\main\\java\\com\\example\\pokemongame\\img\\ps.png",20,200,false);
        Pokemons p2=new Pokemons("Aggron",173,"src\\main\\java\\com\\example\\pokemongame\\img\\aggron-mega.gif","src\\main\\java\\com\\example\\pokemongame\\img\\male.png","src\\main\\java\\com\\example\\pokemongame\\img\\ps.png",180,180,false);
        Pokemons p3=new Pokemons("Arceus",128,"src\\main\\java\\com\\example\\pokemongame\\img\\arceus.gif","src\\main\\java\\com\\example\\pokemongame\\img\\male.png","src\\main\\java\\com\\example\\pokemongame\\img\\ps.png",190,190,false);
        Pokemons p4=new Pokemons("dialga",165,"src\\main\\java\\com\\example\\pokemongame\\img\\dialga.gif","src\\main\\java\\com\\example\\pokemongame\\img\\male.png","src\\main\\java\\com\\example\\pokemongame\\img\\ps.png",160,160,false);
        Pokemons p5=new Pokemons("Dragonite",140,"src\\main\\java\\com\\example\\pokemongame\\img\\dragonite.gif","src\\main\\java\\com\\example\\pokemongame\\img\\male.png","src\\main\\java\\com\\example\\pokemongame\\img\\ps.png",250,250,false);
        Pokemons p6=new Pokemons("Gyarados",142,"src\\main\\java\\com\\example\\pokemongame\\img\\gyarados-f.gif","src\\main\\java\\com\\example\\pokemongame\\img\\male.png","src\\main\\java\\com\\example\\pokemongame\\img\\ps.png",220,220,false);
        listaPokemons.add(p1);
        listaPokemons.add(p2);
        listaPokemons.add(p3);
        listaPokemons.add(p4);
        listaPokemons.add(p5);
        listaPokemons.add(p6);


        for (int i = 0; i < 6; i++) {

            File f = new File(listaPokemons.get(i).getImgenpokemon());
            listaPokemons.get(i).setImgenpokemon(f.toURI().toString());

            File f1 = new File("src\\main\\java\\com\\example\\pokemongame\\img\\male.png");
            listaPokemons.get(i).setImagengenero(f1.toURI().toString());

            File f2 = new File("src\\main\\java\\com\\example\\pokemongame\\img\\ps.png");
            listaPokemons.get(i).setImagenps(f2.toURI().toString());

        }
        return listaPokemons;
    }

    static public List<Pokemons> listaEnemigos(){
        List<Pokemons> enemigos=new ArrayList<>();
        Pokemons p1 = new Pokemons("Carnivine", 180, "src\\main\\java\\com\\example\\pokemongame\\img\\carnivine.gif", "src\\main\\java\\com\\example\\pokemongame\\img\\male.png", "src\\main\\java\\com\\example\\pokemongame\\img\\ps.png", 190, 190, false);
        Pokemons p2 = new Pokemons("Entei", 204, "src\\main\\java\\com\\example\\pokemongame\\img\\entei.gif", "src\\main\\java\\com\\example\\pokemongame\\img\\male.png", "src\\main\\java\\com\\example\\pokemongame\\img\\ps.png", 210, 210, false);
        Pokemons p3 = new Pokemons("Tordous", 250, "src\\main\\java\\com\\example\\pokemongame\\img\\tornadus.gif", "src\\main\\java\\com\\example\\pokemongame\\img\\male.png", "src\\main\\java\\com\\example\\pokemongame\\img\\ps.png", 250, 250, false);
        Pokemons p4 = new Pokemons("Weavile", 195, "src\\main\\java\\com\\example\\pokemongame\\img\\weavile-f.gif", "src\\main\\java\\com\\example\\pokemongame\\img\\male.png", "src\\main\\java\\com\\example\\pokemongame\\img\\ps.png", 220, 220, false);

        enemigos.add(p1);
        enemigos.add(p2);
        enemigos.add(p3);
        enemigos.add(p4);
        return enemigos;
    }



}


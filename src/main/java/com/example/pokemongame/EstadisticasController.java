package com.example.pokemongame;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.*;

public class EstadisticasController {


    @FXML
    private PieChart dañosgenerales;

    @FXML
    private BarChart graficobarras;

    public static HelloController helloController;


    ObservableList<PieChart.Data> piechartData = FXCollections.observableArrayList(
            new PieChart.Data("Daño total mis pokemons: " + helloController.danioPokemonsmios, helloController.danioPokemonsmios),
            new PieChart.Data("Daño total pokemons enemigos: " + helloController.danioPokemonsEnemigos, helloController.danioPokemonsEnemigos)
    );

    ObservableList<XYChart.Series<String, Number>> listapokesjugados = FXCollections.observableArrayList();




    public void pasarInfoEstadisticas(HelloController controller) {
        helloController = controller;
        dañosgenerales.setData(piechartData);
        graficobarras.setData(cargarBarras());

    }


    public void actualizar() {
        for (PieChart.Data d : piechartData) {
            if (d.getName().contains("Daño total mis pokemons")) {
                d.setName("Daño total mis pokemons: " + helloController.danioPokemonsmios);
                d.setPieValue(helloController.danioPokemonsmios);
            } else if (d.getName().contains("Daño total pokemons enemigos")) {
                d.setName("Daño total pokemons enemigos: " + helloController.danioPokemonsEnemigos);
                d.setPieValue(helloController.danioPokemonsEnemigos);
            }
        }
    }



    public void actualizarbarras(){
        for(int i=0;i<listapokesjugados.size();i++){
            listapokesjugados.get(i).getData().add(new XYChart.Data<>("",HelloController.listaController.get(i).pokemons.getVecesSeleccionado()));
        }
    }

    public ObservableList<XYChart.Series<String, Number>> cargarBarras() {

        XYChart.Series<String, Number> miutu = new XYChart.Series<String, Number>();
        XYChart.Series<String, Number> aggron = new XYChart.Series<String, Number>();
        XYChart.Series<String, Number> arceus = new XYChart.Series<String, Number>();
        XYChart.Series<String, Number> dialga = new XYChart.Series<String, Number>();
        XYChart.Series<String, Number> dragonite = new XYChart.Series<String, Number>();
        XYChart.Series<String, Number> gyarados = new XYChart.Series<String, Number>();
        miutu.setName("Miutu");
        aggron.setName("Aggron");
        arceus.setName("Arceus");
        dialga.setName("Dialga");
        dragonite.setName("Dragonite");
        gyarados.setName("Gyarados");
        miutu.getData().add(new XYChart.Data("",HelloController.listaController.get(0).pokemons.getVecesSeleccionado()));
        aggron.getData().add(new XYChart.Data("",HelloController.listaController.get(1).pokemons.getVecesSeleccionado()));
        arceus.getData().add(new XYChart.Data("",HelloController.listaController.get(2).pokemons.getVecesSeleccionado()));
        dialga.getData().add(new XYChart.Data("",HelloController.listaController.get(3).pokemons.getVecesSeleccionado()));
        dragonite.getData().add(new XYChart.Data("",HelloController.listaController.get(4).pokemons.getVecesSeleccionado()));
        gyarados.getData().add(new XYChart.Data("",HelloController.listaController.get(5).pokemons.getVecesSeleccionado()));
        listapokesjugados.addAll(miutu,aggron,arceus,dialga,dragonite,gyarados);

        return listapokesjugados;

    }


}

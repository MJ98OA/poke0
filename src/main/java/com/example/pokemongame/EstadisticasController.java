package com.example.pokemongame;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.image.Image;

import java.io.File;

public class EstadisticasController {

    @FXML
    private NumberAxis cantidadSeleccionado;

    @FXML
    private PieChart dañosgenerales;

    @FXML
    private CategoryAxis pokemonsSeleccionado;



    public void pasarInfoEstadisticas(HelloController controller) {
        iniciargrafidañosgenerales();
        controller.retornarPokemon();
    }

    public void iniciargrafidañosgenerales(){
        ObservableList<PieChart.Data> piechartData= FXCollections.observableArrayList(
                new PieChart.Data("Ataque total mis pokemons",100.0),
                new PieChart.Data("Ataque total enemigos",50.0)
        );
        dañosgenerales.setData(piechartData);
    }

}

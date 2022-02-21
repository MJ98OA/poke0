package com.example.pokemongame;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

public class HelloController<Private> implements Initializable {

    @FXML
    public AnchorPane actualizatodo;

    @FXML
    private GridPane escenarioPokemons;

    @FXML
    private Label textoelegir;

    @FXML
    public Label textosalir;

    @FXML
    public Button bBatalla;

    @FXML
    void actualizar(MouseEvent event) {

    }


    @FXML
    void iniciarBatalla(MouseEvent event) {


        try {

            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Escenario.fxml"));
            EscenarioController escenarioController = fxmlLoader.getController();

            Scene scene = new Scene(fxmlLoader.load(), 900, 550);
            Stage stage = new Stage();
            stage.setTitle("New Window");
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            System.out.println(e);

        }

    }




    ArrayList<ModelController> listaController = new ArrayList<>();

    Random r=new Random();
    public

    static List<Pokemons> listaPokemons = new ArrayList<>();

    ModelController modelController;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        listaPokemons.addAll(PokemonRepository.getData());

        int columnas=0;
        int filas=0;

        try {
        for(int i = 0; i< listaPokemons.size(); i++){
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("modelo.fxml"));

            AnchorPane anchorPane = fxmlLoader.load();

            ModelController modelController = fxmlLoader.getController();

            modelController.setData(listaPokemons.get(i), this);

            listaController.add(modelController);

            escenarioPokemons.add(anchorPane,columnas++,filas);
            if(columnas==3){
                columnas=0;
                filas++;
            }
        }

        } catch (IOException e) {
            e.printStackTrace();
        }

        bBatalla.setVisible(false);
    }

    public void pokemonSeleccionado() {

        for(ModelController controller: listaController) {
            controller.pokemonNoSeleccionado();
        }

    }

    public ModelController retornarPokemon(){
        ModelController controlador=null;
        for(ModelController controller:listaController){
            if(controller.pokemons.isSeleccionado())
                controlador=controller;
        }
        return controlador;
    }

    public void actualizarpokemon( ModelController model) throws IOException {
        for(int i=0;i<listaController.size();i++) {
            listaController.get(i).setData(model.pokemons,this);
        }

    }

}
package com.example.proyectopersistencia;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import logica.Domiciliario;
import logica.ManegementDomiciliario;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    ManegementDomiciliario mngDomiciliario;
    Run r;
    {
        r = new Run();
        mngDomiciliario= new ManegementDomiciliario();
    }
    @FXML
    private TableView<?> tablaDom;

    @FXML
    private TableColumn<Domiciliario, String> nameColumn;


    @FXML
    private TableView<String> tablaProd;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       // tablaProd.setDisable(true);
       // tablaDom.setDisable(true);
        //productos.setDisable(false);
       // domiciliarios.setDisable(false);
    }


    @FXML
    private TextField listaDomiciliarios;
    @FXML
    void listProductos(ActionEvent event) throws IOException {
    //tablaProd.setDisable(false);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("tablaProductos.fxml"));
        Scene scene;
        scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("SpeedFood");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void listDomiciliarios(ActionEvent event) throws IOException {
       // tablaDom.setDisable(false);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("tablaDomiciliarios.fxml"));
        Scene scene;
        scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("SpeedFood");
        stage.setScene(scene);
        stage.show();
        nameColumn.setCellValueFactory(new PropertyValueFactory<Domiciliario,String>("name"));

      //  lastNameColumn.setCellValueFactory(new PropertyValueFactory<Domicilier,String>("lastName"));
       // idColumn.setCellValueFactory(new PropertyValueFactory<Domicilier,Integer>("id"));
       // nPhoneColumn.setCellValueFactory(new PropertyValueFactory<Domicilier,Integer>("numberPhone"));
       // nOrdersColumn.setCellValueFactory(new PropertyValueFactory<Domicilier,Integer>("contOrders"));
      //  bonoColumn.setCellValueFactory(new PropertyValueFactory<Domicilier, Boolean>("bono"));
       // salaryColumn.setCellValueFactory(new PropertyValueFactory<Domicilier,Double>("salary"));
        //for (int i = 0; i < mngDomiciliario.getDomiciliarios().size(); i++) {
        //    tablaDom.getItems().add(String.valueOf(mngDomiciliario.getDomiciliarios().get(i)));
       // }

    }


    @FXML
    private Button domiciliarios;

    @FXML
    private Button productos;




}
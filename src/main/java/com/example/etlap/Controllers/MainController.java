package com.example.etlap.Controllers;

import com.example.etlap.Controller;
import com.example.etlap.Etlap;
import com.example.etlap.EtlapDB;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.SQLException;
import java.util.List;


public class MainController extends Controller {

    @FXML
    private TableView<Etlap> foodTable;

    @FXML
    private TableColumn<Etlap, String> colNev;

    @FXML
    private TableColumn<Etlap, String> colKat;

    @FXML
    private TableColumn<Etlap, Integer> colAr;
    private EtlapDB db;

    public void initialize(){
        colNev.setCellValueFactory(new PropertyValueFactory<>("nev"));
        colKat.setCellValueFactory(new PropertyValueFactory<>("kategoria"));
        colAr.setCellValueFactory(new PropertyValueFactory<>("ar"));
        try{
            db=new EtlapDB();
        }catch (SQLException e){
            hibaKiir(e);
        }
    }

    public void onHozzadasButtonClick(ActionEvent actionEvent) {
    }

    public void onModositasButtonClick(ActionEvent actionEvent) {
    }

    public void onTorlesButtonClick(ActionEvent actionEvent) {
    }

    private void etlapListaFeltolt(){
        try{
            List<Etlap> etlapList = db.getEtlapok();
        }catch (SQLException e){
            hibaKiir(e);
        }
    }
}
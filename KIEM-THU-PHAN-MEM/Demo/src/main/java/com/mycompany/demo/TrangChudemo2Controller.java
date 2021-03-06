/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.demo;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class TrangChudemo2Controller implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private BorderPane borderpane;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
        private void trangchu(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("TrangChu.fxml"));
        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void taobill(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("taobill.fxml"));
        borderpane.setCenter(root);
    }
    @FXML
    private void thanhtoan(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("thanhtoan.fxml"));
        borderpane.setCenter(root);
    }
    @FXML
    private void theKH(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("theKH.fxml"));
        borderpane.setCenter(root);
    }
    @FXML
    private void taikhoan(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("taikhoan.fxml"));
        borderpane.setCenter(root);
    }
    
    
}

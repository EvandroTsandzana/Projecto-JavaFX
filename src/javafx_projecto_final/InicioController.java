/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_projecto_final;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javax.swing.JButton;

/**
 *
 * @author Tsandzana
 */
public class InicioController implements Initializable {
    @FXML
    private JFXButton btn_add,btn_back;
 /*   private AnchorPane Registro;
    @FXML
    private AnchorPane Principal;*/
    @FXML
    private AnchorPane add_pane;
    
  @FXML  
  private void handleButtonAction(ActionEvent event){
      if(event.getSource()==btn_add){
      add_pane.setVisible(true);
      add_pane.toFront();
  }else
      if(event.getSource()==btn_back){
      add_pane.setVisible(false);    
      }
      }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

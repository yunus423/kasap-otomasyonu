package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ana_ekran {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_dprt;

    @FXML
    private Button btn_cstleri;

    @FXML
    private Button btn_ilt�m;

    @FXML
    private Button btn_m��t;

    @FXML
    private Button btn_st�;

    @FXML
    private Button btn_�l�n;

    @FXML
    private Button btn_�n;

    @FXML
    private Button btn_�prs;

    @FXML
    private Label lbl_kspoto;

    @FXML
    void btn_dprt_click(ActionEvent event) {
    	try {
      		 Stage stage=new Stage();
      		 
      		 AnchorPane pane1=(AnchorPane) FXMLLoader.load(getClass().getResource("departmanlar.fxml"));
      
      		 Scene scene1=new Scene(pane1);
      		 
      		 stage.setScene(scene1);
      		 
      		
      		
   	
      		 
      	stage.show();
      	} catch (Exception e) {
      
      	}
    	
    	
    	

    }

    @FXML
    void btn_cstleri_click(ActionEvent event) {
    	
    	try {
     		 Stage stage=new Stage();
     		 
     		 AnchorPane pane1=(AnchorPane) FXMLLoader.load(getClass().getResource("et_cstleri.fxml"));
     
     		 Scene scene1=new Scene(pane1);
     		 
     		 stage.setScene(scene1);
     		 
     		
  	
     		 
     	stage.show();
     	} catch (Exception e) {
     
     	}

    }

    @FXML
    void btn_ilt�m_click(ActionEvent event) {
    	
    	try {
    		 Stage stage=new Stage();
    		 
    		 AnchorPane pane1=(AnchorPane) FXMLLoader.load(getClass().getResource("�letsm.fxml"));
    
    		 Scene scene1=new Scene(pane1);
    		 
    		 stage.setScene(scene1);
    		 
    		
 	
    		 
    	stage.show();
    	} catch (Exception e) {
    
    	}

    }

    @FXML
    void btn_m��t_click(ActionEvent event) {
    	
    	try {
   		 Stage stage=new Stage();
   		 
   		 AnchorPane pane1=(AnchorPane) FXMLLoader.load(getClass().getResource("mstrler.fxml"));
   
   		 Scene scene1=new Scene(pane1);
   		 
   		 stage.setScene(scene1);
   		 
   		
	
   		 
   	stage.show();
   	} catch (Exception e) {
   
   	}

    }

    @FXML
    void btn_spr�_click(ActionEvent event) {
    	
    	try {
      		 Stage stage=new Stage();
      		 
      		 AnchorPane pane1=(AnchorPane) FXMLLoader.load(getClass().getResource("siparisler.fxml"));
      
      		 Scene scene1=new Scene(pane1);
      		
      		 stage.setScene(scene1);
      		 
      		
   	
      		 
      	stage.show();
      	} catch (Exception e) {
      
      	}

    }

    @FXML
    void btn_st�_click(ActionEvent event) {
    	try {
     		 Stage stage=new Stage();
     		 
     		 AnchorPane pane1=(AnchorPane) FXMLLoader.load(getClass().getResource("satislar.fxml"));
     
     		 Scene scene1=new Scene(pane1);
     		
     		 stage.setScene(scene1);
     		 
     		
  	
     		 
     	stage.show();
     	} catch (Exception e) {
     
     	}

    }

    @FXML
    void btn_�l�n_click(ActionEvent event) {
    	
    	
    	try {
      		 Stage stage=new Stage();
      		 
      		 AnchorPane pane1=(AnchorPane) FXMLLoader.load(getClass().getResource("calisanlar.fxml"));
      
      		 Scene scene1=new Scene(pane1);
      		 
      		 stage.setScene(scene1);
      		 
      		
   	
      		 
      	stage.show();
      	} catch (Exception e) {
      
      	}


    }

    @FXML
    void btn_�n_click(ActionEvent event) {
    	
    	try {
      		 Stage stage=new Stage();
      		 
      		 AnchorPane pane1=(AnchorPane) FXMLLoader.load(getClass().getResource("cftlknamuler.fxml"));
      
      		 Scene scene1=new Scene(pane1);
      		 
      		 stage.setScene(scene1);
      		 
      		
   	
      		 
      	stage.show();
      	} catch (Exception e) {
      
      	}
    	
    	

    }

    @FXML
    void initialize() {
        
    }

}


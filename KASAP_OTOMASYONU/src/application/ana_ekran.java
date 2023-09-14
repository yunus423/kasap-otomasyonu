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
    private Button btn_iltþm;

    @FXML
    private Button btn_müþt;

    @FXML
    private Button btn_stþ;

    @FXML
    private Button btn_çlþn;

    @FXML
    private Button btn_çn;

    @FXML
    private Button btn_þprs;

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
    void btn_iltþm_click(ActionEvent event) {
    	
    	try {
    		 Stage stage=new Stage();
    		 
    		 AnchorPane pane1=(AnchorPane) FXMLLoader.load(getClass().getResource("ýletsm.fxml"));
    
    		 Scene scene1=new Scene(pane1);
    		 
    		 stage.setScene(scene1);
    		 
    		
 	
    		 
    	stage.show();
    	} catch (Exception e) {
    
    	}

    }

    @FXML
    void btn_müþt_click(ActionEvent event) {
    	
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
    void btn_sprþ_click(ActionEvent event) {
    	
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
    void btn_stþ_click(ActionEvent event) {
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
    void btn_çlþn_click(ActionEvent event) {
    	
    	
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
    void btn_çn_click(ActionEvent event) {
    	
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


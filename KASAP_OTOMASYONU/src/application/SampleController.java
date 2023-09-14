
package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SampleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_login;

    @FXML
    private Label lb1;

    @FXML
    private Label lb2;

    @FXML
    private Label lbl_kasap;

    @FXML
    private Label lbl_sfrunt;

    @FXML
    private AnchorPane login;

    @FXML
    private Button temizlebuton;

    @FXML
    private TextArea textarea;

    @FXML
    private TextField txt1;

    @FXML
    private TextField txt2;

    @FXML
    void l(MouseEvent event) {

    }

    @FXML
    void login_click(ActionEvent event) {
    	String username="yunus47@iste.edu.tr";
    	String sifre ="mardin47";
    	
    	
    	
    	
    	
    	 if (txt1.getText().isEmpty()) {
			Alert alert =new Alert(AlertType.ERROR);
        	alert.setTitle("iste otomasyon");
        	alert.setHeaderText("giriþ baþarýsýz !");
        	alert.setContentText("boþ hibir þey girmediniz!");
        	
          //alert.showAndWait();
        	alert.show();
    		
		}else if (txt1.getText().contains("@iste.edu.tr")==false) {
			
		}
    	 
  		
    	 else if (txt1.getText().equals(username)&&txt2.getText().equals(sifre)) {
     		if (txt1.getText().contains("@iste.edu.tr")) {
     			TextInputDialog dialog = new TextInputDialog("sifre belirleme");
             	
                dialog.setTitle("Ýste otomasyon");
                dialog.setHeaderText("textfielde ile deger yollama");
                dialog.setContentText("Telefonunuza girilen onay metnini giriniz...");
               	
                textarea.setText("HOÞGELDÝNÝZ YUNUS DOÐAN ");    
             	 try {
              		 Stage stage=new Stage();
              		 
              		 AnchorPane pane1=(AnchorPane) FXMLLoader.load(getClass().getResource("ana_ekran.fxml"));
              		 
              		 Scene scene1=new Scene(pane1);
              		 
              		 stage.setScene(scene1);
              		 
              		
           	
              		 
              	stage.show();
              	} catch (Exception e) {
              
              	}
            	
			}
     		
     		else  {
      			Alert alert =new Alert(AlertType.ERROR);
             	alert.setTitle("iste otomasyon");
             	alert.setHeaderText("giriþ baþarýsýz !");
             	alert.setContentText("kullanýcý adý @iste.edu.tr uzantýlý olmalý!");
             	
               //alert.showAndWait();
             	alert.show();
         		
    			}
     		
 		}
    	 else  {
    		 Alert alert =new Alert(AlertType.ERROR);
         	alert.setTitle("iste otomasyon");
         	alert.setHeaderText("giriþ baþarýsýz !");
         	alert.setContentText("Girilen þifre veya kullanýcý adý hatalý !");
         	
           //alert.showAndWait();
         	alert.show();
		}
    	
  
    }


    

    @FXML
    void temizle_click(ActionEvent event) {

    }

    @FXML
    void initialize() {
 

    }

}

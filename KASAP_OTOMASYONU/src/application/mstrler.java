package application;

import java.net.URL;
import java.util.ResourceBundle;

import application.calisanlar.kayitlar3;
import application.et_cstleri.kayýtlar;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.control.cell.PropertyValueFactory;

public class mstrler {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_ekle;

    @FXML
    private Button btn_göster;

    @FXML
    private Button btn_güncelle;

    @FXML
    private Button btn_sil;

    @FXML
    private Label lbl_mstrl;

    @FXML
    private TextField soyad;

    @FXML
    private TableColumn<kayitlar1, String> tabloC_ad;

    @FXML
    private TableColumn<kayitlar1, String> tabloC_id;

    @FXML
    private TableColumn<kayitlar1, String> tabloC_sonalýþ;

    @FXML
    private TableColumn<kayitlar1, String> tabloC_soyad;

    @FXML
    private TableColumn<kayitlar1, String> tabloC_tel;
    
    @FXML
    private TableView<kayitlar1> tabloV_müþteri;

    @FXML
    private TextField txt_ad;

    @FXML
    private TextField txt_id;

    @FXML
    private TextField txt_sonalýs;

    @FXML
    private TextField txt_tel;
    
    
    ObservableList<kayitlar1>veriler1;

   	private Labeled lbl_deger;

    

    @FXML
    void btn_ekle_click(ActionEvent event) {
    	
    	
     	veriler1=FXCollections.observableArrayList();
       	veriler1.add(new kayitlar1(txt_id.getText(),txt_ad.getText(),soyad.getText(),txt_tel.getText(),txt_sonalýs.getText()));
       	tabloV_müþteri.getItems().addAll(veriler1);

    }

    @FXML
    void btn_göster(ActionEvent event) {
    	
    	kayitlar1 kayit=new kayitlar1();
    	if(tabloV_müþteri.getSelectionModel().getSelectedIndex()!=-1) {
    		kayit=(kayitlar1) tabloV_müþteri.getItems().get(tabloV_müþteri.getSelectionModel().getSelectedIndex());
    		
    		lbl_deger.setText("ID:"+kayit.getÝD()+ " Adý:"+kayit.getAD()+ "SOYAD:"+kayit.getSOYAD()+"TEL:"+kayit.getTEL()+ " SON_ALIÞ:"+kayit.getSON_ALIÞ());
    	}
    	else {
    		lbl_deger.setText("Herhangi bir kayýt seçilmedi....");
    	}

    }

    @FXML
    void btn_güncelle_click(ActionEvent event) {
    	kayitlar1 kayit=new kayitlar1();
    	if(tabloV_müþteri.getSelectionModel().getSelectedIndex()!=-1) {
    		kayit=(kayitlar1) tabloV_müþteri.getItems().get(tabloV_müþteri.getSelectionModel().getSelectedIndex());
    
    		
    		kayitlar1 kk=new kayitlar1(txt_id.getText(),txt_ad.getText(),soyad.getText(),txt_tel.getText(),txt_sonalýs.getText());
    		int sira=tabloV_müþteri.getSelectionModel().getSelectedIndex();
    		tabloV_müþteri.getItems().set(sira, kk);
    	}
    	
    }

    @FXML
    void btn_sil_click(ActionEvent event) {
    	
    	   ObservableList<kayitlar1> secilenKayit, tumKayitlar;
          	tumKayitlar=tabloV_müþteri.getItems();
          	secilenKayit=tabloV_müþteri.getSelectionModel().getSelectedItems();
          	
          	secilenKayit.forEach(tumKayitlar::remove);

    }

    @FXML
    void tabloC_ad_click(ActionEvent event) {

    }

    @FXML
    void tabloC_id_click(ActionEvent event) {

    }

    @FXML
    void tabloC_sonalýþ_click(ActionEvent event) {

    }

    @FXML
    void tabloC_soyad_click(ActionEvent event) {

    }

    @FXML
    void tabloC_tel_click(ActionEvent event) {

    }

    @FXML
    void initialize() {
btn_ekle.setTooltip(new Tooltip("kayýt eklemeyi saðlar"));
      
    	
       	Tooltip tip=new Tooltip();
     
           tip.setText("güncelleme iþlemi yapar");
           btn_güncelle.setTooltip(tip);
          

      		btn_sil.setTooltip(new Tooltip("kayýt silmeyi saðlar"));
      		

    	
    	
    	
      	    veriler1=FXCollections.observableArrayList();
      	    
      	    veriler1.add(new kayitlar1("1","yunus","dogan","5457389200","27.11.2021"));
      	      
      	    veriler1.add(new kayitlar1("2","enes","demir","5458935467","12.01.2022"));
      	    	
      	    veriler1.add(new kayitlar1("3","yusuf","çam","5457632893","11.02.2022"));
      	    
      	    veriler1.add(new kayitlar1("4","mehmet","gümüþ","5456789300","23.02.2022"));
      	    	
      	 
      	    
      	    
      	    
      		tabloC_id.setCellValueFactory(new PropertyValueFactory<>("ÝD"));
      	    
      	    
      	 tabloC_ad.setCellValueFactory (new PropertyValueFactory<>("AD"));
      	    
      	    
      	 tabloC_soyad.setCellValueFactory (new PropertyValueFactory<>("SOYAD"));
      	 tabloC_tel.setCellValueFactory (new PropertyValueFactory<>("TEL"));
      	 tabloC_sonalýþ.setCellValueFactory (new PropertyValueFactory<>("SON_ALIÞ"));
      	
      	 
      	    tabloV_müþteri.setItems(veriler1);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
        
    }
    
    public static class kayitlar1{
       	private String ÝD;
       	private String AD;
       	private String SOYAD;
       	private String TEL;
       	private String SON_ALIÞ;
       	
       	
   kayitlar1(String ÝD,String AD,String SOYAD,String TEL,String SON_ALIÞ ) {
	   
   	
      	this.ÝD=ÝD;
      	this.AD=AD;
      	this.SOYAD=SOYAD;
      	this.TEL=TEL;
      	this.SON_ALIÞ=SON_ALIÞ;
      	
	   
	   
   }


public kayitlar1() {
	// TODO Auto-generated constructor stub
}


public String getÝD() {
	return ÝD;
}


public void setÝD(String iD) {
	ÝD = iD;
}


public String getAD() {
	return AD;
}


public void setAD(String aD) {
	AD = aD;
}


public String getSOYAD() {
	return SOYAD;
}


public void setSOYAD(String sOYAD) {
	SOYAD = sOYAD;
}


public String getTEL() {
	return TEL;
}


public void setTEL(String tEL) {
	TEL = tEL;
}


public String getSON_ALIÞ() {
	return SON_ALIÞ;
}


public void setSON_ALIÞ(String sON_ALIÞ) {
	SON_ALIÞ = sON_ALIÞ;
}
  
   
	
}
    
 
    

}

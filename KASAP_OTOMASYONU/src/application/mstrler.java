package application;

import java.net.URL;
import java.util.ResourceBundle;

import application.calisanlar.kayitlar3;
import application.et_cstleri.kay�tlar;
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
    private Button btn_g�ster;

    @FXML
    private Button btn_g�ncelle;

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
    private TableColumn<kayitlar1, String> tabloC_sonal��;

    @FXML
    private TableColumn<kayitlar1, String> tabloC_soyad;

    @FXML
    private TableColumn<kayitlar1, String> tabloC_tel;
    
    @FXML
    private TableView<kayitlar1> tabloV_m��teri;

    @FXML
    private TextField txt_ad;

    @FXML
    private TextField txt_id;

    @FXML
    private TextField txt_sonal�s;

    @FXML
    private TextField txt_tel;
    
    
    ObservableList<kayitlar1>veriler1;

   	private Labeled lbl_deger;

    

    @FXML
    void btn_ekle_click(ActionEvent event) {
    	
    	
     	veriler1=FXCollections.observableArrayList();
       	veriler1.add(new kayitlar1(txt_id.getText(),txt_ad.getText(),soyad.getText(),txt_tel.getText(),txt_sonal�s.getText()));
       	tabloV_m��teri.getItems().addAll(veriler1);

    }

    @FXML
    void btn_g�ster(ActionEvent event) {
    	
    	kayitlar1 kayit=new kayitlar1();
    	if(tabloV_m��teri.getSelectionModel().getSelectedIndex()!=-1) {
    		kayit=(kayitlar1) tabloV_m��teri.getItems().get(tabloV_m��teri.getSelectionModel().getSelectedIndex());
    		
    		lbl_deger.setText("ID:"+kayit.get�D()+ " Ad�:"+kayit.getAD()+ "SOYAD:"+kayit.getSOYAD()+"TEL:"+kayit.getTEL()+ " SON_ALI�:"+kayit.getSON_ALI�());
    	}
    	else {
    		lbl_deger.setText("Herhangi bir kay�t se�ilmedi....");
    	}

    }

    @FXML
    void btn_g�ncelle_click(ActionEvent event) {
    	kayitlar1 kayit=new kayitlar1();
    	if(tabloV_m��teri.getSelectionModel().getSelectedIndex()!=-1) {
    		kayit=(kayitlar1) tabloV_m��teri.getItems().get(tabloV_m��teri.getSelectionModel().getSelectedIndex());
    
    		
    		kayitlar1 kk=new kayitlar1(txt_id.getText(),txt_ad.getText(),soyad.getText(),txt_tel.getText(),txt_sonal�s.getText());
    		int sira=tabloV_m��teri.getSelectionModel().getSelectedIndex();
    		tabloV_m��teri.getItems().set(sira, kk);
    	}
    	
    }

    @FXML
    void btn_sil_click(ActionEvent event) {
    	
    	   ObservableList<kayitlar1> secilenKayit, tumKayitlar;
          	tumKayitlar=tabloV_m��teri.getItems();
          	secilenKayit=tabloV_m��teri.getSelectionModel().getSelectedItems();
          	
          	secilenKayit.forEach(tumKayitlar::remove);

    }

    @FXML
    void tabloC_ad_click(ActionEvent event) {

    }

    @FXML
    void tabloC_id_click(ActionEvent event) {

    }

    @FXML
    void tabloC_sonal��_click(ActionEvent event) {

    }

    @FXML
    void tabloC_soyad_click(ActionEvent event) {

    }

    @FXML
    void tabloC_tel_click(ActionEvent event) {

    }

    @FXML
    void initialize() {
btn_ekle.setTooltip(new Tooltip("kay�t eklemeyi sa�lar"));
      
    	
       	Tooltip tip=new Tooltip();
     
           tip.setText("g�ncelleme i�lemi yapar");
           btn_g�ncelle.setTooltip(tip);
          

      		btn_sil.setTooltip(new Tooltip("kay�t silmeyi sa�lar"));
      		

    	
    	
    	
      	    veriler1=FXCollections.observableArrayList();
      	    
      	    veriler1.add(new kayitlar1("1","yunus","dogan","5457389200","27.11.2021"));
      	      
      	    veriler1.add(new kayitlar1("2","enes","demir","5458935467","12.01.2022"));
      	    	
      	    veriler1.add(new kayitlar1("3","yusuf","�am","5457632893","11.02.2022"));
      	    
      	    veriler1.add(new kayitlar1("4","mehmet","g�m��","5456789300","23.02.2022"));
      	    	
      	 
      	    
      	    
      	    
      		tabloC_id.setCellValueFactory(new PropertyValueFactory<>("�D"));
      	    
      	    
      	 tabloC_ad.setCellValueFactory (new PropertyValueFactory<>("AD"));
      	    
      	    
      	 tabloC_soyad.setCellValueFactory (new PropertyValueFactory<>("SOYAD"));
      	 tabloC_tel.setCellValueFactory (new PropertyValueFactory<>("TEL"));
      	 tabloC_sonal��.setCellValueFactory (new PropertyValueFactory<>("SON_ALI�"));
      	
      	 
      	    tabloV_m��teri.setItems(veriler1);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
        
    }
    
    public static class kayitlar1{
       	private String �D;
       	private String AD;
       	private String SOYAD;
       	private String TEL;
       	private String SON_ALI�;
       	
       	
   kayitlar1(String �D,String AD,String SOYAD,String TEL,String SON_ALI� ) {
	   
   	
      	this.�D=�D;
      	this.AD=AD;
      	this.SOYAD=SOYAD;
      	this.TEL=TEL;
      	this.SON_ALI�=SON_ALI�;
      	
	   
	   
   }


public kayitlar1() {
	// TODO Auto-generated constructor stub
}


public String get�D() {
	return �D;
}


public void set�D(String iD) {
	�D = iD;
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


public String getSON_ALI�() {
	return SON_ALI�;
}


public void setSON_ALI�(String sON_ALI�) {
	SON_ALI� = sON_ALI�;
}
  
   
	
}
    
 
    

}

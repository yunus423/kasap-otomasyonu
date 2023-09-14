
    
package application;

import java.net.URL;
import java.util.ResourceBundle;

import application.calisanlar.kayitlar3;
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

public class satislar {

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
    private Label lbl_sat��lar�m�z;

    @FXML
    private TableColumn<kayitlar6, String> tableC_adet;

    @FXML
    private TableColumn<kayitlar6, String> tableC_al��fiyat�;

    @FXML
    private TableColumn<kayitlar6,String > tableC_sat��fiyat�;

    @FXML
    private TableColumn<kayitlar6, String> tableC_tutar;

    @FXML
    private TableColumn<kayitlar6, String> tableC_�r�nad�;

    @FXML
    private TableView<kayitlar6> tableV_sat��lar�m�z;

    @FXML
    private TextField txt_adet;

    @FXML
    private TextField txt_al��fiyat�;

    @FXML
    private TextField txt_sat��fiyat�;

    @FXML
    private TextField txt_tutar;

    @FXML
    private TextField txt_�r�nad�;

    ObservableList<kayitlar6>veriler6;

   	private Labeled lbl_deger;

    @FXML
    void btn_ekle_click(ActionEvent event) {
    	
    	
    	
    	veriler6=FXCollections.observableArrayList();
       	veriler6.add(new kayitlar6(txt_�r�nad�.getText(),txt_al��fiyat�.getText(),txt_sat��fiyat�.getText(),txt_adet.getText(),txt_tutar.getText()));
       	tableV_sat��lar�m�z.getItems().addAll(veriler6);

    }

    @FXML
    void btn_g�ster(ActionEvent event) {
    	
    	
    	
    	kayitlar6 kayit=new kayitlar6();
    	if(tableV_sat��lar�m�z.getSelectionModel().getSelectedIndex()!=-1) {
    		kayit=(kayitlar6) tableV_sat��lar�m�z.getItems().get(tableV_sat��lar�m�z.getSelectionModel().getSelectedIndex());
    		
    		lbl_deger.setText("�r�n_ad�:"+kayit.get�r�n_ad�()+ " al�s_fiyat�:"+kayit.getAl��_fiyat�()+ "sat��_fiyat�:"+kayit.getSat��_fiyat�()+"adet:"+kayit.getAdet()+ " tutar:"+kayit.getTutar());
    	}
    	else {
    		lbl_deger.setText("Herhangi bir kay�t se�ilmedi....");
    	}

    
    }

    @FXML
    void btn_g�ncelle_click(ActionEvent event) {
    	
    	
    	kayitlar6 kayit=new kayitlar6();
    	if(tableV_sat��lar�m�z.getSelectionModel().getSelectedIndex()!=-1) {
    		kayit=(kayitlar6) tableV_sat��lar�m�z.getItems().get(tableV_sat��lar�m�z.getSelectionModel().getSelectedIndex());
    
    		
    		kayitlar6 kk=new kayitlar6(txt_�r�nad�.getText(),txt_al��fiyat�.getText(),txt_sat��fiyat�.getText(),txt_adet.getText(),txt_tutar.getText());
    		int sira=tableV_sat��lar�m�z.getSelectionModel().getSelectedIndex();
    		tableV_sat��lar�m�z.getItems().set(sira, kk);
    	}
    	
    	

    	
    	
    	

    }

    @FXML
    void btn_sil_click(ActionEvent event) {
    	
    	  ObservableList<kayitlar6> secilenKayit, tumKayitlar;
        	tumKayitlar=tableV_sat��lar�m�z.getItems();
        	secilenKayit=tableV_sat��lar�m�z.getSelectionModel().getSelectedItems();
        	
        	secilenKayit.forEach(tumKayitlar::remove);

    	
    	
    	
    	
    	

    }

    @FXML
    void tableC_adet_click(ActionEvent event) {

    }

    @FXML
    void tableC_al��fiyat�_click(ActionEvent event) {

    }

    @FXML
    void tableC_durum_click(ActionEvent event) {

    }

    @FXML
    void tableC_sat��fiyat�_click(ActionEvent event) {

    }

    @FXML
    void tableC_tutar_click(ActionEvent event) {

    }

    @FXML
    void tableC_�r�nad�_click(ActionEvent event) {

    }

    @FXML
    void initialize() {
   
    	
    	
    	
btn_ekle.setTooltip(new Tooltip("kay�t eklemeyi sa�lar"));
      
    	
       	Tooltip tip=new Tooltip();
     
           tip.setText("g�ncelleme i�lemi yapar");
           btn_g�ncelle.setTooltip(tip);
          

      		btn_sil.setTooltip(new Tooltip("kay�t silmeyi sa�lar"));
      		

    	
    	
    	
      	    veriler6=FXCollections.observableArrayList();
      	    
      	    veriler6.add(new kayitlar6("kuzu_ku�bas�","100","120","2","40"));
      	    
      	    veriler6.add(new kayitlar6("kuzu_ci�er","80","95","4","60"));
      	    	
      	    veriler6.add(new kayitlar6("tavuk_kanat","30","40","1","10"));
      	    
      	    veriler6.add(new kayitlar6("tavuk_g���s","25","40","2","30"));
      	    	
      	 
      	    
      	    
      	    
      		tableC_�r�nad�.setCellValueFactory(new PropertyValueFactory<>("�r�n_ad�"));
      	    
      	    
      	 tableC_al��fiyat�.setCellValueFactory (new PropertyValueFactory<>("al��_fiyat�"));
      	    
      	    
      	 tableC_sat��fiyat�.setCellValueFactory (new PropertyValueFactory<>("sat��_fiyat�"));
      	 tableC_adet.setCellValueFactory (new PropertyValueFactory<>("adet"));
      	 tableC_tutar.setCellValueFactory (new PropertyValueFactory<>("tutar"));
      	
      	 
      	    tableV_sat��lar�m�z.setItems(veriler6);
    	
    	
    	
    	
        
    }
    
    
    public static class kayitlar6{
       	private String �r�n_ad�;
       	private String al��_fiyat�;
       	private String sat��_fiyat�;
       	private String adet;
       	private String tutar;
       	
       	
   kayitlar6(String �r�n_ad�,String al��_fiyat�,String sat��_fiyat�,String adet,String tutar ) {
	   
   	
      	this.�r�n_ad�=�r�n_ad�;
      	this.al��_fiyat�=al��_fiyat�;
      	this.sat��_fiyat�=sat��_fiyat�;
      	this.adet=adet;
      	this.tutar=tutar;
      	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   }


public kayitlar6() {
	// TODO Auto-generated constructor stub
}


public String get�r�n_ad�() {
	return �r�n_ad�;
}


public void set�r�n_Ad�(String �r�n_ad�) {
	this.�r�n_ad� = �r�n_ad�;
}


public String getAl��_fiyat�() {
	return al��_fiyat�;
}


public void setAl��_fiyat�(String al��_fiyat�) {
	this.al��_fiyat� = al��_fiyat�;
}


public String getSat��_fiyat�() {
	return sat��_fiyat�;
}


public void setSat��_fiyat�(String sat��_fiyat�) {
	this.sat��_fiyat� = sat��_fiyat�;
}


public String getAdet() {
	return adet;
}


public void setAdet(String adet) {
	this.adet = adet;
}


public String getTutar() {
	return tutar;
}


public void setTutar(String tutar) {
	this.tutar = tutar;
}
   
   
   
   
   
   
   
    }
    
    
    
    

}

    



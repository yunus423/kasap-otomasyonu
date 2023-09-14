
    
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
    private Button btn_göster;

    @FXML
    private Button btn_güncelle;

    @FXML
    private Button btn_sil;

    @FXML
    private Label lbl_satýþlarýmýz;

    @FXML
    private TableColumn<kayitlar6, String> tableC_adet;

    @FXML
    private TableColumn<kayitlar6, String> tableC_alýþfiyatý;

    @FXML
    private TableColumn<kayitlar6,String > tableC_satýþfiyatý;

    @FXML
    private TableColumn<kayitlar6, String> tableC_tutar;

    @FXML
    private TableColumn<kayitlar6, String> tableC_ürünadý;

    @FXML
    private TableView<kayitlar6> tableV_satýþlarýmýz;

    @FXML
    private TextField txt_adet;

    @FXML
    private TextField txt_alýþfiyatý;

    @FXML
    private TextField txt_satýþfiyatý;

    @FXML
    private TextField txt_tutar;

    @FXML
    private TextField txt_ürünadý;

    ObservableList<kayitlar6>veriler6;

   	private Labeled lbl_deger;

    @FXML
    void btn_ekle_click(ActionEvent event) {
    	
    	
    	
    	veriler6=FXCollections.observableArrayList();
       	veriler6.add(new kayitlar6(txt_ürünadý.getText(),txt_alýþfiyatý.getText(),txt_satýþfiyatý.getText(),txt_adet.getText(),txt_tutar.getText()));
       	tableV_satýþlarýmýz.getItems().addAll(veriler6);

    }

    @FXML
    void btn_göster(ActionEvent event) {
    	
    	
    	
    	kayitlar6 kayit=new kayitlar6();
    	if(tableV_satýþlarýmýz.getSelectionModel().getSelectedIndex()!=-1) {
    		kayit=(kayitlar6) tableV_satýþlarýmýz.getItems().get(tableV_satýþlarýmýz.getSelectionModel().getSelectedIndex());
    		
    		lbl_deger.setText("ürün_adý:"+kayit.getÜrün_adý()+ " alýs_fiyatý:"+kayit.getAlýþ_fiyatý()+ "satýþ_fiyatý:"+kayit.getSatýþ_fiyatý()+"adet:"+kayit.getAdet()+ " tutar:"+kayit.getTutar());
    	}
    	else {
    		lbl_deger.setText("Herhangi bir kayýt seçilmedi....");
    	}

    
    }

    @FXML
    void btn_güncelle_click(ActionEvent event) {
    	
    	
    	kayitlar6 kayit=new kayitlar6();
    	if(tableV_satýþlarýmýz.getSelectionModel().getSelectedIndex()!=-1) {
    		kayit=(kayitlar6) tableV_satýþlarýmýz.getItems().get(tableV_satýþlarýmýz.getSelectionModel().getSelectedIndex());
    
    		
    		kayitlar6 kk=new kayitlar6(txt_ürünadý.getText(),txt_alýþfiyatý.getText(),txt_satýþfiyatý.getText(),txt_adet.getText(),txt_tutar.getText());
    		int sira=tableV_satýþlarýmýz.getSelectionModel().getSelectedIndex();
    		tableV_satýþlarýmýz.getItems().set(sira, kk);
    	}
    	
    	

    	
    	
    	

    }

    @FXML
    void btn_sil_click(ActionEvent event) {
    	
    	  ObservableList<kayitlar6> secilenKayit, tumKayitlar;
        	tumKayitlar=tableV_satýþlarýmýz.getItems();
        	secilenKayit=tableV_satýþlarýmýz.getSelectionModel().getSelectedItems();
        	
        	secilenKayit.forEach(tumKayitlar::remove);

    	
    	
    	
    	
    	

    }

    @FXML
    void tableC_adet_click(ActionEvent event) {

    }

    @FXML
    void tableC_alýþfiyatý_click(ActionEvent event) {

    }

    @FXML
    void tableC_durum_click(ActionEvent event) {

    }

    @FXML
    void tableC_satýþfiyatý_click(ActionEvent event) {

    }

    @FXML
    void tableC_tutar_click(ActionEvent event) {

    }

    @FXML
    void tableC_ürünadý_click(ActionEvent event) {

    }

    @FXML
    void initialize() {
   
    	
    	
    	
btn_ekle.setTooltip(new Tooltip("kayýt eklemeyi saðlar"));
      
    	
       	Tooltip tip=new Tooltip();
     
           tip.setText("güncelleme iþlemi yapar");
           btn_güncelle.setTooltip(tip);
          

      		btn_sil.setTooltip(new Tooltip("kayýt silmeyi saðlar"));
      		

    	
    	
    	
      	    veriler6=FXCollections.observableArrayList();
      	    
      	    veriler6.add(new kayitlar6("kuzu_kuþbasý","100","120","2","40"));
      	    
      	    veriler6.add(new kayitlar6("kuzu_ciðer","80","95","4","60"));
      	    	
      	    veriler6.add(new kayitlar6("tavuk_kanat","30","40","1","10"));
      	    
      	    veriler6.add(new kayitlar6("tavuk_göðüs","25","40","2","30"));
      	    	
      	 
      	    
      	    
      	    
      		tableC_ürünadý.setCellValueFactory(new PropertyValueFactory<>("ürün_adý"));
      	    
      	    
      	 tableC_alýþfiyatý.setCellValueFactory (new PropertyValueFactory<>("alýþ_fiyatý"));
      	    
      	    
      	 tableC_satýþfiyatý.setCellValueFactory (new PropertyValueFactory<>("satýþ_fiyatý"));
      	 tableC_adet.setCellValueFactory (new PropertyValueFactory<>("adet"));
      	 tableC_tutar.setCellValueFactory (new PropertyValueFactory<>("tutar"));
      	
      	 
      	    tableV_satýþlarýmýz.setItems(veriler6);
    	
    	
    	
    	
        
    }
    
    
    public static class kayitlar6{
       	private String ürün_adý;
       	private String alýþ_fiyatý;
       	private String satýþ_fiyatý;
       	private String adet;
       	private String tutar;
       	
       	
   kayitlar6(String ürün_adý,String alýþ_fiyatý,String satýþ_fiyatý,String adet,String tutar ) {
	   
   	
      	this.ürün_adý=ürün_adý;
      	this.alýþ_fiyatý=alýþ_fiyatý;
      	this.satýþ_fiyatý=satýþ_fiyatý;
      	this.adet=adet;
      	this.tutar=tutar;
      	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   }


public kayitlar6() {
	// TODO Auto-generated constructor stub
}


public String getÜrün_adý() {
	return ürün_adý;
}


public void setÜrün_Adý(String ürün_adý) {
	this.ürün_adý = ürün_adý;
}


public String getAlýþ_fiyatý() {
	return alýþ_fiyatý;
}


public void setAlýþ_fiyatý(String alýþ_fiyatý) {
	this.alýþ_fiyatý = alýþ_fiyatý;
}


public String getSatýþ_fiyatý() {
	return satýþ_fiyatý;
}


public void setSatýþ_fiyatý(String satýþ_fiyatý) {
	this.satýþ_fiyatý = satýþ_fiyatý;
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

    



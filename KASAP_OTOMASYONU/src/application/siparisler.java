
package application;

import java.net.URL;
import java.util.ResourceBundle;

import application.calisanlar.kayitlar3;
import application.mstrler.kayitlar1;
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

public class siparisler<kayýtlar5> {

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
    private Label lbl_sipariþler;

    @FXML
    private TableColumn<kayýtlar5, String> tableC_açýklama_click;

    @FXML
    private TableColumn<kayýtlar5, String> tableC_fiyat_click;

    @FXML
    private TableColumn<kayýtlar5, String> tableC_miktar_click;

    @FXML
    private TableColumn<kayýtlar5, String> tableC_sipariþno_click;

    @FXML
    private TableColumn<kayýtlar5, String> tableC_sipariþtarihi_click;

    @FXML
    private TableColumn<kayýtlar5, String> tableC_ürünkodu_click;

    @FXML
    private TableView<kayýtlar5> tableV_sipariþler;

    @FXML
    private TextField txt_açýklama;

    @FXML
    private TextField txt_fiyat;

    @FXML
    private TextField txt_miktar;

    @FXML
    private TextField txt_sipariþ_no;

    @FXML
    private TextField txt_sipariþtarihi;

    @FXML
    private TextField txt_ürün_kodu;

    
    
    ObservableList<kayýtlar5> veriler5;
  

	private Labeled lbl_deger;

	


    
    
    @FXML
    void btn_ekle_click(ActionEvent event) {
    	
    	veriler5=FXCollections.observableArrayList();
       	veriler5.add(new kayýtlar5(txt_sipariþ_no.getText(),txt_ürün_kodu.getText(),txt_miktar.getText(),txt_fiyat.getText(),txt_açýklama.getText(),txt_sipariþtarihi.getText()));
       	tableV_sipariþler.getItems().addAll(veriler5);

    	
    	
    	

    }

    @FXML
    void btn_göster_click(ActionEvent event) {
    	
    	
    	
    	kayýtlar5 kayit=new kayýtlar5();
    	if(tableV_sipariþler.getSelectionModel().getSelectedIndex()!=-1) {
    		kayit=(kayýtlar5) tableV_sipariþler.getItems().get(tableV_sipariþler.getSelectionModel().getSelectedIndex());
    		
    		lbl_deger.setText("ispariþ_no:"+kayit.getSipariþ_no()+ " ürün=kodu:"+kayit.getÜrün_kodu()+ "miktar:"+kayit.getMiktar()+"fiyat:"+kayit.getFiyat()+ " SON_ALIÞ:"+kayit.getSON_ALIÞ()+" sipariþ_tarihi:"+kayit.getSipariþ_tarihi());
    	}
    	else {
    		lbl_deger.setText("Herhangi bir kayýt seçilmedi....");
    	}
    	
    	
    	
    	

    }

    @FXML
    void btn_güncelle_click(ActionEvent event) {
    	
    	kayýtlar5 kayit=new kayýtlar5();
    	if(tableV_sipariþler.getSelectionModel().getSelectedIndex()!=-1) {
    		kayit=(kayýtlar5) tableV_sipariþler.getItems().get(tableV_sipariþler.getSelectionModel().getSelectedIndex());
    
    		
    		kayýtlar5 kk=new kayýtlar5(txt_sipariþ_no.getText(),txt_ürün_kodu.getText(),txt_miktar.getText(),txt_fiyat.getText(),txt_açýklama.getText(),txt_sipariþtarihi.getText());
    		int sira=tableV_sipariþler.getSelectionModel().getSelectedIndex();
    		tableV_sipariþler.getItems().set(sira, kk);
    	}
   

    }

    @FXML
    void btn_sil_click(ActionEvent event) {
    	
    	
    	
    	
    	ObservableList<kayýtlar5> secilenKayit, tumKayitlar;
      	tumKayitlar=tableV_sipariþler.getItems();
      	secilenKayit=tableV_sipariþler.getSelectionModel().getSelectedItems();
      	
      	secilenKayit.forEach(tumKayitlar::remove);
    	
    	
    	
    	
    	
    	

    }

    @FXML
    void initialize() {
    	
btn_ekle.setTooltip(new Tooltip("kayýt eklemeyi saðlar"));
      
    	
       	Tooltip tip=new Tooltip();
     
           tip.setText("güncelleme iþlemi yapar");
           btn_güncelle.setTooltip(tip);
          

      		btn_sil.setTooltip(new Tooltip("kayýt silmeyi saðlar"));
      		

    	
    	
    	
      	    veriler5=FXCollections.observableArrayList();
      	    
      	    veriler5.add((kayýtlar5) new kayýtlar5("1","10","1 kg","20"," tavuk kanat","12.02.2022"));
      	      
      	    veriler5.add((kayýtlar5) new kayýtlar5("2","11","2 kg","40","tavuk kanat","12.02.2022"));
      	    	
      	    veriler5.add((kayýtlar5) new kayýtlar5("3","12","3 kg","60","tavuk kanat","12.02.2022"));
      	    
      	  
      	    veriler5.add( new kayýtlar5("4","12","2 kg","40","tavuk kanat","12.02.2022"));
      	    	
      	 
      	    
      	    
      	    
      		tableC_sipariþno_click.setCellValueFactory(new PropertyValueFactory<>("sipariþ_no"));
      	    
      	    
      	 tableC_ürünkodu_click.setCellValueFactory (new PropertyValueFactory<>("ürün_kodu"));
      	    
      	 
      	 tableC_miktar_click.setCellValueFactory (new PropertyValueFactory<>("miktar"));
tableC_fiyat_click.setCellValueFactory (new PropertyValueFactory<>("fiyat"));
      	 tableC_açýklama_click.setCellValueFactory (new PropertyValueFactory<>("açýklama"));
      	tableC_sipariþtarihi_click.setCellValueFactory (new PropertyValueFactory<>("sipariþ_tarihi"));
      	
      	    tableV_sipariþler.setItems(veriler5);
    	
    	
    	
    	
    	
    	
        
    }
    
    public static class kayýtlar5{
       	private String sipariþ_no;
       	private String ürün_kodu;
       	private String miktar;
       	private String fiyat;
       	private String açýklama;
    	private String sipariþ_tarihi;
       	
       	
   kayýtlar5(String sipariþ_no,String ürün_kodu,String miktar,String fiyat,String açýklama, String sipariþ_tarihi ) {
	   
   	
      	this.sipariþ_no=sipariþ_no;
      	this.ürün_kodu=ürün_kodu;
      	this.miktar=miktar;
      	this.fiyat=fiyat;
      	this.açýklama=açýklama;
      	this.sipariþ_tarihi=sipariþ_tarihi;
      	
	   
	   
   }


public kayýtlar5() {
	// TODO Auto-generated constructor stub
}


public String getSON_ALIÞ() {
	// TODO Auto-generated method stub
	return null;
}


public String getSipariþ_no() {
	return sipariþ_no;
}


public void setSipariþ_no(String sipariþ_no) {
	this.sipariþ_no = sipariþ_no;
}


public String getÜrün_kodu() {
	return ürün_kodu;
}


public void setÜrün_kodu(String ürün_kodu) {
	this.ürün_kodu = ürün_kodu;
}


public String getMiktar() {
	return miktar;
}


public void setMiktar(String miktar) {
	this.miktar = miktar;
}


public String getFiyat() {
	return fiyat;
}


public void setFiyat(String fiyat) {
	this.fiyat = fiyat;
}


public String getAçýklama() {
	return açýklama;
}


public void setAçýklama(String açýklama) {
	this.açýklama = açýklama;
}


public String getSipariþ_tarihi() {
	return sipariþ_tarihi;
}


public void setSipariþ_tarihi(String sipariþ_tarihi) {
	this.sipariþ_tarihi = sipariþ_tarihi;
}
    
    }
}

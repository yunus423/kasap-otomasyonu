package application;

import java.net.URL;
import java.util.ResourceBundle;

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

public class cftlknamuler {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField btn_ad;

    @FXML
    private Button btn_ekle;

    @FXML
    private TextField btn_fiyat;

    @FXML
    private Button btn_g�ster;

    @FXML
    private Button btn_g�ncelle;

    @FXML
    private TextField btn_kgl;

    @FXML
    private TextField btn_mam�l;

    @FXML
    private Button btn_sil;

    @FXML
    private Label lbl_�ftlknmler;

    @FXML
    private TableColumn<kayitlar2, String> tableC_ad;

    @FXML
    private TableColumn<kayitlar2, String> tableC_fiyat;

    @FXML
    private TableColumn<kayitlar2, String> tableC_id;

    @FXML
    private TableColumn<kayitlar2, String> tableC_kgl;

    @FXML
    private TableColumn<kayitlar2, String> tableC_mam�l;

    @FXML
    private TableView<kayitlar2> tableV_�ftlknmler;

    @FXML
    private TextField txt_id;
    
    ObservableList<kayitlar2>veriler2;

   	private Labeled lbl_deger;

    

    @FXML
    void btn_ekle_click(ActionEvent event) {
    	
     	veriler2=FXCollections.observableArrayList();
       	veriler2.add(new kayitlar2(txt_id.getText(),btn_mam�l.getText(),btn_ad.getText(),btn_kgl.getText(),btn_fiyat.getText()));
       	tableV_�ftlknmler.getItems().addAll(veriler2);

    

    }

    @FXML
    void btn_g�ster_click(ActionEvent event) {
    	
    	
    	kayitlar2 kayit=new kayitlar2();
    	if(tableV_�ftlknmler.getSelectionModel().getSelectedIndex()!=-1) {
    		kayit=(kayitlar2) tableV_�ftlknmler.getItems().get(tableV_�ftlknmler.getSelectionModel().getSelectedIndex());
    		
    		lbl_deger.setText("ID:"+kayit.getId()+ " mam�l:"+kayit.getMam�l()+ "ad:"+kayit.getAd()+"TEL:"+kayit.getKgl()+ " fiyat:"+kayit.getFiyat());
    	}
    	else {
    		lbl_deger.setText("Herhangi bir kay�t se�ilmedi....");
    	}


    }

    @FXML
    void btn_g�ncelle_click(ActionEvent event) {
    	
    	kayitlar2 kayit=new kayitlar2();
    	if(tableV_�ftlknmler.getSelectionModel().getSelectedIndex()!=-1) {
    		kayit=(kayitlar2) tableV_�ftlknmler.getItems().get(tableV_�ftlknmler.getSelectionModel().getSelectedIndex());
    		String idm=kayit.getId();
    		
    		kayitlar2 kk=new kayitlar2(idm,btn_mam�l.getText(),btn_ad.getText(),btn_kgl.getText(),btn_fiyat.getText());
    		int sira=tableV_�ftlknmler.getSelectionModel().getSelectedIndex();
    		tableV_�ftlknmler.getItems().set(sira, kk);
    	}
    }

    @FXML
    void btn_sil_click(ActionEvent event) {
    	
    	
    	 ObservableList<kayitlar2> secilenKayit, tumKayitlar;
       	tumKayitlar=tableV_�ftlknmler.getItems();
       	secilenKayit=tableV_�ftlknmler.getSelectionModel().getSelectedItems();
       	
       	secilenKayit.forEach(tumKayitlar::remove);

    }

    

    @FXML
    void tableC_ad_click(ActionEvent event) {

    }

    @FXML
    void tableC_fiyat_click(ActionEvent event) {

    }

    @FXML
    void tableC_id_click(ActionEvent event) {

    }

    @FXML
    void tableC_mam�l_click(ActionEvent event) {

    }

    @FXML
    void table_kgl_click(ActionEvent event) {

    }

    @FXML
    void initialize() {
    	
    	
btn_ekle.setTooltip(new Tooltip("kay�t eklemeyi sa�lar"));
      
    	
       	Tooltip tip=new Tooltip();
     
           tip.setText("g�ncelleme i�lemi yapar");
           btn_g�ncelle.setTooltip(tip);
          

      		btn_sil.setTooltip(new Tooltip("kay�t silmeyi sa�lar"));
      		
      	
      	   veriler2=FXCollections.observableArrayList();
     	    
     	    veriler2.add(new kayitlar2("1","yumurta","k�y yumurtas�","1","40 tl"));
     	      
     	    veriler2.add(new kayitlar2("2","bal","�am bal�","1","250 tl"));
     	    	
     	    veriler2.add(new kayitlar2("3","tur�u","biber tur�usu","1","30 tl"));
     	   	    	
     	   veriler2.add(new kayitlar2("4","s�t","ya�l� s�t","1","10 tl"));
     	    
     	  veriler2.add(new kayitlar2("5","tereya��","organik tereya�","1","70 tl"));
     	    
     		tableC_id.setCellValueFactory(new PropertyValueFactory<>("id"));
     	    
     		 tableC_mam�l.setCellValueFactory (new PropertyValueFactory<>("mam�l"));
     		 
     		 
     	 tableC_ad.setCellValueFactory (new PropertyValueFactory<>("ad"));
     	    
     	    
     	
     	 tableC_kgl.setCellValueFactory (new PropertyValueFactory<>("kgl"));
     	 tableC_fiyat.setCellValueFactory (new PropertyValueFactory<>("fiyat"));
     	
     	 
     	tableV_�ftlknmler.setItems(veriler2);
   	
  
        
    }
    
    public static class kayitlar2{
       	private String id;
       	private String mam�l;
       	private String ad;
       	private String kgl;
       	private String fiyat;
       	
       	
   kayitlar2(String id,String mam�l,String ad,String kgl,String fiyat ) {
	   
   	
      	this.id=id;
      	this.mam�l=mam�l;
      	this.ad=ad;
      	this.kgl=kgl;
      	this.fiyat=fiyat;
      	
	   
	   
   }


public kayitlar2() {
	// TODO Auto-generated constructor stub
}


public String getId() {
	return id;
}


public void setId(String id) {
	this.id = id;
}


public String getMam�l() {
	return mam�l;
}


public void setMam�l(String mam�l) {
	this.mam�l = mam�l;
}


public String getAd() {
	return ad;
}


public void setAd(String ad) {
	this.ad = ad;
}


public String getKgl() {
	return kgl;
}


public void setKgl(String kgl) {
	this.kgl = kgl;
}


public String getFiyat() {
	return fiyat;
}


public void setFiyat(String fiyat) {
	this.fiyat = fiyat;
}

   
   
   
   
   
   
   
   
   
     	
	   
	   
  }


    }




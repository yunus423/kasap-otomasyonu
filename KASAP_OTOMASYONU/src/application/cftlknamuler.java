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
    private Button btn_göster;

    @FXML
    private Button btn_güncelle;

    @FXML
    private TextField btn_kgl;

    @FXML
    private TextField btn_mamül;

    @FXML
    private Button btn_sil;

    @FXML
    private Label lbl_çftlknmler;

    @FXML
    private TableColumn<kayitlar2, String> tableC_ad;

    @FXML
    private TableColumn<kayitlar2, String> tableC_fiyat;

    @FXML
    private TableColumn<kayitlar2, String> tableC_id;

    @FXML
    private TableColumn<kayitlar2, String> tableC_kgl;

    @FXML
    private TableColumn<kayitlar2, String> tableC_mamül;

    @FXML
    private TableView<kayitlar2> tableV_çftlknmler;

    @FXML
    private TextField txt_id;
    
    ObservableList<kayitlar2>veriler2;

   	private Labeled lbl_deger;

    

    @FXML
    void btn_ekle_click(ActionEvent event) {
    	
     	veriler2=FXCollections.observableArrayList();
       	veriler2.add(new kayitlar2(txt_id.getText(),btn_mamül.getText(),btn_ad.getText(),btn_kgl.getText(),btn_fiyat.getText()));
       	tableV_çftlknmler.getItems().addAll(veriler2);

    

    }

    @FXML
    void btn_göster_click(ActionEvent event) {
    	
    	
    	kayitlar2 kayit=new kayitlar2();
    	if(tableV_çftlknmler.getSelectionModel().getSelectedIndex()!=-1) {
    		kayit=(kayitlar2) tableV_çftlknmler.getItems().get(tableV_çftlknmler.getSelectionModel().getSelectedIndex());
    		
    		lbl_deger.setText("ID:"+kayit.getId()+ " mamül:"+kayit.getMamül()+ "ad:"+kayit.getAd()+"TEL:"+kayit.getKgl()+ " fiyat:"+kayit.getFiyat());
    	}
    	else {
    		lbl_deger.setText("Herhangi bir kayýt seçilmedi....");
    	}


    }

    @FXML
    void btn_güncelle_click(ActionEvent event) {
    	
    	kayitlar2 kayit=new kayitlar2();
    	if(tableV_çftlknmler.getSelectionModel().getSelectedIndex()!=-1) {
    		kayit=(kayitlar2) tableV_çftlknmler.getItems().get(tableV_çftlknmler.getSelectionModel().getSelectedIndex());
    		String idm=kayit.getId();
    		
    		kayitlar2 kk=new kayitlar2(idm,btn_mamül.getText(),btn_ad.getText(),btn_kgl.getText(),btn_fiyat.getText());
    		int sira=tableV_çftlknmler.getSelectionModel().getSelectedIndex();
    		tableV_çftlknmler.getItems().set(sira, kk);
    	}
    }

    @FXML
    void btn_sil_click(ActionEvent event) {
    	
    	
    	 ObservableList<kayitlar2> secilenKayit, tumKayitlar;
       	tumKayitlar=tableV_çftlknmler.getItems();
       	secilenKayit=tableV_çftlknmler.getSelectionModel().getSelectedItems();
       	
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
    void tableC_mamül_click(ActionEvent event) {

    }

    @FXML
    void table_kgl_click(ActionEvent event) {

    }

    @FXML
    void initialize() {
    	
    	
btn_ekle.setTooltip(new Tooltip("kayýt eklemeyi saðlar"));
      
    	
       	Tooltip tip=new Tooltip();
     
           tip.setText("güncelleme iþlemi yapar");
           btn_güncelle.setTooltip(tip);
          

      		btn_sil.setTooltip(new Tooltip("kayýt silmeyi saðlar"));
      		
      	
      	   veriler2=FXCollections.observableArrayList();
     	    
     	    veriler2.add(new kayitlar2("1","yumurta","köy yumurtasý","1","40 tl"));
     	      
     	    veriler2.add(new kayitlar2("2","bal","çam balý","1","250 tl"));
     	    	
     	    veriler2.add(new kayitlar2("3","turþu","biber turþusu","1","30 tl"));
     	   	    	
     	   veriler2.add(new kayitlar2("4","süt","yaðlý süt","1","10 tl"));
     	    
     	  veriler2.add(new kayitlar2("5","tereyaðý","organik tereyað","1","70 tl"));
     	    
     		tableC_id.setCellValueFactory(new PropertyValueFactory<>("id"));
     	    
     		 tableC_mamül.setCellValueFactory (new PropertyValueFactory<>("mamül"));
     		 
     		 
     	 tableC_ad.setCellValueFactory (new PropertyValueFactory<>("ad"));
     	    
     	    
     	
     	 tableC_kgl.setCellValueFactory (new PropertyValueFactory<>("kgl"));
     	 tableC_fiyat.setCellValueFactory (new PropertyValueFactory<>("fiyat"));
     	
     	 
     	tableV_çftlknmler.setItems(veriler2);
   	
  
        
    }
    
    public static class kayitlar2{
       	private String id;
       	private String mamül;
       	private String ad;
       	private String kgl;
       	private String fiyat;
       	
       	
   kayitlar2(String id,String mamül,String ad,String kgl,String fiyat ) {
	   
   	
      	this.id=id;
      	this.mamül=mamül;
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


public String getMamül() {
	return mamül;
}


public void setMamül(String mamül) {
	this.mamül = mamül;
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




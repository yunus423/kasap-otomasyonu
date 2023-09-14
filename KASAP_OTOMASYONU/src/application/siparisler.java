
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

public class siparisler<kay�tlar5> {

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
    private Label lbl_sipari�ler;

    @FXML
    private TableColumn<kay�tlar5, String> tableC_a��klama_click;

    @FXML
    private TableColumn<kay�tlar5, String> tableC_fiyat_click;

    @FXML
    private TableColumn<kay�tlar5, String> tableC_miktar_click;

    @FXML
    private TableColumn<kay�tlar5, String> tableC_sipari�no_click;

    @FXML
    private TableColumn<kay�tlar5, String> tableC_sipari�tarihi_click;

    @FXML
    private TableColumn<kay�tlar5, String> tableC_�r�nkodu_click;

    @FXML
    private TableView<kay�tlar5> tableV_sipari�ler;

    @FXML
    private TextField txt_a��klama;

    @FXML
    private TextField txt_fiyat;

    @FXML
    private TextField txt_miktar;

    @FXML
    private TextField txt_sipari�_no;

    @FXML
    private TextField txt_sipari�tarihi;

    @FXML
    private TextField txt_�r�n_kodu;

    
    
    ObservableList<kay�tlar5> veriler5;
  

	private Labeled lbl_deger;

	


    
    
    @FXML
    void btn_ekle_click(ActionEvent event) {
    	
    	veriler5=FXCollections.observableArrayList();
       	veriler5.add(new kay�tlar5(txt_sipari�_no.getText(),txt_�r�n_kodu.getText(),txt_miktar.getText(),txt_fiyat.getText(),txt_a��klama.getText(),txt_sipari�tarihi.getText()));
       	tableV_sipari�ler.getItems().addAll(veriler5);

    	
    	
    	

    }

    @FXML
    void btn_g�ster_click(ActionEvent event) {
    	
    	
    	
    	kay�tlar5 kayit=new kay�tlar5();
    	if(tableV_sipari�ler.getSelectionModel().getSelectedIndex()!=-1) {
    		kayit=(kay�tlar5) tableV_sipari�ler.getItems().get(tableV_sipari�ler.getSelectionModel().getSelectedIndex());
    		
    		lbl_deger.setText("ispari�_no:"+kayit.getSipari�_no()+ " �r�n=kodu:"+kayit.get�r�n_kodu()+ "miktar:"+kayit.getMiktar()+"fiyat:"+kayit.getFiyat()+ " SON_ALI�:"+kayit.getSON_ALI�()+" sipari�_tarihi:"+kayit.getSipari�_tarihi());
    	}
    	else {
    		lbl_deger.setText("Herhangi bir kay�t se�ilmedi....");
    	}
    	
    	
    	
    	

    }

    @FXML
    void btn_g�ncelle_click(ActionEvent event) {
    	
    	kay�tlar5 kayit=new kay�tlar5();
    	if(tableV_sipari�ler.getSelectionModel().getSelectedIndex()!=-1) {
    		kayit=(kay�tlar5) tableV_sipari�ler.getItems().get(tableV_sipari�ler.getSelectionModel().getSelectedIndex());
    
    		
    		kay�tlar5 kk=new kay�tlar5(txt_sipari�_no.getText(),txt_�r�n_kodu.getText(),txt_miktar.getText(),txt_fiyat.getText(),txt_a��klama.getText(),txt_sipari�tarihi.getText());
    		int sira=tableV_sipari�ler.getSelectionModel().getSelectedIndex();
    		tableV_sipari�ler.getItems().set(sira, kk);
    	}
   

    }

    @FXML
    void btn_sil_click(ActionEvent event) {
    	
    	
    	
    	
    	ObservableList<kay�tlar5> secilenKayit, tumKayitlar;
      	tumKayitlar=tableV_sipari�ler.getItems();
      	secilenKayit=tableV_sipari�ler.getSelectionModel().getSelectedItems();
      	
      	secilenKayit.forEach(tumKayitlar::remove);
    	
    	
    	
    	
    	
    	

    }

    @FXML
    void initialize() {
    	
btn_ekle.setTooltip(new Tooltip("kay�t eklemeyi sa�lar"));
      
    	
       	Tooltip tip=new Tooltip();
     
           tip.setText("g�ncelleme i�lemi yapar");
           btn_g�ncelle.setTooltip(tip);
          

      		btn_sil.setTooltip(new Tooltip("kay�t silmeyi sa�lar"));
      		

    	
    	
    	
      	    veriler5=FXCollections.observableArrayList();
      	    
      	    veriler5.add((kay�tlar5) new kay�tlar5("1","10","1 kg","20"," tavuk kanat","12.02.2022"));
      	      
      	    veriler5.add((kay�tlar5) new kay�tlar5("2","11","2 kg","40","tavuk kanat","12.02.2022"));
      	    	
      	    veriler5.add((kay�tlar5) new kay�tlar5("3","12","3 kg","60","tavuk kanat","12.02.2022"));
      	    
      	  
      	    veriler5.add( new kay�tlar5("4","12","2 kg","40","tavuk kanat","12.02.2022"));
      	    	
      	 
      	    
      	    
      	    
      		tableC_sipari�no_click.setCellValueFactory(new PropertyValueFactory<>("sipari�_no"));
      	    
      	    
      	 tableC_�r�nkodu_click.setCellValueFactory (new PropertyValueFactory<>("�r�n_kodu"));
      	    
      	 
      	 tableC_miktar_click.setCellValueFactory (new PropertyValueFactory<>("miktar"));
tableC_fiyat_click.setCellValueFactory (new PropertyValueFactory<>("fiyat"));
      	 tableC_a��klama_click.setCellValueFactory (new PropertyValueFactory<>("a��klama"));
      	tableC_sipari�tarihi_click.setCellValueFactory (new PropertyValueFactory<>("sipari�_tarihi"));
      	
      	    tableV_sipari�ler.setItems(veriler5);
    	
    	
    	
    	
    	
    	
        
    }
    
    public static class kay�tlar5{
       	private String sipari�_no;
       	private String �r�n_kodu;
       	private String miktar;
       	private String fiyat;
       	private String a��klama;
    	private String sipari�_tarihi;
       	
       	
   kay�tlar5(String sipari�_no,String �r�n_kodu,String miktar,String fiyat,String a��klama, String sipari�_tarihi ) {
	   
   	
      	this.sipari�_no=sipari�_no;
      	this.�r�n_kodu=�r�n_kodu;
      	this.miktar=miktar;
      	this.fiyat=fiyat;
      	this.a��klama=a��klama;
      	this.sipari�_tarihi=sipari�_tarihi;
      	
	   
	   
   }


public kay�tlar5() {
	// TODO Auto-generated constructor stub
}


public String getSON_ALI�() {
	// TODO Auto-generated method stub
	return null;
}


public String getSipari�_no() {
	return sipari�_no;
}


public void setSipari�_no(String sipari�_no) {
	this.sipari�_no = sipari�_no;
}


public String get�r�n_kodu() {
	return �r�n_kodu;
}


public void set�r�n_kodu(String �r�n_kodu) {
	this.�r�n_kodu = �r�n_kodu;
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


public String getA��klama() {
	return a��klama;
}


public void setA��klama(String a��klama) {
	this.a��klama = a��klama;
}


public String getSipari�_tarihi() {
	return sipari�_tarihi;
}


public void setSipari�_tarihi(String sipari�_tarihi) {
	this.sipari�_tarihi = sipari�_tarihi;
}
    
    }
}

package application;

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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class departmanlar {

    @FXML
    private Button btn_ekle;

    @FXML
    private Button btn_g�ster;

    @FXML
    private Button btn_g�ncelle;

    @FXML
    private AnchorPane btn_sil;

    @FXML
    private Button btn_silme;

    @FXML
    private Label lbl_departman;

    @FXML
    private TableColumn<kayitlar4, String> tableC_id;

    @FXML
    private TableView<kayitlar4> tableV_departman;

    @FXML
    private TableColumn<kayitlar4, String> table_ad;

    @FXML
    private TableColumn<kayitlar4, String> table_i�cisys;

    @FXML
    private TextField txt_ad;

    @FXML
    private TextField txt_id;

    @FXML
    private TextField txt_i�ci_sys;
    
    
    
    ObservableList<kayitlar4>veriler4;

   	private Labeled lbl_deger;
   	

    @FXML
    void btn_ekle_click(ActionEvent event) {
    	
    	veriler4=FXCollections.observableArrayList();
       	veriler4.add(new kayitlar4(txt_id.getText(),txt_ad.getText(),txt_i�ci_sys.getText()));
       	tableV_departman.getItems().addAll(veriler4);

    	
    	
    	

    }

    @FXML
    void btn_g�ster_click(ActionEvent event) {
    	
    	
    	kayitlar4 kayit=new kayitlar4();
    	if(tableV_departman.getSelectionModel().getSelectedIndex()!=-1) {
    		kayit=(kayitlar4) tableV_departman.getItems().get(tableV_departman.getSelectionModel().getSelectedIndex());
    		
    		lbl_deger.setText("ID:"+kayit.getId()+ " Ad�:"+kayit.getAd()+ "i�ci_say�s�:"+kayit.getI�ci_say�s�());
    	}
    	else {
    		lbl_deger.setText("Herhangi bir kay�t se�ilmedi....");
    	}

    }

    @FXML
    void btn_g�ncelle_click(ActionEvent event) {
    
    	
    	kayitlar4 kayit=new kayitlar4();
    	if(tableV_departman.getSelectionModel().getSelectedIndex()!=-1) {
    		kayit=(kayitlar4) tableV_departman.getItems().get(tableV_departman.getSelectionModel().getSelectedIndex());
    
    		
    		kayitlar4 kk=new kayitlar4(txt_id.getText(),txt_ad.getText(),txt_i�ci_sys.getText());
    		int sira=tableV_departman.getSelectionModel().getSelectedIndex();
    		tableV_departman.getItems().set(sira, kk);
    	}
    	

    }

    @FXML
    void btn_sil_click(MouseEvent event) {
    	
    	ObservableList<kayitlar4> secilenKayit, tumKayitlar;
      	tumKayitlar=tableV_departman.getItems();
      	secilenKayit=tableV_departman.getSelectionModel().getSelectedItems();
      	
      	secilenKayit.forEach(tumKayitlar::remove);

    	
    	
    	

    }

    @FXML
    void btn_silne_click(ActionEvent event) {

    }

    @FXML
    void tableC_id_click(ActionEvent event) {

    }

    @FXML
    void table_ad_click(ActionEvent event) {

    }

    @FXML
    void table_i�cisys_click(ActionEvent event) {

    }

    @FXML
    void initialize() {
    	
btn_ekle.setTooltip(new Tooltip("kay�t eklemeyi sa�lar"));
      
    	
       	Tooltip tip=new Tooltip();
     
           tip.setText("g�ncelleme i�lemi yapar");
           btn_g�ncelle.setTooltip(tip);
          

      		btn_silme.setTooltip(new Tooltip("kay�t silmeyi sa�lar"));
      		
      
    	
    	
    	
    	
    	
    	
    	
      	    veriler4=FXCollections.observableArrayList();
      	    
      	    veriler4.add(new kayitlar4("1","kasiyer","1"));
      	      
      	    veriler4.add(new kayitlar4("2","kurye","4"));
      	    	
      	    veriler4.add(new kayitlar4("3","kasap","2"));
      	    
      	  
      	    	
      	 
      	    
      	    
      	    
      		tableC_id.setCellValueFactory(new PropertyValueFactory<>("id"));
      	    
      	    
      	 table_ad.setCellValueFactory (new PropertyValueFactory<>("ad"));
      	    
      	    
      	 table_i�cisys.setCellValueFactory (new PropertyValueFactory<>("i�ci_say�s�"));
      	
      	    tableV_departman.setItems(veriler4);
    	
    	
    	
    	
    	
       
    }

  		
    public static class kayitlar4{
       	private String id;
       	private String ad;
       
       	private String i�ci_say�s�;
       
    kayitlar4(String id,String ad,String i�ci_say�s� ) {
	   
   	
      	this.id=id;
      	this.ad=ad;
      	this.i�ci_say�s�=i�ci_say�s�;
      	
    
  
    
    
    }

	public kayitlar4() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getI�ci_say�s�() {
		return i�ci_say�s�;
	}

	public void setI�ci_say�s�(String i�ci_say�s�) {
		this.i�ci_say�s� = i�ci_say�s�;
	}


    
    }

}



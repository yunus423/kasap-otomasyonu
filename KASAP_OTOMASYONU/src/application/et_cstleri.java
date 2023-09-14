package application;

      		import java.net.URL;
      		import java.util.ResourceBundle;

import application.cftlknamuler.kayitlar2;
import javafx.collections.FXCollections;
      		import javafx.collections.ObservableList;
      		import javafx.event.ActionEvent;
      		import javafx.fxml.FXML;
      		import javafx.scene.control.Button;
      		import javafx.scene.control.Label;
      		import javafx.scene.control.Labeled;
import javafx.scene.control.SelectionModel;
import javafx.scene.control.TableColumn;
      		import javafx.scene.control.TableView;
      		import javafx.scene.control.TextField;
      		import javafx.scene.control.Tooltip;
      		import javafx.scene.control.cell.MapValueFactory;
      		import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.util.Callback;

public class et_cstleri {

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
    private Label lbl_oto;

    @FXML
    private TableColumn<kayýtlar,String> tableC_et;

    @FXML
    private TableColumn<kayýtlar, String> tableC_fyt;

    @FXML
    private TableColumn<kayýtlar, String > tableC_hayvan;

    @FXML
    private TableColumn<kayýtlar, String> tableC_kg;

    @FXML
    private TableColumn<kayýtlar, String> tableC_olg;

    @FXML
    private TableColumn<kayýtlar, String > tableC_yapý;

    @FXML
    private TableView<kayýtlar> tabloV_çþt;

    @FXML
    private TextField text_deger1;

    @FXML
    private TextField text_deger3;

    @FXML
    private TextField text_deger5;

    @FXML
    private TextField text_deger6;

    @FXML
    private TextField txt_deger2;

    @FXML
    private TextField txt_deger4;
    
    
    
    
    
    ObservableList<kayýtlar>veriler;

   	private Labeled lbl_deger;
   	
   	kayýtlar seçilenkayit;

       @FXML
       void btn_ekle_click(ActionEvent event) {
       	
       	veriler=FXCollections.observableArrayList();
       	veriler.add(new kayýtlar(txt_deger4.getText(),text_deger1.getText(),txt_deger2.getText(),text_deger3.getText(),text_deger5.getText(),text_deger6.getText()));
       	tabloV_çþt.getItems().addAll(veriler);
       }
    
       @FXML
       void btn_göster(ActionEvent event) {
    	   
    	   
    		kayýtlar kayit=new kayýtlar();
        	if(tabloV_çþt.getSelectionModel().getSelectedIndex()!=-1) {
        		kayit=(kayýtlar) tabloV_çþt.getItems().get(tabloV_çþt.getSelectionModel().getSelectedIndex());
        		
        		lbl_deger.setText("hayvan:"+kayit.getHayvan()+ " et:"+kayit.getEt()+ "olgunluk:"+kayit.getOlgunluk()+"yapý:"+kayit.getYapý()+ "kg:"+kayit.getKg()+ "fiyat:"+kayit.getFiyat());
        	}
        	else {
        		lbl_deger.setText("Herhangi bir kayýt seçilmedi....");
        	}

       	
       }
       
       @FXML
       void tableClick(MouseEvent event) {
    	
       }

       @FXML
       void btn_güncelle_click(ActionEvent event) {
    		kayýtlar kayit=new kayýtlar();
        	if(tabloV_çþt.getSelectionModel().getSelectedIndex()!=-1) {
        		kayit=(kayýtlar) tabloV_çþt.getItems().get(tabloV_çþt.getSelectionModel().getSelectedIndex());
        
        		
        		kayýtlar kk=new kayýtlar(txt_deger4.getText(),text_deger1.getText(),txt_deger2.getText(),text_deger3.getText(),text_deger5.getText(),text_deger6.getText());
        		int sira=tabloV_çþt.getSelectionModel().getSelectedIndex();
        		tabloV_çþt.getItems().set(sira, kk);
        	}
       }

       @FXML
       void btn_sil_click(ActionEvent event) {

    	   ObservableList<kayýtlar> secilenKayit, tumKayitlar;
       	tumKayitlar=tabloV_çþt.getItems();
       	secilenKayit=tabloV_çþt.getSelectionModel().getSelectedItems();
       	
       	secilenKayit.forEach(tumKayitlar::remove);
       	
       }

       @FXML
       void tableC_et(ActionEvent event) {

       }

       @FXML
       void tableC_fyt(ActionEvent event) {

       }

       @FXML
       void tableC_hayvan(ActionEvent event) {

       }

       @FXML
       void tableC_kg(ActionEvent event) {

       }

       @FXML
       void tableC_olg(ActionEvent event) {

       }

       @FXML
       void tableC_yapý(ActionEvent event) {

       }

       @FXML
       void initialize() {
       	
    	   btn_ekle.setTooltip(new Tooltip("kayýt eklemeyi saðlar"));
    	      
       	
          	Tooltip tip=new Tooltip();
        
              tip.setText("güncelleme iþlemi yapar");
              btn_güncelle.setTooltip(tip);
             

         		btn_sil.setTooltip(new Tooltip("kayýt silmeyi saðlar"));
       	
       	
    
       
       veriler=FXCollections.observableArrayList();
       veriler.add(new kayýtlar("kuzu","pirzola","1","kemiksiz","1","150"));
         
       veriler.add(new kayýtlar("kuzu","ciðer","1","kemiksiz","1","100"));
       	
       veriler.add(new kayýtlar("kuzu","but","1","kemikli","1","120"));
       
       veriler.add(new kayýtlar("tavuk","pirzola","1","kemiksiz","1","40"));
       	
       veriler.add(new kayýtlar("tavuk","ciðer","1","kemiksiz","1","15"));
       
       veriler.add(new kayýtlar("tavuk","kanat","1","kemiksiz","1","40"));
       
       
       
   	tableC_hayvan.setCellValueFactory(new PropertyValueFactory<>("Hayvan"));
       
       
    tableC_et.setCellValueFactory (new PropertyValueFactory<>("et"));
       
       
    tableC_olg.setCellValueFactory (new PropertyValueFactory<>("olgunluk"));
    tableC_yapý.setCellValueFactory (new PropertyValueFactory<>("yapý"));
    tableC_kg.setCellValueFactory (new PropertyValueFactory<>("kg"));
    tableC_fyt.setCellValueFactory (new PropertyValueFactory<>("fiyat"));
    
       tabloV_çþt.setItems(veriler);
       
           
       }
      
       	
       public static class kayýtlar{
       	public Object text_deger4;
		private String  hayvan;
       	public String getHayvan() {
			return hayvan;
		}

		public void setHayvan(String hayvan) {
			this.hayvan = hayvan;
		}

		public String getEt() {
			return et;
		}

		public void setEt(String et) {
			this.et = et;
		}

		public String getOlgunluk() {
			return olgunluk;
		}

		public void setOlgunluk(String olgunluk) {
			this.olgunluk = olgunluk;
		}

		public String getYapý() {
			return yapý;
		}

		public void setYapý(String yapý) {
			this.yapý = yapý;
		}

		public String getKg() {
			return kg;
		}

		public void setKg(String kg) {
			this.kg = kg;
		}

		public String getFiyat() {
			return fiyat;
		}

		public void setFiyat(String fiyat) {
			this.fiyat = fiyat;
		}

		private String et;
       	private String olgunluk;
       	private String yapý;
       	private String kg;
       	private String fiyat;
      
       kayýtlar(String hayvan, String et, String i, String yapý,String j , String k){
       	
       	this.hayvan=hayvan;
       	this.et=et;
       	this.olgunluk=i;
       	this.yapý=yapý;
       	this.kg=j;
       	this.fiyat=k;
       }

	public kayýtlar() {
		// TODO Auto-generated constructor stub
	}

   	
       	
       	       	
       	
       	
       	
       	
       	
       	
       	
       	
       	
       	
       	
       	
       	
       	
       	
       	
       	
       	
       	
       }
   


 	
       	
       	
       	
       	
       	
       	
       	
       	
       
   }



    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    






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
    private Button btn_g�ster;

    @FXML
    private Button btn_g�ncelle;

    @FXML
    private Button btn_sil;

    @FXML
    private Label lbl_oto;

    @FXML
    private TableColumn<kay�tlar,String> tableC_et;

    @FXML
    private TableColumn<kay�tlar, String> tableC_fyt;

    @FXML
    private TableColumn<kay�tlar, String > tableC_hayvan;

    @FXML
    private TableColumn<kay�tlar, String> tableC_kg;

    @FXML
    private TableColumn<kay�tlar, String> tableC_olg;

    @FXML
    private TableColumn<kay�tlar, String > tableC_yap�;

    @FXML
    private TableView<kay�tlar> tabloV_��t;

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
    
    
    
    
    
    ObservableList<kay�tlar>veriler;

   	private Labeled lbl_deger;
   	
   	kay�tlar se�ilenkayit;

       @FXML
       void btn_ekle_click(ActionEvent event) {
       	
       	veriler=FXCollections.observableArrayList();
       	veriler.add(new kay�tlar(txt_deger4.getText(),text_deger1.getText(),txt_deger2.getText(),text_deger3.getText(),text_deger5.getText(),text_deger6.getText()));
       	tabloV_��t.getItems().addAll(veriler);
       }
    
       @FXML
       void btn_g�ster(ActionEvent event) {
    	   
    	   
    		kay�tlar kayit=new kay�tlar();
        	if(tabloV_��t.getSelectionModel().getSelectedIndex()!=-1) {
        		kayit=(kay�tlar) tabloV_��t.getItems().get(tabloV_��t.getSelectionModel().getSelectedIndex());
        		
        		lbl_deger.setText("hayvan:"+kayit.getHayvan()+ " et:"+kayit.getEt()+ "olgunluk:"+kayit.getOlgunluk()+"yap�:"+kayit.getYap�()+ "kg:"+kayit.getKg()+ "fiyat:"+kayit.getFiyat());
        	}
        	else {
        		lbl_deger.setText("Herhangi bir kay�t se�ilmedi....");
        	}

       	
       }
       
       @FXML
       void tableClick(MouseEvent event) {
    	
       }

       @FXML
       void btn_g�ncelle_click(ActionEvent event) {
    		kay�tlar kayit=new kay�tlar();
        	if(tabloV_��t.getSelectionModel().getSelectedIndex()!=-1) {
        		kayit=(kay�tlar) tabloV_��t.getItems().get(tabloV_��t.getSelectionModel().getSelectedIndex());
        
        		
        		kay�tlar kk=new kay�tlar(txt_deger4.getText(),text_deger1.getText(),txt_deger2.getText(),text_deger3.getText(),text_deger5.getText(),text_deger6.getText());
        		int sira=tabloV_��t.getSelectionModel().getSelectedIndex();
        		tabloV_��t.getItems().set(sira, kk);
        	}
       }

       @FXML
       void btn_sil_click(ActionEvent event) {

    	   ObservableList<kay�tlar> secilenKayit, tumKayitlar;
       	tumKayitlar=tabloV_��t.getItems();
       	secilenKayit=tabloV_��t.getSelectionModel().getSelectedItems();
       	
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
       void tableC_yap�(ActionEvent event) {

       }

       @FXML
       void initialize() {
       	
    	   btn_ekle.setTooltip(new Tooltip("kay�t eklemeyi sa�lar"));
    	      
       	
          	Tooltip tip=new Tooltip();
        
              tip.setText("g�ncelleme i�lemi yapar");
              btn_g�ncelle.setTooltip(tip);
             

         		btn_sil.setTooltip(new Tooltip("kay�t silmeyi sa�lar"));
       	
       	
    
       
       veriler=FXCollections.observableArrayList();
       veriler.add(new kay�tlar("kuzu","pirzola","1","kemiksiz","1","150"));
         
       veriler.add(new kay�tlar("kuzu","ci�er","1","kemiksiz","1","100"));
       	
       veriler.add(new kay�tlar("kuzu","but","1","kemikli","1","120"));
       
       veriler.add(new kay�tlar("tavuk","pirzola","1","kemiksiz","1","40"));
       	
       veriler.add(new kay�tlar("tavuk","ci�er","1","kemiksiz","1","15"));
       
       veriler.add(new kay�tlar("tavuk","kanat","1","kemiksiz","1","40"));
       
       
       
   	tableC_hayvan.setCellValueFactory(new PropertyValueFactory<>("Hayvan"));
       
       
    tableC_et.setCellValueFactory (new PropertyValueFactory<>("et"));
       
       
    tableC_olg.setCellValueFactory (new PropertyValueFactory<>("olgunluk"));
    tableC_yap�.setCellValueFactory (new PropertyValueFactory<>("yap�"));
    tableC_kg.setCellValueFactory (new PropertyValueFactory<>("kg"));
    tableC_fyt.setCellValueFactory (new PropertyValueFactory<>("fiyat"));
    
       tabloV_��t.setItems(veriler);
       
           
       }
      
       	
       public static class kay�tlar{
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

		public String getYap�() {
			return yap�;
		}

		public void setYap�(String yap�) {
			this.yap� = yap�;
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
       	private String yap�;
       	private String kg;
       	private String fiyat;
      
       kay�tlar(String hayvan, String et, String i, String yap�,String j , String k){
       	
       	this.hayvan=hayvan;
       	this.et=et;
       	this.olgunluk=i;
       	this.yap�=yap�;
       	this.kg=j;
       	this.fiyat=k;
       }

	public kay�tlar() {
		// TODO Auto-generated constructor stub
	}

   	
       	
       	       	
       	
       	
       	
       	
       	
       	
       	
       	
       	
       	
       	
       	
       	
       	
       	
       	
       	
       	
       	
       }
   


 	
       	
       	
       	
       	
       	
       	
       	
       	
       
   }



    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    






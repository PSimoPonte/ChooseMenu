/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Simone.Pontalti
 */
public class EsGIUGNO2016 extends Application {
    
    @Override
    public void start(Stage finestra) {
        
        Label lbl1 = new Label("Nome cliente");
        //lbl1.setTextFill(Color.BLUE); // .setTextFill -->è un metodo della classe label/bottone/ecc che cambia il colore del testo!
        
        TextField txt1 = new TextField("");
        //txt1.setEditable(false);
        
        Label lbl2 = new Label("Dove si vuole accomodare?");
        
        ChoiceBox cbx = new ChoiceBox();
        cbx.getItems().addAll("Coperto 1", "Coperto 2", "Terrazza 1", "Terrazza 2");
        
        Label lbl3 = new Label("Primo piatto");
        
        ToggleGroup grp1 = new ToggleGroup(); //ToggleGroup è una classe che serve per raggruppare i radiobutton
        
        RadioButton rdn1 = new RadioButton();
        rdn1.setText("Pasta");
        rdn1.setToggleGroup(grp1); // .setToggleGroup è un metodo della classe RadioButton che mi serve per dire al radiobutton specifico
                                    //a quale gruppo appartiene
        RadioButton rdn2 = new RadioButton();
        rdn2.setText("Riso");
        rdn2.setToggleGroup(grp1);
           
        
        
        Label lbl4 = new Label("Secondo piatto");
        
        ToggleGroup grp2 = new ToggleGroup(); //ToggleGroup è una classe che serve per raggruppare i radiobutton
        
        RadioButton rdn3 = new RadioButton();
        rdn3.setText("Pesce");
        rdn3.setToggleGroup(grp2); // .setToggleGroup è un metodo della classe RadioButton che mi serve per dire al radiobutton specifico
                                    //a quale gruppo appartiene
        RadioButton rdn4 = new RadioButton();
        rdn4.setText("Carne");
        rdn4.setToggleGroup(grp2);
        
        
        Label lbl5 = new Label("Terzo piatto [1]o[2]");
        
        ToggleGroup grp3 = new ToggleGroup(); //ToggleGroup è una classe che serve per raggruppare i radiobutton
        
        RadioButton rdn5 = new RadioButton();
        rdn5.setText("[1]Verdura");
        rdn5.setToggleGroup(grp3); // .setToggleGroup è un metodo della classe RadioButton che mi serve per dire al radiobutton specifico
                                    //a quale gruppo appartiene
      
        RadioButton rdn6 = new RadioButton();
        rdn6.setText("[2]Frutta");
        rdn6.setToggleGroup(grp3);
        
        
        
        Label lbl6 = new Label("Tipi di Verdura");
        
        CheckBox chb1 = new CheckBox(); //checkBox è una classe
        chb1.setText("Carote"); //.setText è un metodo della classe CheckBox che serve per inserire il testo a fianco della casella
        
        CheckBox chb2 = new CheckBox();
        chb2.setText("Radicchio");
        
        CheckBox chb3 = new CheckBox();
        chb3.setText("Pomodori");
        
        CheckBox chb4 = new CheckBox();
        chb4.setText("Zucchine");
        
        Label lbl7 = new Label("Tipi di Frutta");
        
        CheckBox chb5 = new CheckBox(); //checkBox è una classe
        chb5.setText("Pera"); //.setText è un metodo della classe CheckBox che serve per inserire il testo a fianco della casella
        
        CheckBox chb6 = new CheckBox();
        chb6.setText("Mela");
        
        CheckBox chb7 = new CheckBox();
        chb7.setText("Kiwi");
        
        CheckBox chb8 = new CheckBox();
        chb8.setText("Banana");
        
        RadioButton rdn7 = new RadioButton();
        rdn7.setText("Clicca per \nl'immagine del\n ristorante");
        
        TextArea txt = new TextArea();
       
        txt.setMaxHeight(900);
        txt.setMaxWidth(300);
        txt.setPrefSize(300, 700);
        txt.setEditable(false);
        /*
        VBox root1 = new VBox(15); 
        root1.setAlignment(Pos.BOTTOM_RIGHT);
        */
       
      
        
        final ImageView selectedImage = new ImageView();   
        selectedImage.setFitWidth(300);
        selectedImage.setFitHeight(280);
        //Image image1 = new Image(EsGIUGNO2016.class.getResourceAsStream("ristorante.jpg"));
        
        //selectedImage.setImage(image1);
        
        // root1.getChildren().addAll(selectedImage); //.addAll --> è un metodo della classe VBox che consente di aggiungere
                                                            //in un colpo tutti i membri all'interno del rettangolo
       

        
        rdn5.setOnAction(new EventHandler<ActionEvent>(){
           
            @Override
            public void handle(ActionEvent event) {
              
                if(rdn5.isSelected()){
                     
                     rdn6.setDisable(true);
                     chb5.setDisable(true);
                     chb6.setDisable(true);
                     chb7.setDisable(true);
                     chb8.setDisable(true);
                }
               
            }
        });
        
          rdn6.setOnAction(new EventHandler<ActionEvent>(){
           
            @Override
            public void handle(ActionEvent event) {
              
                if(rdn6.isSelected()){
                     
                     rdn5.setDisable(true);
                     chb1.setDisable(true);
                     chb2.setDisable(true);
                     chb3.setDisable(true);
                     chb4.setDisable(true);
                }
               
            }
        });
            
        Button btn1 = new Button ("Reset");
        
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                chb1.setSelected(false); //.setSelected è un metodo della classe checkbox / radiobutton ma non solo che serve per azzarare (false)
                chb1.setDisable(false);
                chb2.setSelected(false);
                chb2.setDisable(false);
                chb3.setSelected(false);
                chb3.setDisable(false);
                chb4.setSelected(false);
                chb4.setDisable(false);
                chb5.setSelected(false);
                chb5.setDisable(false);
                chb6.setSelected(false);
                chb6.setDisable(false);
                chb7.setSelected(false);
                chb7.setDisable(false);
                chb8.setSelected(false);
                chb8.setDisable(false);
                rdn1.setSelected(false);
                rdn2.setSelected(false);
                rdn3.setSelected(false);
                rdn4.setSelected(false);
                rdn5.setSelected(false);
                rdn5.setDisable(false);
                rdn6.setSelected(false);
                rdn6.setDisable(false);
                cbx.getSelectionModel().clearSelection(); //per azzerare un combobox
                selectedImage.setVisible(false);
                rdn7.setSelected(false);
                        
                txt.setText(" ");
                txt1.setText(" ");
            }
        });
        
        
        Button btn2 = new Button();
        btn2.setText("Invio");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                
                String testo = "\nBuongiorno \n";
               
                String x = txt1.getText(); // .getText prende il testo inserito dall'utente e lo assegna ad x

                String y = (String)cbx.getSelectionModel().getSelectedItem().toString(); 
                //assegno a y il valore del combobox
      
                testo = testo+ "\nNome del cliente: "+x;            // testo=testo+"".. -> modo per aggiungere testo in coda!
                testo = testo+"\nLa zona scelta è: "+y;

                if(rdn1.isSelected()){
                    testo = testo+"\n\nPrimo piatto: Pasta"; 
                }

                if(rdn2.isSelected()){
                    testo = testo+"\n\nPrimo piatto: Riso"; 
                }

                if(rdn3.isSelected()){
                    testo = testo+"\nSecondo piatto: Pesce"; 
                }

                if(rdn4.isSelected()){
                    testo = testo+"\nSecondo piatto: Carne"; 
                }

                if(rdn5.isSelected()){

                     chb5.setDisable(true);
                     chb6.setDisable(true);
                     chb7.setDisable(true);
                     chb8.setDisable(true);
                     
                     testo = testo+"\nTerzo piatto: Verdura"; 

                     if(chb1.isSelected()){
                      testo = testo+"\n\nUna parte di verdura è: Carote"; 
                    }

                     if(chb2.isSelected()){
                       testo = testo+"\n\nUna parte di verdura è: Radicchio"; 
                     }
                     
                     if(chb3.isSelected()){
                       testo = testo+"\n\nUna parte di verdura è: Pomodori"; 
                     }
                     
                     if(chb4.isSelected()){
                       testo = testo+"\n\nUna parte di verdura è: Zucchine "; 
                    }
     
                }
                if(rdn6.isSelected()){
                    
                     chb1.setDisable(true);
                     chb2.setDisable(true);
                     chb3.setDisable(true);
                     chb4.setDisable(true);
                     /*
                     chb5.setVisible(true);
                     chb6.setVisible(true);
                     chb7.setVisible(true);
                     chb8.setVisible(true);
                     */
                    if(chb5.isSelected()){
                        testo = testo+"\n\n\nLa frutta scelta è la Pera";

                    }
                     if(chb6.isSelected()){
                        testo = testo+"\n\nLa frutta scelta è la Mela";
                    }
                      if(chb7.isSelected()){
                        testo = testo+"\n\nLa frutta scelta è la Banana";
                    }
                       if(chb8.isSelected()){
                        testo = testo+"\n\nLa frutta scelta è il Kiwi";
                    }

                }
                //TxtArea.setText(x); // .setText--> è un metodo del TextField che mette il testo dato in parametro (in questo caso x)
                                            // lo fa comparire sulla finestra grafica esattamente nella casella di testo corrispettiva
                txt.setText(testo);
                System.out.println("Fatto!! ");
            }
        });
        
        
        rdn7.setOnAction(new EventHandler<ActionEvent>() {
            
          @Override
        public void handle(ActionEvent event) {
            
            if(rdn7.isSelected()){
                 Image image1 = new Image(EsGIUGNO2016.class.getResourceAsStream("ristorante.png"));
                 selectedImage.setImage(image1);
            selectedImage.setVisible(true);
            }  
            
           }
        });
        
      // ToolBar toolbar = new ToolBar();
        VBox statusbar = new VBox(90);
        //borderpane.setTop(toolbar);
        //borderpane.setBottom(statusbar);
        statusbar.setAlignment(Pos.TOP_RIGHT);
        
        statusbar.getChildren().add(txt);
        statusbar.getChildren().add(selectedImage);
       // statusbar.getChildren().addAll(txt);
        
        GridPane root = new GridPane(); // GridPane è una classe per il layout (posizionamento dell'oggetto all'interno di una griglia)
        
         root.setAlignment(Pos.TOP_LEFT);
         root.setHgap(20);
         root.setVgap(40);
         root.setPadding(new Insets(20, 10, 0, 20)); // .setPadding è un metodo della classe GridPane che crea gli spazi dentro la griglia
                                                    //tra gli oggetti e i bordi
                                                
       
        root.add(lbl1, 0, 0);
        root.add(txt1, 1, 0);
        
        root.add(lbl2, 0, 1);
        root.add(cbx, 1, 1);
        
        root.add(lbl3, 0, 2);
        root.add(rdn1, 1, 2);
        root.add(rdn2, 2, 2);
        
        root.add(lbl4, 0, 3);
        root.add(rdn3, 1, 3);
        root.add(rdn4, 2, 3);
        
        root.add(lbl5, 0, 4);
        root.add(rdn5, 1, 4);
        root.add(rdn6, 2, 4);
        
        root.add(lbl6, 1, 6);
        root.add(chb1, 1, 7);
        root.add(chb2, 1, 8);
        root.add(chb3, 1, 9);
        root.add(chb4, 1, 10);
        
        root.add(lbl7, 2, 6);
        root.add(chb5, 2, 7);
        root.add(chb6, 2, 8);
        root.add(chb7, 2, 9);
        root.add(chb8, 2, 10);
        
        root.add(btn1, 1, 11);
        root.add(btn2, 0, 11);
        root.add(rdn7, 2, 11);
        //root.add(txt, 3, 1);
        //root.add(statusbar, 4, 10);
        

        BorderPane borderpane = new BorderPane();
        borderpane.setLeft(root); //.setLeft è un metodo della classe BorderPane che mi serve per posizionare l'elemento al Left
        borderpane.setRight(statusbar);
        borderpane.setPadding(new Insets(20, 10, 20, 20)); 
        
        //borderpane.setRight(selectedImage);
        //borderpane.setAlignment(selectedImage, Pos.BOTTOM_RIGHT);
        // ListView list = new ListView();
        // BorderPane.setAlignment(list, Pos.BOTTOM_RIGHT);
        // BorderPane.setMargin(list, new Insets(12,12,12,12));
        //borderpane.getChildren().addAll(txt, selectedImage);
        
        
        Scene scene = new Scene(borderpane, 300, 250);
        
        finestra.setTitle("Menù ristorante");
        finestra.setScene(scene);
        finestra.setWidth(850);
        finestra.setHeight(770);
        finestra.setResizable(false);
        finestra.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

package control;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Model.FileReadWrite;
import Model.SongList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Controller {
	//FXML vars
    @FXML
     ResourceBundle resources;

    @FXML
     URL location;

    @FXML
     TextField addAlbum;

    @FXML
     TextField addArtist;

    @FXML
     TextField addName;

    @FXML
     Button addSongButton;

    @FXML
     TextField addYear;

    @FXML
     Label album;

    @FXML
     Label artist;

    @FXML
     Button closeButton;

    @FXML
     Button deleteButton;

    @FXML
     TextField editAlbum;

    @FXML
     TextField editArtist;

    @FXML
     TextField editName;

    @FXML
     Button editSongButton;

    @FXML
     TextField editYear;

    @FXML
     ListView<String> listView;
 
    

    @FXML
     Label messageDialog;

    @FXML
     Label name;

    @FXML
     Button undoAddButton;

    @FXML
     Button undoDeleteButton;

    @FXML
     Button undoEditButton;

    @FXML
     Label year;
  
private ObservableList<String> obsList;
    
    public void start(Stage mainStage){
    	obsList = FXCollections.observableArrayList();
    	listView.setItems(obsList);
    	listView.getSelectionModel().select(0);
    	listView.getSelectionModel().selectedItemProperty().addListener(
    			(obs, oldVal, newVal) ->
    				showItem(mainStage));
    	
    }
    
    private void showItem(Stage mainStage){
    	
    }

    //SOngList data structure
    public SongList generatelist(){
	    try{
	    SongList list = FileReadWrite.createSongList();
	    return list;
	    }catch(IOException e){
	    	throw new RuntimeException(e);
	    }   
    }
    
    SongList list = generatelist();
    
    @FXML
    void addSong(ActionEvent event) {
    	list.addSong(addName.getText(), addArtist.getText(), addAlbum.getText(), addYear.getText());
    }

    @FXML
    void close(ActionEvent event) {
    }

    @FXML
    void deleteSong(ActionEvent event) {
    }

    @FXML
    void editSong(ActionEvent event) {
    }

    @FXML
    void undoAdd(ActionEvent event) {
    }

    @FXML
    void undoDelete(ActionEvent event) {
    }

    @FXML
    void undoEdit(ActionEvent event) {
    }

    @FXML
    void initialize() {
        assert addAlbum != null : "fx:id=\"addAlbum\" was not injected: check your FXML file 'Layout.fxml'.";
        assert addArtist != null : "fx:id=\"addArtisit\" was not injected: check your FXML file 'Layout.fxml'.";
        assert addName != null : "fx:id=\"addName\" was not injected: check your FXML file 'Layout.fxml'.";
        assert addSongButton != null : "fx:id=\"addSongButton\" was not injected: check your FXML file 'Layout.fxml'.";
        assert addYear != null : "fx:id=\"addYear\" was not injected: check your FXML file 'Layout.fxml'.";
        assert album != null : "fx:id=\"album\" was not injected: check your FXML file 'Layout.fxml'.";
        assert artist != null : "fx:id=\"artist\" was not injected: check your FXML file 'Layout.fxml'.";
        assert closeButton != null : "fx:id=\"closeButton\" was not injected: check your FXML file 'Layout.fxml'.";
        assert deleteButton != null : "fx:id=\"deleteButton\" was not injected: check your FXML file 'Layout.fxml'.";
        assert editAlbum != null : "fx:id=\"editAlbum\" was not injected: check your FXML file 'Layout.fxml'.";
        assert editArtist != null : "fx:id=\"editArtist\" was not injected: check your FXML file 'Layout.fxml'.";
        assert editName != null : "fx:id=\"editName\" was not injected: check your FXML file 'Layout.fxml'.";
        assert editSongButton != null : "fx:id=\"editSongButton\" was not injected: check your FXML file 'Layout.fxml'.";
        assert editYear != null : "fx:id=\"editYear\" was not injected: check your FXML file 'Layout.fxml'.";
        assert listView != null : "fx:id=\"listView\" was not injected: check your FXML file 'Layout.fxml'.";
        assert messageDialog != null : "fx:id=\"messageDialog\" was not injected: check your FXML file 'Layout.fxml'.";
        assert name != null : "fx:id=\"name\" was not injected: check your FXML file 'Layout.fxml'.";
        assert undoAddButton != null : "fx:id=\"undoAddButton\" was not injected: check your FXML file 'Layout.fxml'.";
        assert undoDeleteButton != null : "fx:id=\"undoDeleteButton\" was not injected: check your FXML file 'Layout.fxml'.";
        assert undoEditButton != null : "fx:id=\"undoEditButton\" was not injected: check your FXML file 'Layout.fxml'.";
        assert year != null : "fx:id=\"year\" was not injected: check your FXML file 'Layout.fxml'.";


    }

}

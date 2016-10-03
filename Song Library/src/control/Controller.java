package control;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import Model.FileReadWrite;
import Model.Node;
import Model.SongList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage; 

public class Controller {
	//add FXML widgets
	//BUTTONS
	@FXML Button deleteButton;
	@FXML Button undoDeleteButton;
	@FXML Button addSongButton;
	@FXML Button undoAddButton;
	@FXML Button editSongButton;
	@FXML Button undoEditButton;
	@FXML Button closeButton;
	
	//Song List
	@FXML ListView<String> listView;
	
	//Text Fields
	@FXML TextField addName;
	@FXML TextField editName;
	@FXML TextField addArtist;
	@FXML TextField editArtist;
	@FXML TextField addAlbum;
	@FXML TextField editAlbum;
	@FXML TextField addYear;
	@FXML TextField editYear;

	//Labels
	@FXML Label messageDialog;
	@FXML Label name;
	@FXML Label artist;
	@FXML Label album;
	@FXML Label year;


	//add Song to Songlist
	public void addSong(SongList list){
		
		list.addSong(addName.getText(), addArtist.getText(), addAlbum.getText(), Integer.parseInt(addYear.getText()));
		updateList(list);
	}
	
	//delete selected song
	public void delete(SongList list){
		Node n =list.search(name.getText(), artist.getText());
		list.delete(n);
		updateList(list);
	}
	
	/*
	 * close method
	 * Write SongList to file, then close app
	 */
	public void close(SongList list, File file) throws FileNotFoundException, UnsupportedEncodingException{
		FileReadWrite.saveToFile(file, list);
		//now close app
		Stage stage = (Stage) closeButton.getScene().getWindow();
	    stage.close();
	}
	
	//update the library list after a change, sort the list and print it to the UI
	public void updateList(SongList list){
		//sort list
		list.sort();
		//TODO rewrite list on UI
	}
	
	
	
	
	
}

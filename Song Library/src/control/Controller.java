package control;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField addAlbum;

    @FXML
    private TextField addArtisit;

    @FXML
    private TextField addName;

    @FXML
    private Button addSongButton;

    @FXML
    private TextField addYear;

    @FXML
    private Label album;

    @FXML
    private Label artist;

    @FXML
    private Button closeButton;

    @FXML
    private Button deleteButton;

    @FXML
    private TextField editAlbum;

    @FXML
    private TextField editArtist;

    @FXML
    private TextField editName;

    @FXML
    private Button editSongButton;

    @FXML
    private TextField editYear;

    @FXML
    private ListView<?> listView;

    @FXML
    private Label messageDialog;

    @FXML
    private Label name;

    @FXML
    private Button undoAddButton;

    @FXML
    private Button undoDeleteButton;

    @FXML
    private Button undoEditButton;

    @FXML
    private Label year;


    @FXML
    void addSong(ActionEvent event) {
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
        assert addArtisit != null : "fx:id=\"addArtisit\" was not injected: check your FXML file 'Layout.fxml'.";
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

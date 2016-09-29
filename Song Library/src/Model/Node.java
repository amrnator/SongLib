package Model;
/*
 * Node
 */
public class Node {
	//vars
	private String songName;
	private String artist;
	private String album;
	private int year;
	private Node next;
	//constructors
	public Node(String INsongName, String INartist){
		songName = INsongName;
		artist = INartist;
	}
	public Node(String INsongName, String INartist, String INalbum, int INyear ){
		songName = INsongName;
		artist = INartist;
		album = INalbum;
		year = INyear;
	}
	//set next node 
	public void setNextNode(Node n){
		this.next = n;
	}
	//returns next node
	public Node nextNode(){
		return next;
	}
	//Get Methods
	public int getYear(){
		return year;
	} 
	public String getArtist(){
		return artist;
	} 
	public String getAlbum(){
		return album;
	} 
	public String getSong(){
		return songName;
	} 
	//Set Methods
	public void setYear(int newYear){
		year = newYear;
	} 
	public void setArtist(String newArtist){
		artist = newArtist;
	} 
	public void setAlbum(String newAlbum){
		album = newAlbum;
	} 
	public void setSong(String newSong){
		songName = newSong;
	} 
}

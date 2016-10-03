package Model;

/*
 * SongList  is a class that implements the linked list data structure that
 * will hold song information.
 */

public class SongList {
	private Node start;
	private Node end;
	private int size = 0;
	/*
	 * addSong()
	 * adds a song node to the list
	 */
	public void addSong(String songName, String artist, String album, int year){
		//create Node
		Node nd = new Node(songName, artist, album, year);
		//connect node appropriately
		if(start == null){
			//list empty: add single node
			start = nd;
			end = nd;
		}else{
			//set end as next new node
			end.setNextNode(nd);
			//set end as new node
			end = nd;
		}
		size++;
	}
	/*
	 * Deletion method
	 * deletes an inputed node from the list
	 */
	public void delete(Node node){
		Node target = node;
		Node curr = start;
		Node prev = null;
		//check if the target is the start of the list
		if(target == start){
			//delete start
			start = start.nextNode();
			return;
		}
		//traverse this Songlist until we find the node we're looking for 
		while(curr != target){
			prev = curr;
			curr = curr.nextNode();
		}
		//delete node
		prev.next = curr.next;
		
	}
	/*
	 * search method
	 */
	public Node search(String name, String artist){
		Node tmp = start;
		//cycle through list
		while(tmp != null){
			if(tmp.getSong().equals(name) && tmp.getArtist().equals(artist)){
				break;
			}
			tmp = tmp.nextNode();
		}
		return tmp;
		
	}
	/*
	 * Get Methods:
	 *returns first node in list
	 */
	public Node getStart(){
		return start;
	}
	/*
	 * returns last node in list
	 */
	public Node getEnd(){
		return end;
	}
	/*
	 * returns # of nodes in list
	 */
	public int getSize(){
		return size; 
	}
	
	/*
	 * sorts SongList with bubble sort
	 */
	public void sort(){
		Boolean swap;
		
		Node ptr;
		Node lptr = null;
		do{
			swap = false;
			ptr = start;
			
			while(ptr.nextNode() != lptr){
				//orders by lex value of song names
				//if the preceding name has a higher lex val than its successor, switch
				if(ptr.getSong().compareTo(ptr.nextNode().getSong()) >= 0){
					swapNode(ptr, ptr.nextNode());
					swap = true;
				}
				ptr = ptr.nextNode();
			}
			lptr = ptr;
		}while(swap);
	}
	/*
	 * swaps values of nodes
	 * only used in sort()
	 */
	private void swapNode(Node a, Node b){
		String nameTemp = a.getSong();
		String artistTemp = a.getArtist();
		String albumTemp = a.getAlbum();
		int yearTemp = a.getYear();
		//put vals in a
		a.setSong(b.getSong());
		a.setArtist(b.getArtist());
		a.setAlbum(b.getAlbum());
		a.setYear(b.getYear());
		//put vals in b
		b.setSong(nameTemp);
		b.setArtist(artistTemp);
		b.setAlbum(albumTemp);
		b.setYear(yearTemp);
	}
}


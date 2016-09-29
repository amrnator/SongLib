package Model;
import java.io.*;
import java.util.StringTokenizer;

public class FileReadWrite {
	
	private static BufferedReader inputFile;
	
	//reads input from a text file and returns a Songlist
	public static SongList createSongList (File fileName) throws IOException{
		//vars
		SongList list = new SongList();
		String name;
		String artist;
		String album;
		String yearS;
		int year;
		
		try{
			//read from file
			FileReader x = new FileReader(fileName);
			//add buffer for safety reasons
			inputFile = new BufferedReader(x);
			
		}catch(FileNotFoundException ex){
			System.out.println("YOU FUCKED UP");
		}
		
		while(true){
			//get line
			String line = inputFile.readLine();
			if(line == null){ //break when we hit the end of the file
				break;
			}
			//tokenize the string
			StringTokenizer st = new StringTokenizer(line, ",");
			//add components to list
			//TODO allow for null input for album and year
			if(st.countTokens() == 4){	
				list.addSong(st.nextToken(), st.nextToken(), st.nextToken(), Integer.parseInt(st.nextToken()));
			}
		}
		//close file
		inputFile.close();
		//sort list before returning
		list.sort();
		return list;
	}
	public static void saveToFile(File file, SongList list){
	//TODO add functionality for writing list to file	
	}
}

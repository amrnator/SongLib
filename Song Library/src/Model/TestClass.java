package Model;

import java.io.File;
import java.io.IOException;

public class TestClass {

	public static void main(String[] args) throws IOException {
		File file = new File("src/Test.txt");
		SongList x = FileReadWrite.createSongList(file);
		x.addSong("My", "Name's", "Amr", 1289);
		x.sort();
		FileReadWrite.saveToFile(file, x);
		x.delete(x.getStart().next);
	}
}

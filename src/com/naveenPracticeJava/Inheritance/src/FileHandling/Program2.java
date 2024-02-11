package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Naveen Kancherla\\Documents\\Java Projects\\JavaPractice\\sampleText.txt");
		if(!file.exists()) 
			file.createNewFile();
		// FileInputStream and FileReader is almost same functionality...
		// FileReader
		FileInputStream fis = new FileInputStream(file);
		Scanner sc = new Scanner(fis);
		
		String text = new String();
		while(sc.hasNext()) {
			text += sc.nextLine()+"\n";
			
//			System.out.println(sc.nextLine());
		}
		System.out.println(text);
        fis.close();
        sc.close();
	}

}

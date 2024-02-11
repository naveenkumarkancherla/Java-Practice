package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Program1 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Naveen Kancherla\\Documents\\Java Projects\\JavaPractice\\sampleText.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		FileInputStream fis = new FileInputStream(file);
		int ascicode;
		String text = new String();
		System.out.println(fis.read());
        while((ascicode = fis.read()) != -1) {
        	text += String.valueOf((char)ascicode);
        	System.out.print((char)ascicode);
        }
        System.out.println();
//        System.out.println(text);
      
	}

}

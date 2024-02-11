package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Naveen Kancherla\\Documents\\Java Projects\\JavaPractice\\myTest.txt");
		System.out.println(file.exists());
		System.out.println(file.delete());  // This delete() is used to delete existing file in the directory.
		System.out.println(file.createNewFile());  // this will create new file in the directory
		System.out.println(file.isHidden());
		System.out.println(file.canWrite());
        file.setWritable(false);     //enabling(true) and disabling(false) writing options to the file
        File f = new File("C:\\Users\\Naveen Kancherla\\Documents\\Java Projects\\JavaPractice\\Folder\\test");
        System.out.println("Folder created = "+f.mkdirs()); // mkdir() is used to create new single folder if folder not exists mkdirs() is used to created new multiple folders
        System.out.println("Folder deleted = "+f.delete()); 
        
        File file2 = new File("C:\\\\Users\\\\Naveen Kancherla\\\\Documents\\\\Java Projects\\\\JavaPractice");
        for(String fileName:file2.list()) {
        	System.out.print(fileName+", ");
        }
        //or
        System.out.println();
        System.out.println(Arrays.toString(file2.list())); // list of all files in that mentioned directory
        // if you u want print whole directory path you can go to file2.listFiles()
        System.out.println(Arrays.toString(file2.listFiles()));
        //if you want to get file name which is there in the mentioned directory you get using file2.getName()
        System.out.println(file.getName());
        // still we have lot of operation in file we can perform those operations by file2.operationName() methods
	}

}

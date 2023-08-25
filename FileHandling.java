import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        File newFile = new File("FileHandling.txt");

        // For creating file.
        newFile.createNewFile();

        // For write in file    Note : When we use FileWrite if there is no file then it automatically create file
        FileWriter TestFile = new FileWriter(newFile,true);
        TestFile.write("\ntest");
        TestFile.close();

        // For read a the file
        Scanner sc = new Scanner(newFile);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }    
}
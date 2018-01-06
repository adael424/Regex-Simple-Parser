package parser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileHandler {

    public Scanner openFile(String fileName){
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("File " + fileName + " not found.");
        }
            return scanner;
    }
}

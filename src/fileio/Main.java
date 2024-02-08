package fileio;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // 1. Introduction to File I/O
        // Here is an example show how to read file (view) from local drive
        try{
            FileReader fileReader = new FileReader("src/file/Textfile.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}

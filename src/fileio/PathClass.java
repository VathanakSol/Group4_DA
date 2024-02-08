package fileio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class PathClass {
    public static void main(String[] args) {
        // create path for directory file
        Path path = Paths.get("src/file/Textfile2.txt");
        try {
            // print all contexts in file follow path
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

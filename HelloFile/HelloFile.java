import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HelloFile {
    public static void main(String[] args) {
        String filePath = "./Hello.txt";

        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch(IOException e) {    
            System.err.println(e);
        }
    }
}
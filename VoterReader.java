import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class VoterReader {
    
    public Voter[] loadVoters(String fileName){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("\n=-= Data from file " + fileName + " =-=");
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            System.out.println("---------------------------------------------------\n");
        } catch(IOException e) {
            System.out.println("< File not found >");
            System.out.println("---------------------------------------------------\n");
        }
        return null;
    }
}

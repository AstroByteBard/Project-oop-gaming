import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class VoterReader {

    private Voter[] voters = null;

    public void printVotesArray(String fileName) {
        loadVoters(fileName);
    }
    
    public Voter[] loadVoters(String fileName){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while((line = reader.readLine()) != null)
                System.out.println(reader.readLine());
            reader.close();
        } catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("load successfully form " + fileName);
        return null;
    }
}

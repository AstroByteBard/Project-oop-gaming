import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class VoterReader {

    private Voter[] voters = null;

    public Voter[] getVote(){
        return voters;
    }

    public void start(String filename){

        voters = loadVoter(filename);
        if (voters != null) {
            printArray(voters);
        }
    }

    public Voter[] loadVoter(String fileName){
        try (DataInputStream din = new DataInputStream(new FileInputStream(fileName))){
            Voter[] voters = new Voter[din.readInt()];
            for (int i = 0; i < voters.length ;i++){
            
                Voter a = new Voter(din.readUTF());
                voters[i]=a;
            }
            return voters;
        }catch (IOException e){
            System.out.println("Error");
        }
        System.out.print("Voter loaded successfully from" + fileName + "!");
        return null;
    }

    public void printArray(Voter[] voters) {
        System.out.println("voters Collection");
        System.out.println("================");
        
        for (Voter voter : voters) {
            System.out.println(voter.toString());
        }

    }
}

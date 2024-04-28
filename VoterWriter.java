import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class VoterWriter {
    
    public void start(ArrayList<Voter> voters,String FileName){
        //Create
        savefile(FileName, voters);
    }

    protected void savefile(String FileName,ArrayList<Voter> voters){
		try  {
			BufferedWriter writer = new BufferedWriter(new FileWriter(FileName));
			for (Voter v : voters){
				writer.write("ID : " + v.getId() + " | choose : " + v.scoreCount() + " \n");
			}
			writer.close();
		} catch (IOException e){
			System.out.println("< File not found >");
		}
	}

}

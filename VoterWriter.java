import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class VoterWriter {
    
    public void start(Voter[] voters,String FileName){
        //Create
        savefile(FileName, voters);
    }

    protected void savefile(String FileName,Voter[] voters){
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

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class VoterWriten {
    
    public void start(Voter[] voters,String FileName){
        //Create
        savefile(FileName, voters);
    }

    protected void savefile(String FileName,Voter[] voters){
        try  {
			BufferedWriter writer = new BufferedWriter(new FileWriter(FileName));
			for (Voter v : voters){
				writer.write("Name : " + v.getName() + " President : " + v.calculateCount() + " \n");
			}
			writer.close();
			System.out.println("Voters saved successfully to " + FileName + "!");
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}

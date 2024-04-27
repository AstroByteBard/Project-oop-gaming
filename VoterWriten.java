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
			/*if (FileName == null || voters == null) {
				return; 
			*/
			BufferedWriter writer = new BufferedWriter(new FileWriter(FileName));
			for (Voter v : voters){
				writer.write("ID : " + v.getId() + " President : " + v.calculateCount() + " \n");
			}
			writer.close();
			System.out.println("Voters saved successfully to " + FileName + "!");
		} catch (IOException e){
			e.printStackTrace();
		}
	}

}

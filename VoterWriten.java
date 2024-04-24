import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class VoterWriten {
    
    public void start(Voter[] voters,String FileName){
        //Create
        savefile(FileName, voters);
    }

    protected void savefile(String FileName,Voter[] voters){
        try (DataOutputStream dOut = new DataOutputStream(new FileOutputStream(FileName))){
			dOut.writeInt(voters.length);
			for (Voter v : voters)
			{
				dOut.writeUTF(v.getName());  // ชื่อ
                dOut.writeUTF(v.calculateCount());
				
			}
		} catch (IOException e) {
			System.out.println("Error");
		}

		System.out.println("Voters saved successfully to " + FileName + "!");
	}
}

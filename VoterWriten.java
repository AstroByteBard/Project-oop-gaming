import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class VoterWriten {
    String FileName = "VoteTest"; //เก็บไว้ตั้งชื่อไฟล์

    public void setFileName(String FileName){
        this.FileName = FileName;
    }
    public void start(Voter[] voters){
        //Create
        savefile(FileName, voters);
    }

    protected void savefile(String FileName,Voter[] voters){
        try (DataOutputStream dOut = new DataOutputStream(new FileOutputStream(FileName))){
			dOut.writeInt(voters.length);
			for (Voter v : voters)
			{
				dOut.writeUTF(v.getName());  // ชื่อ
				
			}
		} catch (IOException e) {
			System.out.println("Erorr");
		}

		System.out.println("Voters saved successfully to " + FileName + "!");
	}
}

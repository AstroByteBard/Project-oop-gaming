import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Voter_Writer {

    String fileName = null;

    Scanner keyboard = new Scanner(System.in);

    public void setFileName(String fileName) {
		this.fileName = fileName;
	}

    public void start(){

        // ตั้งชื่อไฟล์ที่กำลังสร้าง
        if(fileName == null) {
			System.out.print("Enter a file name: ");
			fileName = keyboard.next();
		}

        savefile();
    }

    protected void savefile(String fileName, //Array ) {
		
	}
     
}
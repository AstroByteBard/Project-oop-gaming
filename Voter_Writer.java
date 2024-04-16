import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
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

        savefile(  );
    }

    protected void savefile( /* Array */ ) {
		try  {
            BufferedWriter writer = new BufferedWriter(new FileWriter (fileName));
            
            // เขียนข้อมูลใน Array
            for (int i = 0 ; i < i ; i++)
            {
                writer.write(String.valueOf( /*  Array[i]  */));
            }
            
            // ปิดไฟล์
            Writer.close();
            System.out.println("เขียนไฟล์เสร็จสิ้น");
        }  catch (IOException e){
            System.out.println("เป็นควยไรสัส บัคทำเหี้ยไร");
        }
	}
}
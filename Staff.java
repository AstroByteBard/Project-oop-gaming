import java.util.Scanner;

class Staff implements Information_Voter {

    private String Name_Staff; 
    private int Password_Staff;
    Scanner keybord = new Scanner(System.in);

    public String Information_name(){
        System.out.print("Enter Your Name :");
        Name_Staff = keybord.nextLine();
        return Name_Staff;
    }
    public int Information_Age(){
        return 0;
    }
}

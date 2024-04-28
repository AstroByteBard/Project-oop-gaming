import java.util.Scanner;

public class Staff extends Voting {

    static Scanner keyboard = new Scanner(System.in);
    
    //Override
    public static int menu(){
        System.out.println("\n=-=-= Staff =-=-=");
        System.out.println("1. Set amount of voters");
        System.out.println("2. Check voting");
        System.out.println("3. Print information of voting");
        System.out.println("4. Exit");
        try {
            System.out.print("Choose (1 , 2 , 3 or 4)... ");
            int Choose = Integer.parseInt(keyboard.next());
            return Choose;
        } catch (NumberFormatException e) {
            System.out.println("\n< !! Input error, Please enter integer number !! >");
            System.out.println("---------------------------------------------------\n");
            return -999;
        } 
    }

}
import java.util.Scanner;

public class Voting {

    //Revise word
    
    private static Scanner keyboard = new Scanner(System.in);
    private static int scoreA = 0;
    private static int scoreB = 0;
    private static String president = null;

    public static void Showscore(){
        System.out.println("< A : " + scoreA + " votes >");
        System.out.println("< B : " + scoreB + " votes >");
        System.out.println("---------------------------------------------------\n");
    }

    private static void Ans(){
        System.out.print("Choose (A or B)... ");
        String Score = keyboard.next();
        if (Score.equals("A") || Score.equals("a") || Score.equals("B") || Score.equals("b")) {
            if (Score.equals("A")) {
                scoreA = scoreA + 1;
            } 
            if (Score.equals("B")) {
                scoreB = scoreB + 1;
            }
        } else { 
            System.out.println("< Not correct, try again >");
        }
    }

    public String scoreCount(){
        if ( scoreA > scoreB) {
            president = "A";
        }else {
            president = "B";
        }
        return president;
    }

    public static void Vote(){
        System.out.println("\n=-=-= Name President =-=-=");
        System.out.println("A. A");
        System.out.println("B. B");
        Ans();
        System.out.println("=-=-= Voting successful =-=-=");
        System.out.println("---------------------------------------------------");
    }

    public static int menu(){
        System.out.println("\n=-=-= Welcome to super earth voting =-=-=");
        System.out.println("1. Vote ");
        System.out.println("2. Voting information (For staff)");
        System.out.println("3. Quit");
        try {
            System.out.print("Choose (1 , 2 or 3)... ");
            int Choose = Integer.parseInt(keyboard.next());
            return Choose;
        } catch (NumberFormatException e) {
            System.out.println("\n< !! Input error, Please enter integer number !! >");
            System.out.println("---------------------------------------------------\n");
            return -999;
        }
    } 
}

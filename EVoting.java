import java.util.Scanner;
import java.lang.NumberFormatException;
import java.lang.NullPointerException;

public class EVoting {

    //data not save in same file

    static Scanner keyboard = new Scanner(System.in);
    public static Voter[] voters;
    private static int numVoters[];
    private static String file;
    private static int choose;

    private static int menuStaff(){
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

    private static void staff(){
        while (true) {
            int staffChoose = menuStaff();
            int userInput = 0;
            switch (staffChoose) {
                case 1:
                try {
                    System.out.print("\nEnter number for voter : ");
                    userInput = Integer.parseInt(keyboard.next());
                    if (userInput < 1) {
                        System.out.println("\n< !! Input error, Please enter positive integer number !! >");
                        System.out.println("---------------------------------------------------\n");
                        staff();
                    }
                } catch (NumberFormatException e) {
                    System.out.println("\n< !! Input error, Please enter integer number !! >");
                    System.out.println("---------------------------------------------------\n");
                    staff();
                }
                System.out.print("Name a file : ");
                file = keyboard.next();
                numVoters = new int[userInput];
                System.out.println("\n< Set voters successful >");
                if (userInput > 1) {
                    System.out.println("< There are " + userInput + " voters, store data in file " + file + " >");
                } else {
                    System.out.println("< There is " + userInput + " voter, store data in file " + file + " >");
                }
                System.out.println("---------------------------------------------------\n");
                staff();
                break;

                case 2:
                System.out.print("\n=-= Check Voting =-=\n");
                Voting.Showscore();
                staff();
                break;

                case 3:
                System.out.print("\nEnter file Name : "); 
                file = keyboard.next();
                new VoterReader().loadVoters(file);
                staff();
                break;

                case 4:
                System.out.println("---------------------------------------------------\n");
                break;

                default:
                if (staffChoose == -999) {
                    System.out.println();
                }
                else {
                    System.out.println("\n< !! Input error, Please enter 1 , 2 , 3 or 4 !! >");
                    System.out.println("---------------------------------------------------\n");
                }
                staff();
                break;
            }break;
        }
    }

    private static int menu(){
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

    private static void userChoice(){
        while (true) {
            int userChoose = menu();
            choose = userChoose;
            switch (choose) {
                case 1:
                try {
                    if (numVoters.length > 0) {
                        System.out.println("\n=-=-= Chose President =-=-=");
                        voters = new Voter[numVoters.length]; 
                        numVoters = new int[0];
                        for (int i = 0; i < voters.length; i++) {
                            try {
                                System.out.print("\nEnter id : ");
                                int id = Integer.parseInt(keyboard.next()); //cant fix input with - operator (try to exception -)
                                voters[i] = new Voter(id);
                                Voting.Vote();
                            } catch (NumberFormatException e) {
                                System.out.println("\n< !! Input error, Please enter integer number !! >");
                                System.out.println("---------------------------------------------------\n");
                            }
                        }
                        new VoterWriter().savefile(file, voters);
                    }
                } catch(NullPointerException e) {
                    System.out.println("\n< !! Please let the staff determine the amount for voters first !! >");
                    System.out.println("---------------------------------------------------\n");
                }
                break;

                case 2:
                System.out.println("\n=-= Staff login =-=");
                System.out.print("Enter staff password: ");
                String password = keyboard.next();
                if (password.equals("0")){
                    System.out.println("< Correct password >");
                    staff();
                }
                else {
                    System.out.println("< Wrong password >\n");
                }
                break;

                case 3:
                System.out.println("\n=-=-= Thank you for using our service =-=-=");

                return;
                
                default:
                    System.out.println("\n< !! Input error, Please enter 1 , 2 or 3 !! >");
                    System.out.println("---------------------------------------------------\n");
                break;
            } 
        }
    }

    public static void main(String[] args) {
        while (choose != 3) {
            userChoice();
            System.out.println("\n");
        }
    }
}


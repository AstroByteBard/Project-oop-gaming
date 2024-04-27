import java.util.Scanner;
import java.lang.NumberFormatException;

public class EVoting {

    //data not save in same file

    static Scanner keyboard = new Scanner(System.in);
    public static Voter[] voters;
    private static int numVoters[];
    private static String file;
    private static int choose;

    private static int menuStaff(String name){
        System.out.println("\n=-=-= Staff =-=-=\n... Welcome Sir " + name + " ...");
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

    private static void staff(String name){
        while (true) {
            int staffChoose = menuStaff(name);
            int userInput = 0;
            switch (staffChoose) {
                case 1:
                try {
                    System.out.print("\nEnter number for voter : ");
                    userInput = Integer.parseInt(keyboard.next());
                    if (userInput < 1) {
                        System.out.println("\n< !! Input error, Please enter positive integer number !! >");
                        System.out.println("---------------------------------------------------\n");
                        staff(name);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("\n< !! Input error, Please enter integer number !! >");
                    System.out.println("---------------------------------------------------\n");
                    staff(name);
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
                staff(name);
                break;

                case 2:
                System.out.print("\n=-= Check Vote =-=\n");
                Voting.Showscore();
                staff(name);
                break;

                case 3:
                System.out.println("Print voting");
                System.out.print("Enter file Name : "); 
                file = keyboard.next();
                new VoterReader().printVotesArray(file);
                staff(name);
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
                staff(name);
                break;
            }break;
        }
    }

    private static int menu(){
        System.out.println("\n=-=-= Welcome to super earth =-=-=");
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
                if (numVoters.length > 0) {
                    System.out.print("\nVoter\n");
                    voters = new Voter[numVoters.length]; 
                    numVoters = new int[0];
                    for (int i = 0; i < voters.length; i++) {
                        System.out.print("=-=-= Chose President =-=-=\nEnter student id : ");
                        try {
                            int id = Integer.parseInt(keyboard.next()); //cant fix input with - operator (try to exception -)
                            voters[i] = new Voter(id);
                            Voter.Vote();
                        } catch (NumberFormatException e) {
                            System.out.println("\n< !! Input error, Please enter integer number !! >");
                            System.out.println("---------------------------------------------------\n");
                        }
                    }
                    new VoterWriten().savefile(file, voters);
                }
                else {
                    System.out.println("\n< !! Please let the staff determine the amount for voters first !! >");
                    System.out.println("---------------------------------------------------\n");
                }
                break;

                case 2:
                System.out.print("\n=-= Staff login =-=\nEnter your name: ");
                String name = keyboard.next();
                System.out.print("Enter staff password: ");
                String password = keyboard.next();
                if (password.equals("0")){
                    System.out.println("< Correct password >");
                    staff(name);
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


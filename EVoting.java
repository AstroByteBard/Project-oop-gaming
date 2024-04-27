import java.util.Scanner;
import java.lang.NumberFormatException;

public class EVoting {

    static Scanner keyboard = new Scanner(System.in);
    public static Voter[] voters;
    private static int numVoters;
    private static String file;

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
            switch (staffChoose) {
                case 1:
                System.out.print("Enter Number for voter : ");
                numVoters = keyboard.nextInt();
                System.out.print("Enter name for file : ");
                file = keyboard.next();
                break;

                case 2:
                System.out.print("\nCheck Vote ");
                Voter.Showscore();
                break;

                case 3:
                System.out.println("Print voting");
                System.out.print("Enter file Name : "); //bangkok
                file = keyboard.next();
                new VoterReader().printVotesArray(file);
                break;

                case 4:
                System.out.println("\n---------------------------------------------------\n");
                break;

                default:
                if (staffChoose == -999) {
                    System.out.println();
                }
                else {
                    System.out.println("\n< !! Input error, Please enter 1 , 2 , 3 or 4 !! >\n");
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
            switch (userChoose) {
                case 1:
                if (numVoters > 0) {
                    System.out.print("\nVoter\n");
                    voters = new Voter[numVoters]; 
                    for (int i = 0; i < numVoters; i++) {
                        System.out.print("----------Chose President----------\n A.Mark\n B.Plum\n-----------------------------------\nEnter voter name " + (i+1) + ": ");
                        String name = keyboard.next();
                        voters[i] = new Voter(name);
                        Voter.Vote();
                    }
                    new VoterWriten().savefile(file, voters);
                }
                else {
                    System.out.println("\n< !! Please let the staff determine the amount for voters first !! >\n");
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
        while (true) {
            userChoice();
            System.out.println("\n");
        }
    }
}


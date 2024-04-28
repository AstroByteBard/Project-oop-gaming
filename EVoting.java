import java.util.ArrayList;
import java.util.Scanner;
import java.lang.NumberFormatException;
import java.lang.NullPointerException;

public class EVoting {

    //data not save in same file

    static Scanner keyboard = new Scanner(System.in);
    private static ArrayList<Voter> voters = new ArrayList<>();
    private static String file;
    private static int choose;
    private static int numVoters;
    
    Voting voter = new Voting();
    Staff staff = new Staff();

    private static void staff(){
        while (true) {
            int staffChoose = Staff.menu();
            int userInput = 0;
            switch (staffChoose) {
                case 1:
                try {
                    System.out.print("\n=-=-= Set amount of voter =-=-=\nEnter number for voter : ");
                    numVoters = keyboard.nextInt();
                    if (numVoters < 1) {
                        System.out.println("\n< !! Input error, Please enter positive integer number !! >");
                        System.out.println("----------------------------------------------------\n");
                        staff();
                    }
                } catch (NumberFormatException e) {
                    System.out.println("\n< !! Input error, Please enter integer number !! >");
                    System.out.println("---------------------------------------------------");
                    staff();
                }
                System.out.print("Name a file : ");
                file = keyboard.next();
                System.out.println("\n< Set voters successful >");
                if (userInput > 1) {
                    System.out.println("< There are " + numVoters + " voters, store data in file " + file + " >");
                } else {
                    System.out.println("< There is " + numVoters + " voter, store data in file " + file + " >");
                }
                System.out.println("---------------------------------------------------\n");
                staff();
                break;

                case 2:
                System.out.print("\n=-=-= Check Voting =-=-=\n");
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

    private static void userChoice(){
        while (true) {
            int userChoose = Voting.menu();
            choose = userChoose;
            switch (choose) {
                case 1:
                try {
                    if (numVoters > 0) {
                        System.out.println("=-=-= Chose President =-=-=");
                        for (int i = 0; i < numVoters; i++) {
                            try {
                                System.out.print("Enter voter ID: ");
                                int id = keyboard.nextInt();
                                voters.add(new Voter(id));
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
                System.out.println("\n=-=-= Staff login =-=-=");
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

                case -999:
                break;
                
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


import java.util.Scanner;

public class EVoting {

    static Scanner keyboard = new Scanner(System.in);
    public static Voter[] voters;
    private static int numVoters;
    private static String file;

    private static int Menu_Staff(String name){
        System.out.println("\n=-=-= Staff =-=-=");
        System.out.println("\nWelcome Sir " + name + "\n");
        System.out.println("1. Set amount of voters");
        System.out.println("2. Check voting");
        System.out.println("3. Print information of voting");
        System.out.println("4. Exit");
        System.out.print("Choose (1 , 2 , 3 or 4)... ");
        int Choose = keyboard.nextInt();
        return Choose;
    }

    private static int welcome (){
        System.out.println("\n=-=-= Welcome to super earth =-=-=");
        System.out.println("1. Vote");
        System.out.println("2. Voting information (For staff)");
        System.out.println("3. Quit");
        System.out.print("Choose (1 , 2 or 3)... ");
        int Choose = keyboard.nextInt();
        return Choose;
    } 

    public static void main(String[] args) {
        while (true) {
            switch (welcome()) {

            case 1:
                if (numVoters > 0) {
                    System.out.print("\nVoter\n");
                    voters = new Voter[numVoters]; 
                    for (int i = 0; i < numVoters; i++) {
                        System.out.print("Enter name for voter " + (i+1) + ": ");
                        String name = keyboard.next();
                        voters[i] = new Voter(name);
                        Voter.Vote();
                    }
                    new VoterWriten().savefile(file, voters);
                }
                else {
                    System.out.println("\n!! Please let the staff determine the amount for voters first!!");
                }
                break;
            case 2:

                System.out.print("\n-------- Staff -------- \nEnter your name: ");
                String name = keyboard.next();
                System.out.print("Enter staff password: ");
                String password = keyboard.next();

                while (true) {
                    if (password.equals("00000")){
                        switch (Menu_Staff(name)) {
                            case 1:
                                System.out.print("Enter Number for voter : ");
                                numVoters = keyboard.nextInt();
                                System.out.print("Enter file Name : ");
                                file = keyboard.next();
                                break;
                            case 2:
                                System.out.print("\nCheck Vote ");
                                Voter.Showscore();
                                break;
    
                            case 3:
                                System.out.println("Print voting");
                                System.out.print("Enter file Name : ");
                                file = keyboard.next();
                                new VoterReader().printVotesArray(file);
                                break;
    
                            case 4:
                                break;
    
                            default:
                                System.out.println("Out of Service");
                                break;
                        }
                        break;
                    }
                    else {
                        System.out.println("\n=-=-= Wrong password, please try again =-=-=");
                        break;
                    }
                }
                break; 

            case 3:
                System.out.println("\n=-=-= Thank you for using our service =-=-=");
                return;
            default:
                System.out.println("\n=-=-= Out of Service =-=-=");
                break;
        } 
        }
    }

}

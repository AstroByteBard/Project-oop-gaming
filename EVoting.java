import java.util.Scanner;

public class EVoting {

    static Scanner keyboard = new Scanner(System.in);
    public static Voter[] voters;
    private static int numVoters;

    private static int Menu_Staff(String name){
        System.out.println("\nWelcome Sir. " + name + "\n");
        System.out.println("1. Setting Voter");
        System.out.println("2. Cheak Voting ");
        System.out.println("3. Print Information for Voter ");
        System.out.println("4. Exit");
        System.out.print("Choose... ");
        int Choose = keyboard.nextInt();
        return Choose;
    }

    private static int welcome (){
        System.out.println("\nWelcome to super earth");
        System.out.println("1. Voter");
        System.out.println("2. Staff");
        System.out.println("3. Out");
        System.out.print("Choose... ");
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
                    new VoterWriten().start(voters);
                }
                else {
                    System.out.println("Plss Selcen First");

                }
                break;
            case 2:

                System.out.print("\n-------- Staff -------- \nEnter your name: ");
                String name = keyboard.next();

                while (true) {
                    switch (Menu_Staff(name)) {
                        case 1:
                            System.out.print("Enter Number for voter : ");
                            numVoters = keyboard.nextInt();
                            break;
                        case 2:
                            System.out.print("\nCheck Vote ");

                            break;
    
                        case 3:
                            System.out.println("Print voting");
                            break;
    
                        case 4:
                            break;
    
                        default:
                            break;
                    }
                    break; 
                }
                break; 

            case 3:
                return;
            default:
                System.out.println("Out of Service");
                break;
        } 
        }
    }
}

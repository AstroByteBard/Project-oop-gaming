import java.util.Scanner;

class Voting {

    Scanner keyboard = new Scanner(System.in);
    public static int Choose;
    public static String name;
    public static int age;
    public static int Password;

    private int welcome (){
        System.out.println("Welcome everyone this is Online Voting");
        System.out.println("1. Voter");
        System.out.println("2. Staff");
        System.out.println("3. Out");
        System.out.print("Choose...");
        Choose = keyboard.nextInt();
        return Choose;
    } 

    public static void main(String arg[]){
        Voting voting = new Voting();
        voting.welcome();

        switch (Choose) {
            case 1:
                System.out.print("\nVoter \nEnter your name: ");
                name = voting.keyboard.next();
                System.out.print("Enter your age: ");
                age = voting.keyboard.nextInt();

                Voter voter = new Voter(name, age);
                voter.CONCLUSION();
                break;
            case 2:
                System.out.print("\nStaff \nEnter your name: ");
                name = voting.keyboard.next();
                System.out.print("Enter you Password: ");
                Password = voting.keyboard.nextInt();
                Staff staff = new Staff(name, Password);

                break;
            default:
                break;
        } 
    }
}
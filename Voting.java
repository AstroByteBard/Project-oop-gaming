import java.util.Scanner;

class Voting {

    public int Choose = 0;
    Scanner keybord = new Scanner(System.in);

    private int welcome (){
        System.out.println("Welcome Everyone This is Voting Online");
        System.out.println("1. Voter");
        System.out.println("2. Staff");
        System.out.println("3. Out");
        System.out.print("Choose...");
        Choose = keybord.nextInt();
        return Choose;
    } 

    public static void main(String arg[]){
        Voting voting = new Voting();
        voting.welcome();

        switch (voting.Choose) {
            case 1:
                System.out.println();
                break;
            case 2:
                System.out.print("Enter You Name: ");
                String Name = voting.keybord.next();
                System.out.print("Enter you Password: ");
                int Password = voting.keybord.nextInt();
                Staff staff = new Staff(Name, Password);
                staff.getname();
                break;
            default:
                break;
        } 
    }
}
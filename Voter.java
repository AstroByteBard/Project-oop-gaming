import java.util.Scanner;

public class Voter extends Voting {
    
    static Scanner keyboard = new Scanner(System.in);
    private int id;

    public Voter (int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

}

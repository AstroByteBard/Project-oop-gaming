import java.util.Scanner;

public class Voter extends Voting {
    
    static Scanner keyboard = new Scanner(System.in);
    private int id;
    private String choose;

    public Voter (int id, String choose){
        this.id = id;
        this.choose = choose;
    }

    public int getId(){
        return id;
    }

    public String getChoose(){
        return choose;
    }

}

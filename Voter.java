public class Voter extends Voting {
    
    private int id;

    public Voter (int id){
        this.id = id;
    }
    
    public static void Vote(){
        Question();
    }

    public int getId(){
        return id;
    }

}

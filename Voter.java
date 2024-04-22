public class Voter extends Voting{
    
    private String Name;

    public Voter (String name){
        Name = name;
    }
    
    public static void Vote(){
        Question();
    }

    public String showname(){
        return Name;
    }

}

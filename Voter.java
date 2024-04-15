import java.util.Scanner;

class Voter{

    Scanner keyboard = new Scanner(System.in);
    private String Name;
    private int Age;
    private static String Choose;

    public Voter (String Name , int Age){
        this.Name = Name;
        this.Age = Age;
    }

    public String Question1(){
        System.out.println("1). Who is a super Hand sum ");
        System.out.println("     A).Yan     B).Mint     ");
        System.out.print("Ans: ");
        Choose = keyboard.next();
        return Choose;
    }

    public static String Question2(){
        System.out.println("2). What is this Years ");
        System.out.println("     A).2567     B).2566     ");
        System.out.println("Ans: ");
        //String Choose = keyboard.next();
        return Choose;
    }

    public String Question3(){
        System.out.println("3). Who is a most importent in Thailand ");
        System.out.println("     A).Chadchart     B).Prayut     ");
        System.out.println("Ans: ");
        //String Choose = keyboard.next();
        return Choose;
    }

    public String Question4(){
        System.out.println("4). Are you gay ");
        System.out.println("     A).No,i'm gay     B).yes,i'm gay     ");
        System.out.println("Ans: ");
        String Choose = keyboard.next();
        return Choose;
        
    }
    
    public String Question5(){
        System.out.println("5). Do you like Prayut ");
        System.out.println("     A).maybe     B).No     ");
        System.out.println("Ans: ");
        String Choose = keyboard.next();
        return Choose;
    }

    public int CONCLUSION(){
        System.out.println(Question1());
        if (Choose.equals("A")){
            return 1;
        }
        return 0;
    }
}
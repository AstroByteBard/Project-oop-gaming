import java.util.Scanner;

public class Voting {
    
    static Scanner keyboard = new Scanner(System.in);
    static int A = 0;
    static int B = 0;

    private static void Ans(){
        System.out.print("Choose... ");
        String Score = keyboard.next();
        if (Score.equals("A")){
            A++;
        }
        else {
            B++;
        }
    }
    public static void Question(){
        System.out.println("\nQuestion 1: What kind of leader do you want for the world?");
        System.out.println("A. Expert negotiator, able to find compromises between conflicting countries even if it requires some concessions.");
        System.out.println("B. Decisive and daring, willing to make tough decisions even at the risk of some dissatisfaction from certain parties.");
        Ans();
        System.out.println("\nQuestion 2: What perspective do you want a world leader to have?");
        System.out.println("A. Forward-thinking, planning for the future despite facing uncertainty.");
        System.out.println("B. Focused on the present, addressing urgent problems and meeting the immediate needs of the people even if it means overlooking some long-term issues.");
        Ans();
        System.out.println("\nQuestion 3: Do you want a world leader who understands the environment or technology?");
        System.out.println("A. Understanding of modern technology, utilizing it to develop the country even if it entails facing new risks and challenges.");
        System.out.println("B. Understanding of nature and the environment, maintaining a balance between development and conservation even if it means limiting economic growth in some aspects.        ");
        Ans();
        System.out.println("\nQuestion 4: What kind of background do you want a world leader to come from?");
        System.out.println("A. From the general populace, understanding the issues of ordinary people even if lacking political experience.");
        System.out.println("B. From the elite class, with a broad vision and understanding of global politics even if distant from the common people.");
        Ans();
        System.out.println("\nQuestion 5: What principles should a world leader adhere to?");
        System.out.println("A. Firm in principles, dedicated to goals even in the face of pressure and obstacles.");
        System.out.println("B. Flexible, adapting to situations even if it requires changing policies or positions.");
        Ans();
        System.out.println("----- Thank you -----");
    }
}

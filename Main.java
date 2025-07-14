import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to the Quiz game!!");
        System.out.println();
        System.out.println("Press Y to start the game. Press 0 to end the game.");
        Scanner sc = new Scanner(System.in);
        char flag = sc.nextLine().charAt(0);
        while(flag == 'Y'){
            QuestionService service = new QuestionService();
            service.playQuiz();
            service.printScore();

            System.out.println("Wanna play again ? Press Y to continue. Press 0 to end the game.");
            flag = sc.nextLine().charAt(0);
        }
        System.out.println("Thank you for playing the game. See you next time !!");
        
    }
}

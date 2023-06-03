import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.println("WELCOME TO 'GUESS THE NUMBER', " + name + "!");

        while (true) {
            System.out.print("Guess the number (1-100): ");
            int x = sc.nextInt();
            game.setNumber(x);
            game.setCounter();

            if (game.isCorrect() == 1) {
                System.out.println("Congrats! You've guessed correctly!");
                game.getCounter();
                break;
            }
            else if (game.isCorrect() == 2) {
                System.out.println("Guess a smaller number.");
            }
            else if (game.isCorrect() == 3) {
                System.out.println("Guess a larger number.");
            }
        }
    }
}
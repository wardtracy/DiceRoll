/**
 * Created by Grand Circus Student on 7/14/2017.
 */
import java.util.Scanner;
        import java.util.Random;
        import java.lang.Math;

public class DiceRoll {
    public static void rollDice() {
        Scanner scan = new Scanner(System.in);
        Random nunbers = new Random();

        int n;
        int numOfSides;
        int counter;
        int numbOfDice = 2;

        System.out.println("Welcome to Grand Circus Casino!");
        System.out.println("-------------------------------");
        System.out.print("Please enter the number of sides, between 3 and 20, for the pair of dice: ");

        numOfSides = scan.nextInt();
        n = numOfSides;

        for (counter = 0; counter < numbOfDice; ++counter) {
            int x = nunbers.nextInt(n);
            ++x;
            System.out.println(x);
        }
        System.out.println("Would you like to roll again? Y/N");


    }

    public static void main(String[] args) {
        rollDice();
        return;
    }

}





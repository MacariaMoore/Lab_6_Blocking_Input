import java.util.Scanner;
import java.util.Random;
public class HighorLow {
    public static void main(String[] args) {
        int numGuess = 0;
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int ranNum = generator.nextInt(10) + 1;  // val is 1 to 10
        boolean done = false;
        String trash = "";

        do{
            System.out.println("Guess the number: ");
            if(in.hasNextInt()){
                numGuess = in.nextInt();
                in.nextLine();
                if(numGuess == ranNum){
                    System.out.println("The number was: " +ranNum);
                    System.out.println("Right on the money!");
                    done = true;
                }else if(numGuess < ranNum){
                    System.out.println("The number was: " +ranNum);
                    System.out.println("Your guess is too low!");
                }else {
                    System.out.println("The number was: " + ranNum);
                    System.out.println("Your guess is too high!");
                }
            }else{
                trash = in.nextLine();
                System.out.println("You said the number was " +trash);
                System.out.println(" You need to enter a valid number!\n");
            }
        }while(!done);
    }
}

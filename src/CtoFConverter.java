import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        double C = 0;
        String trash= "";
        boolean done= false;
        Scanner in = new Scanner(System.in);

        do{
            System.out.println("Enter your degrees(C): ");
            if(in.hasNextDouble()){
                C = in.nextDouble();
                in.nextLine();
                done = true;
                double F = (C * 1.8) + 32;
                System.out.println("Degrees in F: " + F);
                if(F <= 32){
                    System.out.println("Degrees is at or below freezing!");
                }else if(F >= 212){
                    System.out.println("Degrees is at or above boiling!");
                }
            }else{
                trash = in.nextLine();
                System.out.println("You said the degrees was " + trash);
                System.out.println(" You need to enter a valid number!\n");
            }
        }while(!done);

    }
}

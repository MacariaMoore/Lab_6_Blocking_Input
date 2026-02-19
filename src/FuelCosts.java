import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        double numGal = 0;
        double fuelEff = 0;
        double numPrice = 0;
        boolean done = false;
        String trash = "";
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("How many gallons of gas are in the tank?: ");
            if(in.hasNextDouble()){
                numGal = in.nextDouble();
                in.nextLine();
                done = true;
            }else{
                trash = in.nextLine();
                System.out.println("You said the number was " + trash);
                System.out.println(" You need to enter a valid number!\n");
            }
        }while(!done);
        done = false;
        do{
            System.out.println("What's the fuel efficiency mile per gallon?: ");
            if(in.hasNextDouble()){
                fuelEff = in.nextDouble();
                in.nextLine();
                done = true;
            }else{
                trash = in.nextLine();
                System.out.println("You said the number was " +  trash);
                System.out.println(" You need to enter a valid number!\n");
            }
        }while(!done);
        done = false;
        do{
            System.out.println("What's the price of gas per gallon?: ");
            if(in.hasNextDouble()){
                numPrice = in.nextDouble();
                in.nextLine();
                done = true;
            }else{
                trash = in.nextLine();
                System.out.println("You said the number was " +  trash);
                System.out.println(" You need to enter a valid number!\n");
            }
        }while(!done);
        double cost100Miles = (100/ fuelEff)* numPrice;
        double distFullTank = numGal * numPrice;

        System.out.println("Cost to drive 100 miles: $" + cost100Miles);
        System.out.println("Distance with full tank: " + distFullTank + "miles");

    }
}

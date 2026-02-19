import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        double length = 0;
        double width = 0;
        Scanner in = new Scanner(System.in);
        boolean done = false;
        String trash = "";

        do{
            System.out.println("What's the length: ");
            if(in.hasNextDouble()){
                length = in.nextDouble();
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
            System.out.println("What's the width?: ");
            if(in.hasNextDouble()){
                width = in.nextDouble();
                in.nextLine();
                done = true;
            }else{
                trash = in.nextLine();
                System.out.println("You said the number was " +  trash);
                System.out.println(" You need to enter a valid number!\n");
            }
        }while(!done);
        double area = length * width;
        double perimeter = 2* (length + width);
        double diagonal = Math.sqrt(Math.pow(length, 2) +Math.pow(width,2));
        System.out.println("The area is: " + area);
        System.out.println("The perimeter is: " + perimeter);
        System.out.println("The diagonal is: "+ diagonal);
    }
}

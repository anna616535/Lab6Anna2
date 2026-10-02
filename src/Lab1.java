import java.util.Scanner;

public class Lab1 {
    public static void main() {
        Scanner scan = new Scanner(System.in);

        double kilo=0;
        double oneKiloInMiles= 0.621371;
        double miles;

        boolean done= false;
        do{
            System.out.println("Enter number of kilometers.");
            if(scan.hasNextDouble()){
                kilo=scan.nextDouble();
                if(kilo>=0){
                    done=true;
                }
                else{
                    System.out.println("Error, enter postive kilometers");
                }
            }
            else{
                System.out.println("Error, enter valid kilometers.");
                scan.nextLine();
            }

        }while(!done);

        miles=kilo*oneKiloInMiles;


        System.out.printf("%-5s %10.2f%n", "Kilo is", kilo);
        System.out.printf("%-5s %10.2f%n", "Miles is", miles);




        //System.out.printf("%-20f kilo is: %5d%5d%5d", kilo, miles);




//format not working. Fix somehow
        //("%-20s Grades: %5d%5d%5d", studentName, quiz1, quiz2, quiz3);

    }
}

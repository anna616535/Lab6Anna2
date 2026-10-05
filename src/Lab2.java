import java.util.Scanner;

public class Lab2 {
    public void main() {
        Scanner scan = new Scanner(System.in);

        int batteries=0;
        double minutesPerCharge=0;
        double costToRecharge=0;

        boolean done1= false;
        boolean done2= false;
        boolean done3= false;

        double totalMinutes;
        double totalCost;
        double costPerHour;
        double batteriesPerHours;

        do{
            System.out.println("Enter number of battries.");
            if(scan.hasNextInt()){
                batteries=scan.nextInt();
                if(batteries>=0){
                    done1=true;
                }
                else{
                    System.out.println("Error, enter postive number of batteries");
                }
            }
            else{
                System.out.println("Error, you can not have a decmail of a battry.");
                scan.nextLine();
            }

        }while(!done1);

        do{
            System.out.println("Enter number of Minutes of robotic operation per charge.");
            if(scan.hasNextDouble()){
                minutesPerCharge=scan.nextDouble();
                if(minutesPerCharge>0){
                    done2=true;
                }
                else{
                    System.out.println("Error, enter postive number of minutes");
                }
            }
            else{
                System.out.println("Error, you must have number.");
                scan.nextLine();
            }
        }while(!done2);

        do{
            System.out.println("Enter number of Cost in dollars to recharge one battery fully.");
            if(scan.hasNextDouble()){
                costToRecharge=scan.nextDouble();
                if(costToRecharge>0){
                    done3=true;
                }
                else{
                    System.out.println("Error, enter postive number of minutes");
                }
            }
            else{
                System.out.println("Error, you must have number.");
                scan.nextLine();
            }
        }while(!done3);

        totalMinutes=minutesPerCharge*batteries;
        batteriesPerHours=60/minutesPerCharge;
        costPerHour=batteriesPerHours*costToRecharge;

//wrong here

        //Then try 5 charges, 4.25 minutes per charge, and $3.50 per charge

        /* figure math out to

        double minutesABattery;
        double totalCost;
        double costPerHour;


        Reject nonnumeric input and values outside the listed range. Show an error and repeat only the input that failed.
After collecting valid inputs, calculate and display the total available minutes and the cost to run the robot for 60 minutes.
Show both results with two decimal places using printf.
Test your program:
Try a word, a negative charge count, and zero for each field that requires a positive number.
Then try 5 charges, 4.25 minutes per charge, and $3.50 per charge. The results should be 21.25 minutes and $49.41 per hour.
*/
        System.out.println("The total avalible minutes " +totalMinutes);
        System.out.println("The cost per hours is $" +costPerHour);
    }
}


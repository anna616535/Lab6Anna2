import java.util.Scanner;
import java.lang.Math;

public class Lab3 {
    public void main() {

        double width=0;
        double length=0;

        double area=0;
        double perm=0;
        double hypotus=0;

        Scanner scan = new Scanner(System.in);

        boolean done = false;

        do {
            System.out.println("Enter width");
            if (scan.hasNextDouble()) {
                width = scan.nextDouble();
                if (width>= 0) {
                    done = true;
                } else {
                    System.out.println("Error, enter postive number");
                }
            } else {
                System.out.println("Error, enter valid width");
                scan.nextLine();
            }
        } while (!done);

        done=false;

        do {
            System.out.println("Enter length");
            if (scan.hasNextDouble()) {
                length = scan.nextDouble();
                if (length>= 0) {
                    done = true;
                } else {
                    System.out.println("Error, enter postive number");
                }
            } else {
                System.out.println("Error, enter valid length");
                scan.nextLine();
            }
        } while (!done);

        hypotus= Math.hypot(width, length);
        area= (length*width)/2;
        perm= (2*width)+(2*length);

        System.out.printf("%-5s %10.2f%n", "Area ", area, "m2");
        System.out.printf("%-5s %10.2f%n", "perimeter", perm, "m");
        System.out.printf("%-5s %10.2f%n", "straight-line distance", hypotus, "m");
        //+ area+"m2, perimeter "+perm+ "m straight-line distance"+ hypotus+"m");

    }
}

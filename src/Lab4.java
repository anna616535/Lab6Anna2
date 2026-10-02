import java.util.Scanner;
import java.lang.Math;

public class Lab4 {
    public void main() {
        Scanner scan = new Scanner(System.in);

        int diceRoll=0;
        int guess=0;

        diceRoll = 20+ (int)(Math.random()*16);
       // System.out.println("Dice roll "+ diceRoll);
        boolean done=false;
        do {
            System.out.println("Enter number between 20 through 35");
            if(scan.hasNextInt()){
                guess=scan.nextInt();
                if(guess>=20&&guess<=35){
//age>=21&&age<=110
                    if (guess==diceRoll){
                        System.out.println("You got it!");
                    }else if(diceRoll<guess){
                        System.out.println("You guessed too high");
                    }else{
                        System.out.println("You guessed too low");
                    }

                    done=true;
                }
                else{
                    System.out.println("Error, enter vaild guess of between 20 and 35");
                }
            }
            else{
                System.out.println("Error, enter valid int.");
                scan.nextLine();
            }
        }while(!done);



    }
}

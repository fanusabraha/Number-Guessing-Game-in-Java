import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberofTries = 0;
        int lottery =-1;
        int number = (int) Math.random() * 100;

        while (numberofTries<5){
            System.out.println("Guess a number which is between 1 & 100");
            lottery = scanner.nextInt();
            if (lottery>=1 && lottery<=100 ){

                if (lottery==number){
                    System.out.println("wuhuuu you got the right number");numberofTries=5;
                }
                else if (lottery<number){ System.out.println("Plese enter a higher number");numberofTries++;
                }
                else if (lottery>number){
                    System.out.println("please enter a lower number");numberofTries++;
                }

            }
            else if (lottery < 1 || lottery>100) {
                System.out.println("enter the right number because you didnt enter a number in range");


            }else {
                System.out.println("you lose!\n"+ "The number was  "+number);
            }
        }
    }
}

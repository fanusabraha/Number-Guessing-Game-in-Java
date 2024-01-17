import java.util.Scanner;

public class fanusAssignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberofTries = 0;
        int lottery =-1;
        int number = (int) Math.random() * 100;

        while (numberofTries<5){
            System.out.println("Guess a number which is between 1 & 100");
            lottery = scanner.nextInt();
            if (lottery>=1 && lottery<=100 ){
                numberofTries++;
                if (lottery==number){
                    System.out.println("wuhuuu you got the right number");break;
                }
                else if (lottery<number &&numberofTries<=4){ System.out.println("Plese enter a higher number");
                }
                else if (lottery>number && numberofTries<=4){
                    System.out.println("please enter a lower number");
                }

            }
            if (numberofTries==5){
                System.out.println("you lose!\n"+ "The number was  "+number);
            }

            else if (lottery < 1 || lottery>100) {
                System.out.println("enter the right number because you didnt enter a number in range");
            }
        }
    }
}
//Assigmnent for guessing number between 1 and 100
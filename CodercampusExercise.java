import java.util.Scanner;

public class CodercampusExercise {
    public static void main(String[] args) {
        Scanner scnner= new Scanner(System.in);
        int input=-1;
        while(input<50||input>300){
            System.out.println("enter a number bewteen 50 and 300");
            input= scnner.nextInt();
            System.out.println("the number wasnt between 50 and 300, try again");
        }
        if (input>50 && input <300){
            System.out.println("The number you typed in was "+input);
        }
    }
}

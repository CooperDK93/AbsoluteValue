import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int input = scanner.nextInt();

        if ( input < 0){
            int userOutput = input * -1;
            System.out.println(userOutput);
        }else if( input >= 0){
            System.out.println(input);
        }else  System.out.println(" Try Again!!");

    }
}

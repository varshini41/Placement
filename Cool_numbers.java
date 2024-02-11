package placement;
import java.util.Scanner;

public class Cool_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's cool: ");
        int number = scanner.nextInt();
        
        int digitSum = 0;
        int numDigits = 0;
        int temp = number;
    
        while(temp != 0) {
            digitSum += temp % 10;
            temp /= 10;
            numDigits++;
        }
        
      
        if (numDigits % 2 == 0 && digitSum % 5 == 0) {
            System.out.println(number + " is a cool number!");
        } else {
            System.out.println(number + " is not a cool number.");
        }
    }
}


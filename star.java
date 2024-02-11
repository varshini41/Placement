package placement;

import java.util.Scanner;

public class star {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the value of n:");
        int n = obj.nextInt();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int k=1; k<2*i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


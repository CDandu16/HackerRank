package Java.Introduction;

import java.util.Scanner;

/**
 * Created by Chaitu on 6/25/2015.
 */
public class loops {
    public static void main(String[] args) {
        int sum;
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        for(int i = 0; i<length;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            sum = a;
            for(int j=0;j<n;j++){
                sum += Math.pow(2,j)*b;
                System.out.print(sum + " ");
            }
            sum = 0;
            System.out.println();//starts next line
        }
    }
}

package Java.Introduction;

import java.util.Scanner;

public class End_Of_File {
    public static void main(String[] args){
        int counter = 1;
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            System.out.println(counter + " " + scanner.nextLine() );
            counter++;
        }
    }
}

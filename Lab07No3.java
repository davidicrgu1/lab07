/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07.no3;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Lab07No3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter zip code: ");
        int zipCode = input.nextInt();
        while (zipCode < 10000) {
            System.out.print("Please enter again the zip code(5 digits): ");
            zipCode = input.nextInt();
        }
        input.close();

        printBarCode(zipCode);
    }

    public static int checkDigit(int zipCode) {
        int sum = 0;

        while (zipCode > 0) {
            int remainder = zipCode % 10;
            zipCode = zipCode / 10;
            sum += remainder;
        }

        return 10 - (sum % 10);
    }

    public static void printBarCode(int zipCode) {
        int copyZipCode = zipCode;
        System.out.print("|");
        int divisor = 10000;

        for (int i = 0; i < 5; i++) {
            int currentDigit = copyZipCode / divisor;
            printDigit(currentDigit);
            copyZipCode = copyZipCode % divisor;
            divisor = divisor / 10;
        }

        int checkDigit = checkDigit(zipCode);
        printDigit(checkDigit);
        System.out.print("|");
    }

    public static void printDigit(int d) {
        if (d == 0) {
            System.out.print("||:::");
        } else if (d == 1) {
            System.out.print(":::||");
        } else if (d == 2) {
            System.out.print("::|:|");
        } else if (d == 3) {
            System.out.print("::|:|");
        } else if (d == 4) {
            System.out.print(":|::|");
        } else if (d == 5) {
            System.out.print(":|:|:");
        } else if (d == 6) {
            System.out.print(":||::");
        } else if (d == 7) {
            System.out.print("|:::|");
        } else if (d == 8) {
            System.out.print("|::|:");
        } else if (d == 9) {
            System.out.print("|:|::");
        }
    }
}
    

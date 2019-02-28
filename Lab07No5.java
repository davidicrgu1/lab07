/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07.no5;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class Lab07No5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your income: ");
        int income = input.nextInt();
        System.out.print("Please enter number of your children: ");
        int numberOfChildren = input.nextInt();
        input.close();

        int amount = amountOfAssistance(income, numberOfChildren);
        System.out.printf("Amount of assistance is: %d", amount);
    }

    public static int amountOfAssistance(double income, int numberOfChildren) {
        if (income > 30000 && income <= 40000) {
            return numberOfChildren * 1000;
        } else if (income > 20000 & income <= 30000) {
            return numberOfChildren * 1500;
        } else {
            return numberOfChildren * 2000;
        }
    }
}


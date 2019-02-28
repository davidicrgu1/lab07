/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07.scramble.word;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Lab07ScrambleWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter words: ");

        while (!input.hasNext("EXIT!")) {
            String word = input.next();
            System.out.println(scramble(word));
        }

        input.close();
    }

    public static String scramble(String word) {
        if (word.length() > 3) {
            Random random = new Random();
            int firstIndex = random.nextInt(word.length() - 1) + 1;
            int secondIndex = random.nextInt(word.length() - 1) + 1;

            if (firstIndex == secondIndex) {
                while (firstIndex == secondIndex) {
                    secondIndex = random.nextInt(word.length() - 1) + 1;
                }
            }

            if (firstIndex > secondIndex) {
                return word.substring(0, secondIndex) +
                       word.charAt(firstIndex) +
                       word.substring(secondIndex + 1, firstIndex) +
                       word.charAt(secondIndex) +
                       word.substring(firstIndex + 1);
            } else {
                return word.substring(0, firstIndex) +
                       word.charAt(secondIndex) +
                       word.substring(firstIndex + 1, secondIndex) +
                       word.charAt(firstIndex) +
                       word.substring(secondIndex + 1);
            }
        } else {
            return word;
        }
    }
}



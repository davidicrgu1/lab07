/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07.n04;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Lab07N04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Scanner input = new Scanner(System.in);
        String barCode = input.next();
        input.close();

        int currentZipCode = getZipCode(barCode);
        System.out.println(currentZipCode);
    }

    public static int getZipCode(String barCode) {
        int start = 1;
        String digits = "";

        while (start < 26) {
            String currentBars = barCode.substring(start, start + 5);
            digits += digit(currentBars);
            start += 5;
        }

        return Integer.parseInt(digits);
    }

    public static int digit(String bars) {
        if (bars.equals("||:::")) {
            return 0;
        } else if (bars.equals(":::||")) {
            return 1;
        } else if (bars.equals("::|:|")) {
            return 2;
        } else if (bars.equals("::|:|")) {
            return 3;
        } else if (bars.equals(":|::|")) {
            return 4;
        } else if (bars.equals(":|:|:")) {
            return 5;
        } else if (bars.equals(":||::")) {
            return 6;
        } else if (bars.equals("|:::|")) {
            return 7;
        } else if (bars.equals("|::|:")) {
            return 8;
        } else if (bars.equals("|:|::")) {
            return 9;
        } else {
            return -1;
        }
    }
}
    
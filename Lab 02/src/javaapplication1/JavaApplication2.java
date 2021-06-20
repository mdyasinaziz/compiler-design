package javaapplication1;

import java.util.*;
import java.io.*;

/**
 *
 * @author 17201019
 */
public class JavaApplication2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String[] number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        Scanner sc = new Scanner(new File("input2.txt"));

        try {
            sc.hasNext();
            String z = sc.next();
            int items = Integer.parseInt(z);
            boolean valid = true;
            int noCount = 0;
            for (int i = 0; i < number.length; i++) {
                if (z.equals(number[i])) {
                    noCount++;
                }
            }
            if (noCount == 0) {
                System.out.println("First Line Invalid");
                valid = false;
            } else {
                System.out.println("First Line Was Valid");
            }

            int atCount = 0;
            boolean errorFound = false;
            if (valid) {
                for (int i = 0; i < items; i++) {
                    sc.hasNext();
                    String p = sc.next();
                    String q = ".com";
                    String r = "www.";
                    String firstCheck = p.substring(0, 4);
                    String lastCheck = p.substring(p.length() - 4, p.length());

                    if (lastCheck.equals(q) && !firstCheck.equals(r)) {
                        errorFound = false;
                        String[] arrOfStr = p.split("\\.");
                        char[] ch = arrOfStr[0].toCharArray();
                        for (int j = 0; j < ch.length; j++) {
                            int ascii = (int) ch[j];
                            if ((ascii >= 97 && ascii <= 122) || (ascii >= 48 && ascii <= 57)) {
                            }
                            if (ascii == 64) {
                                atCount++;
                                if (atCount > 1) {
                                    System.out.println("More than one @, Wrong Email!");
                                    errorFound = true;
                                    break;
                                }
                            }
                        }
                        if (!errorFound) {
                            System.out.println("Corret Email: " + p);
                        }
                    }

                    if (firstCheck.equals(r) && lastCheck.equals(q)) {
                        errorFound = false;
                        String[] arrOfStr = p.split("\\.");
                        char[] ch = arrOfStr[1].toCharArray();
                        for (int j = 0; j < ch.length; j++) {
                            int ascii = (int) ch[j];
                            if ((ascii >= 97 && ascii <= 122) || (ascii >= 65 && ascii <= 90) || (ascii >= 48 && ascii <= 57)) {

                            } else {
                                errorFound = true;
                                break;
                            }
                        }
                        if (!errorFound) {
                            System.out.println("Correct Website: " + p);
                        } else {
                            System.out.println("Wrong Website! ");
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("First Line Was Invalid!");
        }
    }
}

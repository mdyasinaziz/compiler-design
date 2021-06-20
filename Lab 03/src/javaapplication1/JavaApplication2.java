package javaapplication1;
import java.util.regex.*;
import java.util.*;
import java.io.*;

/**
 *
 * @author 17201019
 */
public class JavaApplication2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("input2.txt"));

        try {
            sc.hasNext();
            String z = sc.next();
            int items = Integer.parseInt(z);
            String [] exp = new String [items];
            
            for (int i = 0; i < exp.length; i++) {
                sc.hasNext();
                z = sc.next();
                exp [i] = z;
            }

            sc.hasNext();
            z = sc.next();
            items = Integer.parseInt(z);
            String[] demo = new String[items];
            
            for (int i = 0; i < demo.length; i++) {
                sc.hasNext();
                z = sc.next();
                demo [i] = z;
            }
            
            
            int res [] = new int [demo.length];
            for (int i = 0; i < demo.length; i++) {
                for (int j = 0; j < exp.length; j++) {
                    boolean f = Pattern.matches (exp[j], demo [i]);
                    if (f){
                    res [i] = j+1;
                    }
                }
            }
            
            for (int i : res) {
                if (i == 0) {
                System.out.println ("NO, " + i);
                } else {
                System.out.println ("YES, " + i);
                }
                
            }
            
//            for (String i : exp) {
//                System.out.println (i);
//            }
//            
//            for (String i : demo) {
//                System.out.println (i);
//            }
            
            
           
        } catch (Exception e) {
            System.out.println("First Line Was Invalid!");
        }
    }
}
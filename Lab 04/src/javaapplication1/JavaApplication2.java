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
            String z;
            String add = "add()";
            String subract = "subtract()";
            String main = "main(String [] args)";
            int addCount = 0; int subCount = 0;
            System.out.println ("Methods: ");
            
            
            for (int i = 0; i < 100; i++) {
                sc.hasNextLine();
                z = sc.nextLine();
                boolean foundadd = z.contains("add");
                boolean foundsubtract = z.contains("subtract");
                boolean foundmain = z.contains("main");
                boolean foundVoid = z.contains("void");
                boolean foundint = z.contains("int");
                boolean founddouble = z.contains("double");
                
                if (foundadd) {
                    System.out.print(add);
                    if (foundVoid) {
                        System.out.print(", No Return Type Void");
                        System.out.println();
                    } else {
                        if (foundint) {
                            System.out.print(", Return Type int");
                        }
                        if (founddouble) {
                            System.out.print(", Return Type double");
                        }
                        System.out.println();
                    }
                }
                
                if (foundsubtract) {
                    System.out.print(subract);
                    if (foundVoid) {
                        System.out.print(", No Return Type Void");
                        System.out.println();
                    } else {
                        if (foundint) {
                            System.out.print(", Return Type int");
                        }
                        if (founddouble) {
                            System.out.print(", Return Type double");
                        }
                        System.out.println();
                    }
                }
                
                if (foundmain) {
                System.out.print (main);
                break;
                }
                
            } 
           
        } catch (Exception e) {
            System.out.println("Error Found");
        }
    }
}





//                if (z.length() > 3){
//                checker = z.substring(0, 4);
//                if (add.equals(checker)) {
//                System.out.println ("add()");
//                }
//                }
//                
//                if (z.length() > 8){
//                checker = z.substring(0, 9);
//                if (subract.equals(checker)) {
//                System.out.println ("subtract()");
//                }
//                }
//                
//                if (z.length() > 4){
//                checker = z.substring(0, 5);
//                if (main.equals(checker)) {
//                System.out.println ("main (String [] args)");
//                }
//                }

//            
// //System.out.println (z);
//                if (r.equals(addcheck)) {
//                System.out.print(z);
//                    for (int j = 0; j >= 0; j++) {
//                        sc.hasNext();
//                        z=sc.next();
//                        if (z.length() == 2){   
//                        lastcheck = z.substring(z.length() -1);
//                        if (lastcheck.equals(close)){
//                        System.out.print (z);
//                        break;
//                        } else {
//                        System.out.print(z);
//                        }
//                        }
//                        else {
//                        System.out.print (z);
//                        }
//                    }
//                }
//                
//                System.out.println ();           
            
            
            
            
            
            
//            sc.hasNext();
//            z = sc.next();
//            items = Integer.parseInt(z);
//            String[] demo = new String[items];
//            
//            for (int i = 0; i < demo.length; i++) {
//                sc.hasNext();
//                z = sc.next();
//                demo [i] = z;
//            }
//            
//            
//            int res [] = new int [demo.length];
//            for (int i = 0; i < demo.length; i++) {
//                for (int j = 0; j < exp.length; j++) {
//                    boolean f = Pattern.matches (exp[j], demo [i]);
//                    if (f){
//                    res [i] = j+1;
//                    }
//                }
//            }
//            
//            for (int i : res) {
//                if (i == 0) {
//                System.out.println ("NO, " + i);
//                } else {
//                System.out.println ("YES, " + i);
//                }
//                
//            }
            
//            for (String i : exp) {
//                System.out.println (i);
//            }
//            
//            for (String i : demo) {
//                System.out.println (i);
//            }
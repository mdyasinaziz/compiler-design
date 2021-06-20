package javaapplication1;
import java.util.*;
import java.io.*;
/**
 *
 * @author 17201019
 */
public class JavaApplication1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        
        String [] keywords = { "abstract", "assert", "boolean",
                "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "extends", "false",
                "final", "finally", "float", "for", "goto", "if", "implements",
                "import", "instanceof", "int", "interface", "long", "native",
                "new", "null", "package", "private", "protected", "public",
                "return", "short", "static", "strictfp", "super", "switch",
                "synchronized", "this", "throw", "throws", "transient", "true",
                "try", "void", "volatile", "while" };
        String [] identifiers = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
        "o","p","q","r","s","t","u","v","w","x","y","z"};
        String [] mathop = {"+", "-", "*", "/", "="};
        String [] logi = {">", "<", ">=", "<=", "=="};
        String [] other = {"(", ")", "{", "}", "[", "]", ",", ";"};
        String [] number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9","1.0", "2.0", "3.0", "4.0", "5.0", "6.0", "7.0", "8.0", "9.0"};
        Scanner sc = new Scanner (new File ("input.txt"));
        Set<String> kfound = new HashSet<String>();
        Set<String> idefound2 = new HashSet<String>();
        Set<String> matfound = new HashSet<String>();
        Set<String> logfound = new HashSet<String>();
        Set<String> othfound = new HashSet<String>();
        Set<String> numfound = new HashSet<String>();
        
        while (sc.hasNext()){
            String s = sc.next();
            //System.out.println(s);
            for (int i = 0; i < keywords.length; i++) {
                if (s.equals(keywords[i])){
                kfound.add(s);  
                }
            }
            for (int i = 0; i < identifiers.length; i++) {
                if (s.equals(identifiers[i])){
                idefound2.add(s);    
                }
            }
            for (int i = 0; i < mathop.length; i++) {
                if (s.equals(mathop[i])){
                matfound.add(s);
                }
            }
            for (int i = 0; i < logi.length; i++) {
                if (s.equals(logi[i])){
                logfound.add(s);
                }
            }
            for (int i = 0; i < other.length; i++) {
                if (s.equals(other[i])){
                othfound.add(s);
                }
            }
            //for (int i = 0; i < 1; i++) {
            //Integer/Decimal or not check
                char[] ch = s.toCharArray();
                int dotFound = 0;
                int itsAnumber = 0;
                int otherStuffs = 0;
                for (int j = 0; j < ch.length; j++) {
                    String z=String.valueOf(ch[j]);  
                    if (z.equals(".")){
                    dotFound++;
                    }
                    int ascii = (int) ch[j];
                    if (((ascii >= 48 && ascii <= 57)) || ascii == 46) {
                        itsAnumber++;
                    } else {
                    otherStuffs++;
                    }
                }
                //if (dotFound==1){
                //numfound.add(s);
                //}
                if (itsAnumber>0 && dotFound < 2 && otherStuffs == 0){
                numfound.add(s);
                }
                
            //}
            
        }
        System.out.print("Keywords: ");
        for (String stock : kfound) {
            System.out.print(stock + ", ");
        }
        
        System.out.print("\n\nIdentifiers: ");
        for (String stock : idefound2) {
            System.out.print(stock + ", ");
        }
        
        System.out.print("\n\nMath Operators: ");
        for (String stock : matfound) {
            System.out.print(stock + ", ");
        }
        
        System.out.print("\n\nLogical Operators: ");
        for (String stock : logfound) {
            System.out.print(stock + ", ");
        }
        
        System.out.print("\n\nOther Operators: ");
        for (String stock : othfound) {
            System.out.print(stock + ", ");
        }
        
        System.out.print("\n\nNumerical Operators: ");
        for (String stock : numfound) {
            System.out.print(stock + ", ");
        }

        
  }
}
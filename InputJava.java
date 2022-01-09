// Scanner is a class in Util package to take input
// Next function returns single word
// NextLine function returns complete sentence
// Java Util package contains collections framework, date time, string tokenizer, scanner, random num generate...etc
// We need to externally import java.util package. otherwise get scanner cannot be resolved to a type error.
// try with resources help to close each resource gets closed at the end of the statement execution
// here in this example try with resources helps to close scanner close to avoid resource / memory leaks
import java.util.*;
public class InputJava {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            //Integer
            int x,y,sum;
            System.out.println("Input X and Y to get sum of it");
            x = sc.nextInt();
            y = sc.nextInt();
            sum = x+y;
            System.out.println("Sum of X and Y is "+sum);
            //Float
            float a,b,mul;
            System.out.println("Input A and B to get Multiplication of it");
            a = sc.nextFloat();
            b = sc.nextFloat();
            mul = a*b;
            System.out.println("Multiplication of A and B is " + mul);
            //Double
            double c,d,mod;
            System.out.println("Input C and D to get modulus of it");
            c = sc.nextDouble();
            d= sc.nextDouble();
            mod = c%d;
            System.out.println("Modulus of C and D is" + mod);
            //String - Next - Word
            String stat;
            System.out.println("Input more than one word and observe ouput will print only one word because of Next method");
            stat = sc.next();
            System.out.println(stat);
            //String - NextLine - Sentense
            String message;
            System.out.println("Above input after one word will be input to this and observe that in output. It will print complete sentense because of NextLine method");
            message = sc.nextLine();
            System.out.println(message);
        }
    
    }
}

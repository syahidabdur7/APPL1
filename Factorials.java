// ****************************************************************
// Factorials.java
//
// Reads integers from the user and prints the factorial of each.
//
// ****************************************************************
package W2;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Factorials {
    public static void main(String[] args){
        
 String keepGoing = "y";
 Scanner scan = new Scanner(System.in);
 while (keepGoing.equals("y") || keepGoing.equals("Y"))
 {
 System.out.print("Enter an integer: ");
 try{
 int val = scan.nextInt();
 if (val < 0){
     throw new IllegalArgumentException("Factorial Cant Negative");
 }else if (val > 16){
     throw new IllegalArgumentException("Factorial cant more than 16");
 }
 System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));
 }catch (IllegalArgumentException e){
     System.out.println(e);
 }
 System.out.print("Another factorial? (y/n) ");
 keepGoing = scan.next();
 }
 }
}

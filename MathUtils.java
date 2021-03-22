// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************
package W2;

/**
 *
 * @author User
 */
public class MathUtils {
   //-------------------------------------------------------------
 // Returns the factorial of the argument given
 //-------------------------------------------------------------
 public static int factorial(int n)
 {
 int fac = 1;
 for (int i=n; i>0; i--)
 fac *= i;
 return fac;
 }  
}

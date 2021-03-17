/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Strings 
{
 public static void main (String[] args)
 {
 String[] strList;
 Integer[] intList;
 int size;
 Scanner scan = new Scanner(System.in);
 System.out.print ("\nHow many Strings do you want to sort? "); 
 size = scan.nextInt();
 
 strList = new String[size];
 System.out.println ("\nEnter the Strings..."); 
 for(int i = 0; i < size; i++)
 strList[i] = scan.next();

 Sorting.selectionSort(strList);
 System.out.println ("\nYour Strings in descending order...");
 for(int i = 0; i < size; i++)
    System.out.print(strList[i]+ " ");
    System.out.println();
 
 Sorting.selectionSort(strList);
    System.out.println ("\nYour Strings in ascending order..."); 
 for(int i = 0; i < size; i++)
 System.out.print(strList[i] + " ");
 }    
}

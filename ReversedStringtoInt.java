/*
This class is to read n number of integers from System.in, seperated by whitespaces, converted it from String to Array of Strings, convert them onto Array of integers, then print it in reversed order.
For examples;
INPUT:
1 2 3 4 5
OUTPUT:
5 4 3 2 1
*/

import java.util.Scanner;
import java.util.Arrays;

class ReversedStringtoInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter integers, seperated by whitespace: ");
        String a = scanner.nextLine();
        String[] a_String_array = a.split(" ");             // build the String array from input
        
        int[] a_int_array = new int[a_String_array.length]; // build the empty array of integer
        for(int i = 0; i < a_String_array.length; i++) {    // assign the value of integer array using for loop
            a_int_array[i] = Integer.parseInt(a_String_array[i]);
        }
        
        for(int i = a_int_array.length - 1; i >= 0; i--) {
            System.out.print(a_int_array[i] + " ");
        }        
    }   
}

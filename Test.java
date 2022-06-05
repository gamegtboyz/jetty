import java.util.Scanner;
import java.util.Arrays;

class Test {
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

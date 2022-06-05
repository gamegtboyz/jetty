// this class reads the Sring or list of Strings(seperated by whitespace) then return that input Strings in reversed order. For examples;
/*
INPUT:
one
two three
four

OUTPUT:
four
three
two
one
*/

import java.util.Scanner;
import java.util.Arrays;

class ReversedPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        int max_guest = 4;

        String[] guest = new String[max_guest];
        while (n <= guest.length) {
            System.out.print("Please enter guest name: ");
            String a_string = scanner.nextLine();
            String[] a_array = a_string.split(" "); // build the string array using whilespace to split each elements.
            for (int i = 0; i < a_array.length; i++) {
                guest[n-1] = a_array[i];
                n++;
            }
        }

        for (int i = guest.length - 1; i >= 0; i--) {
            System.out.println(guest[i]);
        }
    }   
}

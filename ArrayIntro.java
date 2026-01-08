
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lec6;
import java.util.Scanner;
/**
 *
 * @author Nitro V
 */
public class LEC6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ask user for array size
        System.out.print("Enter the number of elements in the array: ");
        int size = input.nextInt();

        // declare the array
        int[] numbers = new int[size];

        // initialize array with user input
        System.out.println("\nEnter " + size + " integer values:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + i + ": ");
            numbers[i] = input.nextInt();
        }

        // display array properties
        System.out.println("\nArray size: " + numbers.length);

        // access and display first & last element
        if (numbers.length > 0) {
            System.out.println("First element: " + numbers[0]);
            System.out.println("Last element: " + numbers[numbers.length - 1]);
        }

        // loop through array using for loop
        System.out.println("\nUsing for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        // loop through array using while loop
        System.out.println("\nUsing while loop:");
        int i = 0;
        while (i < numbers.length) {
            System.out.println("Index " + i + ": " + numbers[i]);
            i++;
        }

        // loop through array using do-while loop
        System.out.println("\nUsing do-while loop:");
        int j = 0;
        do {
            System.out.println("Index " + j + ": " + numbers[j]);
            j++;
        } while (j < numbers.length);

        input.close();
    }
}

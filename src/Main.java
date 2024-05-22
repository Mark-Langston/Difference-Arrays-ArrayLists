// CSC262 Programming in Java
// Mark Langston    5/21/2024
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Arrays definition
        System.out.println("\nWhat is an Array in Java?");
        System.out.println("An array is a data structure that can hold multiple variables of the same type.");
        System.out.println("When you create an array you specify how many values it can hold.");
        System.out.println("The array length can't be changed once it's created.");

        System.out.println("\nExample of an Array:");
        // Declaring an array of integers with space for 5 values
        int[] array = new int[5];
        array[0] = 85;
        array[1] = 72;
        array[2] = 37;
        array[3] = 900;
        array[4] = 11;

        System.out.println("Array elements:");
        // Loops through elements of array and prints them to the console
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index " + i + ": " + array[i]);
        }

        System.out.println("\nArrays can also be created in a single line of code, review the source to see an example.");

        int[] array_two = {11, 21, 31, 41, 51};

        System.out.println("\nArray2 elements:");
        // Loops through elements of array_two and prints them to the console
        for (int i = 0; i < array_two.length; i++) {
            System.out.println("Element at index " + i + ": " + array_two[i]);
        }

        // Explanation of ArrayLists
        System.out.println("\nWhat is an ArrayLists in Java?");
        System.out.println("An ArrayList is a resizable array, it's a lot like a vector from C++.");
        System.out.println("Unlike arrays, an ArrayList can change its size after it's created.");
        System.out.println("There are many convenient methods that allow you to update an ArrayList.");

        // Example Array List
        System.out.println("\nExample of an ArrayList:");
        ArrayList<Integer> arrayList = new ArrayList<>(); // Declaring an ArrayList of integers
        arrayList.add(97);
        arrayList.add(43);
        arrayList.add(56);
        arrayList.add(18);
        arrayList.add(100);

        System.out.println("ArrayList elements:");
        // Loops through elements of the ArrayList and prints them to the console
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Element at index " + i + ": " + arrayList.get(i));
        }

        // List of differences between Arrays and ArrayLists
        System.out.println("\nWhat are the differences between Arrays and ArrayLists in JAVA?");
        System.out.println("Arrays have a fixed size, while ArrayLists can be changed after they are initialized.");
        System.out.println("ArrayLists behave like Vectors in C++.");
        System.out.println("ArrayLists have several methods for convenient data manipulation.");

        // Printed text to indicate the end of the program
        System.out.println("\nfin");
    }
}
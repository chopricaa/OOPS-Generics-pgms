package Generics;

public class Genprob {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {10, 20, 30, 40};
        System.out.print("Integer Array: ");
        printArray(intArray);
        String[] strArray = {"A", "B", "C"};
        System.out.print("String Array: ");
        printArray(strArray);
    }
}
	



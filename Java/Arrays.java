package Java;

public class Arrays {
    public static void main(String[] args) {
        // Here the variable called array is a pointer.
        // It points to a memory location that holds the array.
        // here the array is of type int and has 6 elements.
        // This creates an array of 6 elements and the value of every element is 0.
        int[] array = new int[6];
        // print the values of the array
        printArray(array, 0);
        System.out.println("=====================================");
        // We can also declare and initialize an array at the same time.
        int[] initializedArray = { 1, 2, 3, 4, 5, 6, 0, 0, 0, 0, 0, 0 };
        // print the values of the array
        printArray(initializedArray, 0);
        System.out.println("=====================================");
        reversePrint(initializedArray);
        System.out.println("=====================================");
        insert(initializedArray, 3, 10, 6);
        printArray(initializedArray, 0);
        // Just printing the array will print the memory location of the array.
        // System.out.println(array);
        System.out.println("=====================================");
        int[] reversedArray = reverseArray(initializedArray);
        printArray(reversedArray, 0);
        System.out.println("=====================================");
        int[] sourceArray = { 10, 20, 30, 40, 50, 60, 70 };
        int[] shiftedArray = shiftRight(sourceArray, 3);
        printArray(sourceArray, 0);
        System.out.println("=====================================");
        printArray(shiftedArray, 0);

    }

    private static void printArray(int[] array, int pointer) {
        // print the values of the array reccursively
        if (pointer < array.length) {
            System.out.println(array[pointer]);
            printArray(array, pointer + 1);
        } else {
            return;
        }
    }

    private static void reversePrint(int[] Array) {
        int i = Array.length - 1;
        while (i >= 0) {
            System.out.println(Array[i]);
            i--;
        }

    }

    private static void insert(int[] Array, int index, int value, int size) {
        if (size == Array.length) {
            System.out.println("Array is full");
        }
        if (index > size || index < 0) {
            System.out.println("Invalid index");
        }
        for (int i = size - 1; i >= index; i--) {
            Array[i + 1] = Array[i];
        }
        Array[index] = value;
    }

    private static int[] reverseArray(int[] Array) {
        int[] reversedArray = new int[Array.length];
        for (int i = 0, j = Array.length - 1; i < Array.length; i++, j--) {
            reversedArray[i] = Array[j];
        }
        return reversedArray;
    }

    private static int[] shiftRight(int[] Array, int k) {
        for (int i = Array.length - 1; i >= k; i--) {
            Array[i] = Array[i - k];
        }
        for (int i = 0; i < k; i++) {
            Array[i] = 0;
        }
        return Array;
    }

    private static int[] shiftLeft(int[] Array, int k) {
        for (int i = 0; i < Array.length - k; i++) {
            Array[i] = Array[i + k];
        }
        for (int i = Array.length - k; i < Array.length; i++) {
            Array[i] = 0;
        }
        return Array;
    }

    public static int[] remove(int[] Array, int index, int size) {
        if (index >= size || index < 0) {
            System.out.println("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            Array[i] = Array[i + 1];
        }
        Array[size - 1] = 0;
        return Array;
    }
}
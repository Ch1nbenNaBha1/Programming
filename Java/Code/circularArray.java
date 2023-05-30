package Java.Code;

public class circularArray {
    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 0, 0 };
        int[] CircularArray = createCircularArray(arr, 7);
        System.out.println(arr[2]);
        System.out.println("=====================================");
        printCircularArray(CircularArray, 7);
        System.out.println("=====================================");
        printArray(CircularArray);

    }

    public static int[] createCircularArray(int[] Array, int start) {

        int[] CircularArray = new int[Array.length];

        for (int i = start, j = 0; i < Array.length; i++, j++) {
            if (i == Array.length) {
                i = 0;
            }
            CircularArray[i] = Array[j];
        }
        for (int i = 0, j = Array.length - start; i < start; i++, j++) {
            CircularArray[i] = Array[j];
        }

        return CircularArray;
    }

    private static void printArray(int[] Array) {

        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i] + " ");
        }
    }

    private static void printCircularArray(int[] Array, int start) {

        for (int i = start; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
        for (int i = 0; i < start; i++) {
            System.out.println(Array[i]);
        }

    }

}

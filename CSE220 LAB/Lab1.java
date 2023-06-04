
class Lab1 {

    public static int[] playRight(int[] sequence, int[] beats) {
        for (int i = 0; i <= beats.length; i++) {
            if (i == 1) {
                Lab1.rotateRight(sequence);
            }
        }
        return sequence;
    }

    public static int[] rotateRight(int[] array) {
        int temp = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = temp;
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        // test case 1
        int[] sequence = { 10, 20, 30, 40, 50, 60 };
        int[] beats = { 1, 0, 0, 1, 0, 1 };
        printArray(playRight(sequence, beats));

    }
}
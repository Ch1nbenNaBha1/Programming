package Java.Code;

public class PracticeSheet {
    public static int unionFinder(int[] a, int[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = { 5, 3 };
        int[] b = { 1, 2, 3, 4, 5 };
        System.out.println(unionFinder(a, b));
    }
}

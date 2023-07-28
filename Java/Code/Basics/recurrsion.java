package Java.Code.Basics;

class recursion {

    public static void Print(int[] arr , int index) {

        if (index >= 0 && index <= arr.length)
        {
            if (index == arr.length) {
                return;
            }
            System.out.println(arr[index]);
            Print(arr, index + 1);
        }
    }


    public static void PrintReverse(int[] arr, int index ) {
        if (index >= 0 && index <= arr.length){
            if (index == arr.length) {
                return;
            }
            PrintReverse(arr, index + 1);
            System.out.println(arr[index]);
        }
    }
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100  };
        System.out.printf("Array Length: %d\n", arr.length);
        Print(arr, 0);
        System.out.println("===============================");
        PrintReverse(arr, 0);
    }
}




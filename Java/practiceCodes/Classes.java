package Java.practiceCodes;

public class Classes {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(power(number, 17));
    }

    // Classes are the blueprint of an object
    // Classes are the template for objects

    // Classes can contain:
    // 1. Data
    // 2. Subroutines (methods)
    static int power(int number, int power){
        if(power == 1){
            return number;
        }
        return number * power(number, power - 1);
    };
}

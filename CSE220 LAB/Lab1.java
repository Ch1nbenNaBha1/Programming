import java.util.Arrays;

class Lab1 {

    public static int[] playRight(int[] sequence, int[] beats) {
        for (int i = 0; i < beats.length; i++) {
            if (beats[i] == 1) {
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

    public static int[] discardCards(int[] cards, int number) {
        int[] removedElements = Lab1.discardCardsHelper(cards, number);
        int[] newArray = new int[cards.length];

        int i = 0, j = 0;
        while (i < cards.length) {
            if (removedElements[i] != 0) {
                newArray[j] = removedElements[i];
                i++;
                j++;
            } else {
                i++;
            }
        }
        return newArray;

    }

    public static int[] discardCardsHelper(int[] array, int element) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                array[i] = 0;
            }
        }
        return array;
    }

    public static int[] mergeLineup(int[] pokemon1, int[] pokemon2) {
        int[] newArray = new int[pokemon1.length];

        for (int i = 0; i < pokemon1.length; i++) {
            newArray[i] = pokemon1[i] + pokemon2[pokemon2.length - i - 1];
        }
        return newArray;
    }

    public static boolean balanceSalami(int[] array) {
        int leftSum = 0;
        int rightSum = Arrays.stream(array).sum();

        for (int i = 0; i < array.length; i++) {
            rightSum -= array[i];
            leftSum += array[i];
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }

    public static boolean protectSalami(int[] salami) {
        int[] temp = new int[Arrays.stream(salami).max().getAsInt() + 1];

        for (int i = 0; i < salami.length; i++) {
            temp[salami[i]] += 1;
        }

        int[] sortedArray = sortArray(temp);

        for (int i = 0; i < sortedArray.length - 1; i++) {
            if (sortedArray[i] > 1 && sortedArray[i] == sortedArray[i + 1]) {
                return true;
            }
        }

        return false;
    }

    public static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return array;
    }
    public static int[] waveYourFlag(int[] arr) {
        // Your implementation for Task 6 goes here
        return null;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("///  Test 01: Play Right  ///");
        int[] sequence = {10, 20, 30, 40, 50, 60};
        int[] beats = {1, 0, 0, 1, 0, 1};
        int[] returnedValue = playRight(sequence, beats);
        System.out.println("Task 1: " + Arrays.toString(returnedValue));

        System.out.println("///  Test 02: Discard Cards  ///");
        int[] cards = {1, 2, 3, 2, 8, 2, 2, 5, 7};
        int[] returnedValue2 = discardCards(cards, 2);
        System.out.println("Task 2: " + Arrays.toString(returnedValue2));

        System.out.println("///  Test 03: Merge Lineup  ///");
        int[] pokemon_1 = {12, 3, 25, 1, 0};
        int[] pokemon_2 = {5, -9, 3, 0, 0};
        int[] returnedValue3 = mergeLineup(pokemon_1, pokemon_2);
        System.out.println("Task 3: " + Arrays.toString(returnedValue3));

        int[] pokemon_1b = {4, 5, -1, 0, 0};
        int[] pokemon_2b = {2, 27, 7, 12, 0};
        int[] returnedValue3b = mergeLineup(pokemon_1b, pokemon_2b);
        System.out.println("Task 3: " + Arrays.toString(returnedValue3b));

        int[] pokemon_1c = {4, 5, 0, 0};
        int[] pokemon_2c = {2, 0, 0, 0};
        int[] returnedValue3c = mergeLineup(pokemon_1c, pokemon_2c);
        System.out.println("Task 3: " + Arrays.toString(returnedValue3c));

        System.out.println("///  Test 04: Balance Your Salami  ///");
        int[] salami = {1, 1, 1, 2, 1};
        boolean returnedValue4 = balanceSalami(salami);
        System.out.println("Task 4: " + returnedValue4);

        int[] salami2 = {2, 1, 1, 2, 1};
        boolean returnedValue4b = balanceSalami(salami2);
        System.out.println("Task 4: " + returnedValue4b);

        int[] salami3 = {10, 3, 1, 2, 10};
        boolean returnedValue4c = balanceSalami(salami3);
        System.out.println("Task 4: " + returnedValue4c);

        System.out.println("///  Test 05: Protecc Salami  ///");
        int[] salami4 = {4, 5, 6, 6, 4, 3, 6, 4};
        boolean returnedValue5 = protectSalami(salami4);
        System.out.println("Task 5: " + returnedValue5);

        int[] salami5 = {3, 4, 6, 3, 4, 7, 4, 6, 8, 6, 6};
        boolean returnedValue5b = protectSalami(salami5);
        System.out.println("Task 5: " + returnedValue5b);

        System.out.println("///  Test 06: Odd Even Wave  ///");
        int[] arr = {2, 12, 3, 8, 1, 5};
        int[] returnedValue6 = waveYourFlag(arr);
        System.out.println("Task 6: " + Arrays.toString(returnedValue6));

        int[] arr2 = {45, 23, 78, 84, 41};
        int[] returnedValue6b = waveYourFlag(arr2);
        System.out.println("Task 6: " + Arrays.toString(returnedValue6b));
    }

    public static class OutlierFinder {

        public double findMean(int[] array) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return (double) sum / array.length;
        }

        public double findStd(int[] array) {
            double mean = findMean(array);
            double sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += Math.pow((array[i] - mean), 2);
            }
            return Math.sqrt(sum / (array.length - 1));
        }

        public int[] findOutliers(int[] array) {
            double mean = findMean(array);
            double std = findStd(array);
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (Math.abs(array[i] - mean) > 1.5 * std) {
                    count++;
                }
            }
            int[] outliers = new int[count];

            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if (Math.abs(array[i] - mean) > 1.5 * std) {
                    outliers[j] = array[i];
                    j++;
                }
            }
            return outliers;
        }
    }
}

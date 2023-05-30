package Java.lib;

import org.junit.Test;

import Java.Code.circularArray;

public class circularArrayTester {

    @Test
    public void createCircularArray() {
        circularArray circularArray = new circularArray();

        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        int[] CircularArray = circularArray.createCircularArray(arr, 7);
        assert CircularArray[0] == 30;
        assert CircularArray[1] == 40;
        assert CircularArray[2] == 50;
        assert CircularArray[3] == 60;
        assert CircularArray[4] == 70;
        assert CircularArray[5] == 80;
        assert CircularArray[6] == 90;
        assert CircularArray[7] == 10;
        assert CircularArray[8] == 20;

    }

}

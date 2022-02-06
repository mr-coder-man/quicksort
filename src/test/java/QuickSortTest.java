import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class QuickSortTest {

    @Test
    void quickSortSortsCorrectly() {
        QuickSort qs = new QuickSort();

        int [] testArray1 = {9,8,7,6,5,4,3,2,1,0};
        int [] testArray2 = {9,3,4,5,7,101,5101,4343,3242,0,1,1,2,3,5,8,4,101};
        int [] testArray3 = {2,1};
        int [] testArray4 = {0,-10,-1,-505,101,777,55,77,1};
        int [] testArray5 = {101,51,99,1,2};
        qs.quickSort(testArray1, 0, testArray1.length-1);
        qs.quickSort(testArray2, 0, testArray2.length-1);
        qs.quickSort(testArray3, 0, testArray3.length-1);
        qs.quickSort(testArray4, 0, testArray4.length-1);
        qs.quickSort(testArray5, 0, testArray5.length-1);
        assertArrayEquals(testArray1
                , new int [] {0,1,2,3,4,5,6,7,8,9});
        assertArrayEquals(testArray2
                , new int [] {0, 1, 1, 2, 3, 3, 4, 4, 5, 5, 7, 8, 9, 101, 101, 3242, 4343, 5101});
        assertArrayEquals(testArray3
                , new int [] {1,2});
        assertArrayEquals(testArray4
                , new int [] {-505, -10, -1, 0, 1, 55, 77, 101, 777});
    }
}
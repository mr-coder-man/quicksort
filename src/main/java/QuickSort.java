public class QuickSort {

    public int partition(int[] arrayToSort, int left, int right)
    {
        int i = left, j = right;
        int temp;
        int pivot = arrayToSort[(left + right) / 2];

        while (i <= j) {
            while (arrayToSort[i] < pivot)
                i++;
            while (arrayToSort[j] > pivot)
                j--;
            if (i <= j) {
                temp = arrayToSort[i];
                arrayToSort[i] = arrayToSort[j];
                arrayToSort[j] = temp;
                i++;
                j--;
            }
        };

        return i;
    }

    public void quickSort(int [] arrayToSort, int left, int right) {
        int index = partition(arrayToSort, left, right);
        if (left < index - 1)
            quickSort(arrayToSort, left, index - 1);
        if (index < right)
            quickSort(arrayToSort, index, right);
    }

//    public static void main(String [] args) {
//        int [] arrayToSort = { 8, 1, 6 ,9 ,6, 7, 0, 7, 3 };
//        System.out.println("Unsorted array: ");
////        printRa(arrayToSort);
////        quickSort(arrayToSort, 0, arrayToSort.length-1);
//        System.out.println("\nSorted array: ");
////        printRa(sortedRa);
//
//    }
}
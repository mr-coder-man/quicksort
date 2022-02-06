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
}

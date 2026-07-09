import java.util.Arrays;

public class MergeSortPatientIDs {

    static void mergeSort(int[] arr, int l, int r) {

        if (l < r) {

            int m = (l + r) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    static void merge(int[] arr, int l, int m, int r) {

        int[] temp = new int[r - l + 1];

        int i = l;
        int j = m + 1;
        int k = 0;

        while (i <= m && j <= r) {

            if (arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i <= m)
            temp[k++] = arr[i++];

        while (j <= r)
            temp[k++] = arr[j++];

        for (i = l, k = 0; i <= r; i++, k++)
            arr[i] = temp[k];
    }

    public static void main(String[] args) {

        int[] ids = {105, 101, 108, 102, 104};

        mergeSort(ids, 0, ids.length - 1);

        System.out.println(Arrays.toString(ids));
    }
}
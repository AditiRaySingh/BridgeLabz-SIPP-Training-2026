import java.util.Arrays;

class HeapSort {

    static void heapSort(int[] arr) {

        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            siftDown(arr, i, n);
        }

        for (int i = n - 1; i > 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            siftDown(arr, 0, i);
        }
    }

    static void siftDown(int[] arr, int i, int n) {

        int largest = i;

        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {

            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            siftDown(arr, largest, n);
        }
    }

    public static void main(String[] args) {

        int[] arr = {7, 3, 9, 1, 4, 8};

        heapSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
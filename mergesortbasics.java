// import java.util.Arrays;

public class mergesortbasics {

    static int[] merge(int arr[], int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }

        return arr;
    }

    static void mergesort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = (l + r) / 2;
        mergesort(arr, l, mid);
        mergesort(arr, mid + 1, r);
        merge(arr, l, mid, r);


        // O(nlogn)
        // return arr;
    }

    public static void main(String[] args) {

        int[] arr = { 6, 4, 5, 7, 4, 34, 67, 89, 45, 39 };
        int n = arr.length - 1;
        // int mid=(arr.length-1)/2;
        mergesort(arr, 0, n);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}

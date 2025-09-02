import java.util.Scanner;

public class QuickSort {
  static int partition(int[] arr, int low, int high) {
    int i = low, j = high;
    int pivot = arr[low];
    while (i < j) {
      while (arr[i] <= pivot) {
        i++;
      }
      while (arr[j] > pivot) {
        j--;
      }
      if (i < j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    int temp = arr[low];
    arr[low] = arr[j];
    arr[j] = temp;
    return j;
  }

  static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
      int partitionIndex = partition(arr, low, high);
      quickSort(arr, low, partitionIndex - 1);
      quickSort(arr, partitionIndex + 1, high);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter size of Array: ");
    int n = sc.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    quickSort(arr, 0, n - 1);
ttp
  }
}

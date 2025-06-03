import java.util.Scanner;

public class _008LeftRotateArrayByKPositions {
  public static void reverse(int arr[], int low, int high) {
    while (low < high) {
      int temp = arr[low];
      arr[low] = arr[high];
      arr[high] = temp;
      low++;
      high--;
    }
  }

  public static void leftRotate(int[] arr, int n, int k) {
    /*
     * if k > n i.e., n = 10, k = 12 => 10 elements are rotated for 10 times
     * will give same as input. so we just need to rotate 2 times.
     * So we limit the value of k to be less than or equal to n.
     */
    k = k % n;
    reverse(arr, 0, k - 1);
    reverse(arr, k, n - 1);
    reverse(arr, 0, n - 1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Size of the array: ");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.print("Enter " + n + " elements: ");
    for (int i = 0; i <= n - 1; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.print("Enter k value: ");
    int k = sc.nextInt();

    leftRotate(arr, n, k);

    for (int i = 0; i <= n - 1; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
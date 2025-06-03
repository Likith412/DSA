import java.util.*;

public class _003IsArraySorted {

  public static boolean isSorted(int arr[], int n) {
    for (int i = 0; i <= n - 2; i++) {
      if (arr[i] > arr[i + 1]) {
        return false;
      }
    }
    return true;
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

    System.out.println(isSorted(arr, n));
  }
}

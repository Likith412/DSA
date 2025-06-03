import java.util.*;

public class _002SecondLargest {

  public static int getSecondLargestElement(int arr[], int n) {
    int max = arr[0];
    int max2 = Integer.MIN_VALUE;

    for (int i = 1; i <= n - 1; i++) {
      if (arr[i] > max) {
        max2 = max;
        max = arr[i];
      } else if (arr[i] > max2 && arr[i] != max) {
        max2 = arr[i];
      }
    }

    return max2;
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

    int max2 = getSecondLargestElement(arr, n);

    if (max2 == Integer.MIN_VALUE) {
      System.out.println("No 2nd Largest Element");
    } else {
      System.out.println("2nd Largest Element: " + max2);
    }
  }
}
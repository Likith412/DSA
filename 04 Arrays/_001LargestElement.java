import java.util.Scanner;

public class _001LargestElement {

  public static int getLargestElement(int arr[], int n) {
    int max = arr[0];

    for (int i = 1; i <= n - 1; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
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

    int max = getLargestElement(arr, n);
    System.out.println("Largest Element: " + max);
  }
}
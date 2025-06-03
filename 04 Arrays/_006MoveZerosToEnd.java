import java.util.Scanner;

public class _006MoveZerosToEnd {
  public static void moveZeros(int[] arr, int n) {
    int i = 0;
    for (int j = 0; j <= n - 1; j++) {
      if (arr[j] != 0) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
      }
    }
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
    moveZeros(arr, n);
    for (int i = 0; i <= n - 1; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
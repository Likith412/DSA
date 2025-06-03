import java.util.Scanner;

public class _009LinearSearch {
  public static int search(int[] arr, int n, int key) {
    for (int i = 0; i <= n - 1; i++) {
      if (arr[i] == key) {
        return i;
      }
    }
    return -1;
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

    System.out.print("Enter key: ");
    int key = sc.nextInt();

    int index = search(arr, n, key);
    if (index == -1) {
      System.out.println("Element Not Found");
    } else {
      System.out.println("Element Found at index: " + index);
    }
  }
}

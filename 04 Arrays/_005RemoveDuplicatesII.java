/*
 * You are given a sorted array arr in non-decreasing order.
 * Your task is to remove duplicates such that each unique element appears at most twice.
 * The output should return the new length k and the array should be updated in-place to have the first k elements without extra duplicates.
 */

import java.util.Scanner;

public class _005RemoveDuplicatesII {
  public static int removeDuplicates(int arr[], int n) {
    int i = 1, count = 1;
    for (int j = 1; j <= n - 1; j++) {
      if (arr[j] == arr[j - 1]) {
        count++;
      } else {
        count = 1;
      }
      if (count <= 2) {
        arr[i] = arr[j];
        i++;
      }
    }
    return i;
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

    int total = removeDuplicates(arr, n);
    for (int i = 0; i <= total - 1; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}

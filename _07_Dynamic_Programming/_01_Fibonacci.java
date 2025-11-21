package _07_Dynamic_Programming;

import java.util.Scanner;

public class _01_Fibonacci {

  // Fibonacci using Recursion
  public static int fibonacciRecursion(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }

    return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
  }

  // Fibonacci using Memoization
  public static int fibonacciMemoization(int n, int[] dp) {
    if (n == 0) {
      return 0;
    }

    if (n == 1) {
      return 1;
    }

    if (dp[n] != -1) {
      return dp[n];
    }

    dp[n] = fibonacciMemoization(n - 1, dp) + fibonacciMemoization(n - 2, dp);
    return dp[n];
  }

  // Fibonacci using Tabulation
  public static int fibonacciTabulation(int n) {
    if (n == 0) {
      return 0;
    }

    if (n == 1) {
      return 1;
    }

    int[] dp = new int[n + 1];

    dp[0] = 0;
    dp[1] = 1;

    for (int i = 2; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }

    return dp[n];
  }

  // Fiboncci using Space Optimization
  public static int fibonacciSpaceOptimization(int n) {
    if (n == 0) {
      return 0;
    }

    if (n == 1) {
      return 1;
    }

    int prev2 = 0; // F(0)
    int prev1 = 1; // F(1)
    int curr = 0;
    for (int i = 2; i <= n; i++) {
      curr = prev1 + prev2;
      prev2 = prev1;
      prev1 = curr;
    }
    return curr;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the value of n: ");
    int n = scanner.nextInt();

    // Using Recursion
    int resultRecursion = fibonacciRecursion(n);
    System.out.println("Fibonacci (Recursion) of " + n + " is: " + resultRecursion);

    // Using Memoization
    int[] dpMemoization = new int[n + 1];
    for (int i = 0; i <= n; i++) {
      dpMemoization[i] = -1;
    }
    int resultMemoization = fibonacciMemoization(n, dpMemoization);
    System.out.println("Fibonacci (Memoization) of " + n + " is: " + resultMemoization);

    // Using Tabulation
    int resultTabulation = fibonacciTabulation(n);
    System.out.println("Fibonacci (Tabulation) of " + n + " is: " + resultTabulation);

    // Using Space Optimization
    int resultSpaceOptimization = fibonacciSpaceOptimization(n);
    System.out.println("Fibonacci (Space Optimization) of " + n + " is: " + resultSpaceOptimization);

    scanner.close();
  }
}

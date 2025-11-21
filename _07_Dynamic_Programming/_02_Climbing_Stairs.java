package _07_Dynamic_Programming;

import java.util.Scanner;

public class _02_Climbing_Stairs {

  // Climbing Stairs using Recursion
  public static int climbingStairsRecursion(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }

    return climbingStairsRecursion(n - 1) + climbingStairsRecursion(n - 2);
  }

  // Climbing Stairs using Memoization
  public static int climbingStairsMemoization(int n, int[] dp) {
    if (n == 0 || n == 1) {
      return 1;
    }

    if (dp[n] != -1) {
      return dp[n];
    }

    dp[n] = climbingStairsMemoization(n - 1, dp) + climbingStairsMemoization(n - 2, dp);
    return dp[n];
  }

  // Climbing Stairs using Tabulation
  public static int climbingStairsTabulation(int n) {
    int[] dp = new int[n + 1];

    dp[0] = 1;
    dp[1] = 1;

    for (int i = 2; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }

    return dp[n];
  }

  // Climbing Stairs using Space Optimization
  public static int climbingStairsSpaceOptimization(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    int first = 1; // dp[0]
    int second = 1; // dp[1]

    for (int i = 2; i <= n; i++) {
      int current = first + second;
      first = second;
      second = current;
    }

    return second;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of stairs: ");
    int n = scanner.nextInt();

    // Recursion
    System.out.println("Climbing Stairs using Recursion: " + climbingStairsRecursion(n));

    // Memoization
    int[] dpMemo = new int[n + 1];
    for (int i = 0; i <= n; i++) {
      dpMemo[i] = -1;
    }
    System.out.println("Climbing Stairs using Memoization: " + climbingStairsMemoization(n, dpMemo));

    // Tabulation
    System.out.println("Climbing Stairs using Tabulation: " + climbingStairsTabulation(n));

    // Space Optimization
    System.out.println("Climbing Stairs using Space Optimization: " + climbingStairsSpaceOptimization(n));

    scanner.close();
  }
}

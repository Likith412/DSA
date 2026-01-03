import java.util.Scanner;

public class _03_WeightedAdjacencyMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("No of vertices/nodes: ");
        int v = sc.nextInt();
        System.out.print("No of edges: ");
        int e = sc.nextInt();

        int[][] adj = new int[v + 1][v + 1];
        for (int i = 1; i <= e; i++) {
            int f = sc.nextInt();
            int t = sc.nextInt();
            int weight = sc.nextInt();
            adj[f][t] = weight;
            adj[t][f] = weight; // For directed graph remove this (only from -> to)
        }

        System.out.println("Adjacency Matrix: ");
        for (int i = 1; i <= v; i++) {
            for (int j = 1; j <= v; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

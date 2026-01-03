import java.util.*;

public class _02_AdjacencyList {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("No of vertices/nodes: ");
        int v = sc.nextInt();
        System.out.print("No of edges: ");
        int e = sc.nextInt();

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= v; i++) {
            adj.add(new ArrayList<Integer>());
        }

        for (int i = 1; i <= e; i++) {
            int f = sc.nextInt();
            int t = sc.nextInt();
            adj.get(f).add(t);
            adj.get(t).add(f); // For directed graph remove this (only from -> to)
        }

        System.out.println("Adjacency List: ");
        for (int i = 1; i <= v; i++) {
            System.out.print(i + " -> ");
            for (int j : adj.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
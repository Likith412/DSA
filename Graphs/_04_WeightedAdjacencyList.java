import java.util.ArrayList;
import java.util.List;
import java.util.AbstractMap.SimpleEntry;
import java.util.Scanner;

public class _04_WeightedAdjacencyList {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("No of vertices/nodes: ");
        int v = sc.nextInt();
        System.out.print("No of edges: ");
        int e = sc.nextInt();

        List<List<SimpleEntry<Integer, Integer>>> adj = new ArrayList<>();
        for (int i = 0; i <= v; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 1; i <= e; i++) {
            int f = sc.nextInt();
            int t = sc.nextInt();
            int weight = sc.nextInt();

            adj.get(f).add(new SimpleEntry<Integer, Integer>(t, weight));
            // For directed graph remove this (only from -> to)
            adj.get(t).add(new SimpleEntry<Integer, Integer>(f, weight));
        }

        System.out.println("Adjacency List: ");
        for (int i = 1; i <= v; i++) {
            System.out.print(i + " -> ");
            for (SimpleEntry<Integer, Integer> j : adj.get(i)) {
                System.out.print(j.toString() + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
import java.util.*;

public class _05_BFS {
    public static List<Integer> bfs(int n, List<List<Integer>> adj) {
        boolean[] visited = new boolean[n];
        List<Integer> ans = new ArrayList<Integer>();
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();
            ans.add(cur);

            for (int k : adj.get(cur)) {
                if (!visited[k]) {
                    q.add(k);
                    visited[k] = true;
                }
            }
        }
        return ans;
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("No of vertices/nodes: ");
        int n = sc.nextInt();
        System.out.print("No of edges: ");
        int e = sc.nextInt();

        // Create adjacency List
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < e; i++) {
            int f = sc.nextInt();
            int t = sc.nextInt();
            adj.get(f).add(t);
            adj.get(t).add(f); // For directed graph remove this (only from -> to)
        }

        System.out.println("Adjacency List: ");
        for (int i = 0; i < n; i++) {
            System.out.print(i + " -> ");
            for (int j : adj.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // BFS traversal
        System.out.print("Breadth First Traversal: ");
        List<Integer> res = bfs(n, adj);
        for (int i = 0; i < n; i++) {
            System.out.print(res.get(i) + " ");
        }

        sc.close();
    }
}
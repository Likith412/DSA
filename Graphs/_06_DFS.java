import java.util.*;

public class _06_DFS {
    // Recursive function
    public static void dfsRecursion(int i, List<List<Integer>> adj, boolean[] visited, List<Integer> ans) {
        ans.add(i);
        visited[i] = true;

        for (int k : adj.get(i)) {
            if (!visited[k]) {
                dfsRecursion(k, adj, visited, ans);
            }
        }
    }

    // Main dfs function
    public static List<Integer> dfs(int n, List<List<Integer>> adj) {
        boolean[] visited = new boolean[n];
        List<Integer> ans = new ArrayList<Integer>();
        dfsRecursion(0, adj, visited, ans);
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

        // DFS traversal
        System.out.print("Depth First Traversal: ");
        List<Integer> res = dfs(n, adj);
        for (int i = 0; i < n; i++) {
            System.out.print(res.get(i) + " ");
        }

        sc.close();
    }
}

import java.util.*;

public class DirectedCycleDetection {

    static Map<Integer, List<Integer>> graph = new HashMap<>();

    // Add a directed edge
    static void addEdge(int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
    }

    // Function to check cycle
    static boolean hasCircularDependency(int n) {
        int[] state = new int[n];
        // 0 = WHITE (Not Visited)
        // 1 = GRAY (Currently Visiting)
        // 2 = BLACK (Completely Visited)

        for (int i = 0; i < n; i++) {
            if (state[i] == 0) {
                if (dfs(i, state)) {
                    return true;
                }
            }
        }
        return false;
    }

    // DFS
    static boolean dfs(int node, int[] state) {

        state[node] = 1; // GRAY

        for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {

            // Back Edge Found
            if (state[neighbor] == 1) {
                return true;
            }

            if (state[neighbor] == 0) {
                if (dfs(neighbor, state)) {
                    return true;
                }
            }
        }

        state[node] = 2; // BLACK
        return false;
    }

    public static void main(String[] args) {

        int vertices = 6;

        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(2, 3);
        addEdge(3, 4);
        addEdge(4, 1); // Creates Cycle
        addEdge(4, 5);

        if (hasCircularDependency(vertices)) {
            System.out.println("Cycle Detected");
        } else {
            System.out.println("No Cycle");
        }
    }
}
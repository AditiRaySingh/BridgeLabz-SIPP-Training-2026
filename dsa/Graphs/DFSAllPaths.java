import java.util.*;

public class DFSAllPaths {

    static Map<Integer, List<Integer>> graph = new HashMap<>();

    // Add a directed edge
    static void addEdge(int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
    }

    // Find all paths
    static void findAllPaths(int source, int destination) {

        List<Integer> path = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        List<List<Integer>> allPaths = new ArrayList<>();

        dfs(source, destination, visited, path, allPaths);

        System.out.println("All Possible Paths:");

        for (List<Integer> p : allPaths) {
            System.out.println(p);
        }
    }

    // DFS with Backtracking
    static void dfs(int current,
                    int destination,
                    Set<Integer> visited,
                    List<Integer> path,
                    List<List<Integer>> allPaths) {

        visited.add(current);
        path.add(current);

        // Destination reached
        if (current == destination) {
            allPaths.add(new ArrayList<>(path));
        } else {

            for (int neighbor : graph.getOrDefault(current, Collections.emptyList())) {

                if (!visited.contains(neighbor)) {
                    dfs(neighbor, destination, visited, path, allPaths);
                }
            }
        }

        // Backtracking
        path.remove(path.size() - 1);
        visited.remove(current);
    }

    public static void main(String[] args) {

        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 3);
        addEdge(2, 3);
        addEdge(1, 2);

        findAllPaths(0, 3);
    }
}
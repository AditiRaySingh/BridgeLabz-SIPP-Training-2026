import java.util.*;

public class BFSShortestPath {

    static Map<Integer, List<Integer>> graph = new HashMap<>();

    // Add an undirected edge
    static void addEdge(int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    // Find shortest path using BFS
    static List<Integer> shortestPath(int source, int destination) {

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        Map<Integer, Integer> parent = new HashMap<>();

        queue.offer(source);
        visited.add(source);
        parent.put(source, null);

        while (!queue.isEmpty()) {

            int current = queue.poll();

            if (current == destination) {
                break;
            }

            for (int neighbor : graph.getOrDefault(current, Collections.emptyList())) {

                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    parent.put(neighbor, current);
                    queue.offer(neighbor);
                }
            }
        }

        // Destination not reachable
        if (!visited.contains(destination)) {
            return Collections.emptyList();
        }

        // Reconstruct path
        LinkedList<Integer> path = new LinkedList<>();

        Integer node = destination;

        while (node != null) {
            path.addFirst(node);
            node = parent.get(node);
        }

        return path;
    }

    public static void main(String[] args) {

        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 3);
        addEdge(2, 4);
        addEdge(3, 5);
        addEdge(4, 5);

        List<Integer> path = shortestPath(0, 5);

        if (path.isEmpty()) {
            System.out.println("No Path Exists");
        } else {
            System.out.println("Shortest Path: " + path);
            System.out.println("Number of Flights: " + (path.size() - 1));
        }
    }
}
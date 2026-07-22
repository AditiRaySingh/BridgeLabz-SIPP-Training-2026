import java.util.*;

public class FriendGraph {

    static Map<Integer, Set<Integer>> friendGraph = new HashMap<>();

    // Add friendship (Undirected Graph)
    static void addFriendship(int u, int v) {

        friendGraph
                .computeIfAbsent(u, k -> new HashSet<>())
                .add(v);

        friendGraph
                .computeIfAbsent(v, k -> new HashSet<>())
                .add(u);
    }

    // Check if two users are friends
    static boolean isFriend(int u, int v) {

        return friendGraph
                .getOrDefault(u, Collections.emptySet())
                .contains(v);
    }

    // Display Graph
    static void displayGraph() {

        for (int user : friendGraph.keySet()) {
            System.out.println(user + " -> " + friendGraph.get(user));
        }
    }

    public static void main(String[] args) {

        addFriendship(1, 2);
        addFriendship(1, 3);
        addFriendship(2, 4);
        addFriendship(3, 5);
        addFriendship(4, 5);

        System.out.println("Friend Graph:");
        displayGraph();

        System.out.println();

        System.out.println("Is 1 friend of 2? " + isFriend(1, 2));
        System.out.println("Is 2 friend of 5? " + isFriend(2, 5));
        System.out.println("Is 4 friend of 5? " + isFriend(4, 5));
    }
}
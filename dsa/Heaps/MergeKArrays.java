import java.util.*;

class Node {

    int value;
    int arrayIndex;
    int elementIndex;

    Node(int value, int arrayIndex, int elementIndex) {
        this.value = value;
        this.arrayIndex = arrayIndex;
        this.elementIndex = elementIndex;
    }
}

class MergeKArrays {

    static List<Integer> merge(int[][] arrays) {

        PriorityQueue<Node> pq =
                new PriorityQueue<>((a, b) -> a.value - b.value);

        for (int i = 0; i < arrays.length; i++) {

            if (arrays[i].length > 0) {
                pq.offer(new Node(arrays[i][0], i, 0));
            }
        }

        List<Integer> result = new ArrayList<>();

        while (!pq.isEmpty()) {

            Node curr = pq.poll();

            result.add(curr.value);

            int nextIndex = curr.elementIndex + 1;

            if (nextIndex < arrays[curr.arrayIndex].length) {

                pq.offer(new Node(
                        arrays[curr.arrayIndex][nextIndex],
                        curr.arrayIndex,
                        nextIndex
                ));
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] arrays = {
                {1,4,7},
                {2,5,8},
                {3,6,9}
        };

        System.out.println(merge(arrays));
    }
}
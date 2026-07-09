import java.util.PriorityQueue;

public class HospitalEmergency {

    public static int kthHighest(int[] arr, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {

            pq.offer(num);

            if (pq.size() > k)
                pq.poll();
        }

        return pq.peek();
    }

    public static void main(String[] args) {

        int[] priorities = {10,30,15,50,40};

        int k = 2;

        System.out.println(kthHighest(priorities,k));
    }
}
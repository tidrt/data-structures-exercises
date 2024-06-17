package problems;

import java.util.Queue;

public class ReverseQueue {
    public static Queue<Integer> reverseFirstK(Queue<Integer> queue, int k){
        // we're going to do recursive
        solveQueue(queue, k);

        int n = queue.size() - k;
        while(n-- > 0){
            int element = queue.remove();
            queue.add(element);
        }
        return queue;
    }

    private static void solveQueue(Queue<Integer> queue, int k) {
        if(k == 0) return;

        int element = queue.remove();
        solveQueue(queue, k-1);
        queue.add(element);
    }
}

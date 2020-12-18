package chapter1.KClosest;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KClosest {
    public static int[][] solve(int[][] points, int k) {
        //Queue<int[]> queue = new PriorityQueue<>(points.length, Comp);
        //Queue<int[]> queue = new PriorityQueue<>((a, b) -> (a[0]*a[0]+a[1]*a[1])-(b[0]*b[0]+b[1]*b[1]));
        Queue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> (a[0] * a[0] + a[1] * a[1])));
        int[][] result = new int[k][2];
        int index = 0;

        for(int[] p : points) {
            queue.offer(p);
        }
        while(index < k) {
            result[index++] = queue.poll();

        }

        return result;
    }
    // 오름차순
    static Comparator<int[]> Comp = new Comparator<>() {
      @Override
      public int compare(int[] a, int[] b) {
          return (a[0]*a[0]+a[1]*a[1])-(b[0]*b[0]+b[1]*b[1]);
      }
    };
}

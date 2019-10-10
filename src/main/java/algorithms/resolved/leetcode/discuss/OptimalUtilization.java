package algorithms.resolved.leetcode.discuss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OptimalUtilization {
    public static List<int[]> getpairs(int[][] a, int[][] b, int target) {
        Arrays.sort(a, (p1, p2) -> p1[1] - p2[1]);
        Arrays.sort(b, (p1, p2) -> p1[1] - p2[1]);
        List<int[]> list = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        int x = 0;
        int y = b.length - 1;

        while (x < a.length && y >= 0) {
            int sum = a[x][1] + a[y][1];
            if (sum > target) {
                y--;
            } else {
                if (max <= sum) {
                    if (max < sum) {
                        max = sum;
                        list.clear();
                    }
                    list.add(new int[] { a[x][0], b[y][0] });
                    int index = y - 1;
                    while (index >= 0 && b[index][1] == b[index + 1][1]) {
                        list.add(new int[] { a[index][0], b[index--][0] });
                    }
                }
                x++;
            }

        }

        return list;
    }

    public static void main(String[] args) {
        int[][] a1 = { { 1, 2 }, { 2, 4 }, { 3, 6 } };
        int[][] b1 = { { 1, 2 } };
        int target1 = 7;
        getpairs(a1, b1, target1).forEach(obj -> System.out.println(Arrays.toString(obj)));
        System.out.println("----------------------------");

        int[][] a2 = { { 1, 3 }, { 2, 5 }, { 3, 7 }, { 4, 10 } };
        int[][] b2 = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 } };
        int target2 = 10;
        getpairs(a2, b2, target2).forEach(obj -> System.out.println(Arrays.toString(obj)));
        System.out.println("----------------------------");

        int[][] a3 = { { 1, 5 }, { 2, 5 } };
        int[][] b3 = { { 1, 5 }, { 2, 5 } };
        int target3 = 10;
        getpairs(a3, b3, target3).forEach(obj -> System.out.println(Arrays.toString(obj)));
    }
}
package MultiThreading;


import java.util.*;
import java.util.*;

public class Main {
    static final int MOD = 1_000_000_007;

    public static int get_ans(int N, List<Integer> A) {
        int maxA = Collections.max(A);
        int maxDiff = Integer.MIN_VALUE;
        int bestG = -1;

        for (int g = 2; g <= maxA; g++) {
            int currentSum = 0;
            int bestSum = Integer.MIN_VALUE;

            for (int num : A) {
                int val = (num % g == 0) ? num : -num;
                currentSum = Math.max(val, currentSum + val);
                bestSum = Math.max(bestSum, currentSum);
            }

            if (bestSum > maxDiff) {
                maxDiff = bestSum;
                bestG = g;
            } else if (bestSum == maxDiff) {
                bestG = Math.min(bestG, g);
            }
        }

        long result = (1L * maxDiff * bestG) % MOD;
        return (int) result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine().trim());

        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(scan.nextLine().trim()));
        }

        int result = get_ans(N, A);
        System.out.println(result);
        scan.close();
    }
}

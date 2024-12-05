package homework3;

import java.util.Arrays;

public class task4 {
    public static int calculateAverage(int[] a) {
        if (a.length == 0) return 0;

        int sum = 0;
        for (int num: a) {
            sum += num;
        }
        return (int) Math.round((double) sum / a.length);
    }

    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            a = new int[] {4, 2, 7, 5, 1};
        } else {
            a = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
        }
        int result = calculateAverage(a);
        System.out.println(result);
    }
}

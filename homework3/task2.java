package homework3;

import java.util.ArrayList;
import java.util.Arrays;

public class task2 {
    public static int[] getUniqueElements(int[] a) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num: a) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            a = new int[]{1, 2, 2, 3, 4, 4, 5};
        } else {
            a = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
        }
        task2 answer = new task2();
        String itresume_res = Arrays.toString(answer.getUniqueElements(a));
        System.out.println(itresume_res);
    }
}

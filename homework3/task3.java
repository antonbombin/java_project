package homework3;

import java.util.ArrayList;
import java.util.Arrays;

public class task3 {
    public static String[] filterShortStrings(String[] arr) {
        ArrayList<String> result = new ArrayList<>();
        for (String s: arr) {
            if (s.length() > 3) {
                result.add(s);
            }
        }
        String[] resultArray = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }


    public static void main(String[] args) {
        String[] arr;

        if (args.length == 0) {
            arr = new String[] {"cat", "elephant", "dog", "giraffe"};
        } else {
            arr = args[0].split(", ");
        }

        String itresume_res = Arrays.toString(filterShortStrings(arr));
        System.out.println(itresume_res);
    }
}

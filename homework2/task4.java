package homework2;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class task4 {

    private static File log;
    private static FileWriter fileWriter;

    public static void findMinMax(int[] arr) {
        try {
            log = new File("log.txt");
            log.createNewFile();
            fileWriter = new FileWriter(log);

            int min = arr[0];
            int max = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > min) {
                    min = arr[i];
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
                logStep(min,max);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void logStep(int min, int max) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String timestamp = dateFormat.format(new Date());
            fileWriter.write(timestamp + " " + min + ", " + max + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int[] arr = {};
        if (args.length == 0) {
            arr = new int[] {9, 4, 8, 3, 1};
        } else {
            arr = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        task4 ans = new task4();
        ans.findMinMax(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

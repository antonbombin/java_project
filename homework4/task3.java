package homework4;

import java.util.LinkedList;

public class task3 {
    public static int countOccurrences (LinkedList<String> list, String value) {
        int count = 0;
        for (String s: list) {
            if (s.equals(value)) {
                count++ ;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        String value;

        if (args.length < 2) {
            list.add("apple");
            list.add("banana");
            list.add("apple");
            list.add("pear");
            list.add("banana");
            value = "apple";
        } else {
            for (int i = 0; i < args.length; i++) {
                list.add(args[i]);
            }
            value = args[args.length - 1];
            }

        task3 utils = new task3();
        System.out.println("Occurrences of \"" + value + "\": " + utils.countOccurrences(list, value));

        }

    }


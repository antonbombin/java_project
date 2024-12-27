package homework4;

import java.util.LinkedList;

public class task1 {
    public static void removeOddLengthStrings (LinkedList<String> ll) {
        LinkedList<String> toRemove = new LinkedList<>();
        for (String s: ll) {
            if (s.length() % 2 != 0) {
                toRemove.add(s);
            }
        }
        ll.removeAll(toRemove);
    }

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        if (args.length == 0) {
            ll.add("apple");
            ll.add("banana");
            ll.add("pear");
            ll.add("grape");
        } else {
            for (String arg: args) {
                ll.add(arg);
            }
        }

        task1 answer = new task1();
        System.out.println(ll);
        answer.removeOddLengthStrings(ll);
        System.out.println(ll);
    }
}

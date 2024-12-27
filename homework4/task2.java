package homework4;

import java.util.LinkedList;

public class task2 {
    private LinkedList<String> stack = new LinkedList<>();

    public void push(String element) {
        stack.addFirst(element);
    }

    public String pop() {
        return stack.removeFirst();
    }

    public LinkedList<String> getElements() {
        return new LinkedList<>(stack);
    }

    public String peek() {
        return stack.peekFirst();
    }


    public static void main(String[] args) {
        task2 stack = new task2();

        if (args.length == 0) {
            stack.push("apple");
            stack.push("banana");
            stack.push("pear");
            stack.push("grape");
        } else {
            for (String arg : args) {
                stack.push(arg);
            }
        }
        System.out.println(stack.getElements());
        System.out.println(stack.pop());
        System.out.println(stack.getElements());
        System.out.println(stack.peek());
    }
}

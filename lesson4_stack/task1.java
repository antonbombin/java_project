package lesson4_stack;

public class task1 {
    public static void main(String[] args) {
        GBStack<Integer> stack = new GBStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);


        System.out.println(stack.pop());

        System.out.println(stack);
    }
}

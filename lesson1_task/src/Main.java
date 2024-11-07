import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(task6());
    }

    public static String task6() {
        String s = "Добро пожаловать на курс по Java";

        String[] split = s.split("\\s");

        String res = "";
        String s1 = "";
        for (int i = split.length - 1; i >= 0; i--) {
            s1 += res + split[i] + " ";
//            System.out.print(split[i] + " ");
        }
        return s1;
    }

    public static void cycle() {
        while (true) {
            task2();
        }
    }

    public static void task2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name: ");

        String name = sc.next();
        if(name.startsWith("q")) System.exit(0);

        if(name.startsWith("Al")) {
            System.out.println("Are you Alex? ");
        } else {
            System.out.println("You aren't Alex");
        }
        System.out.println("Hello " + name + "!");

    }
}
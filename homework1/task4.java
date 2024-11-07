package homework1;

public class task4 {
    public  static void main(String[] args) {
       int a = 5, b = 10, c = 3;

       if (args.length == 3) {
           a = Integer.parseInt(args[0]);
           b = Integer.parseInt(args[1]);
           c = Integer.parseInt(args[2]);
       }

       task4 ans = new task4();
       int itresume_res = ans.findMaxOfThree(a, b, c);
        System.out.println(itresume_res);

    }

    public int findMaxOfTwo(int a, int b) {
        return (a > b) ? a : b;
    }

    public int findMaxOfThree(int a, int b, int c) {
        return findMaxOfTwo(findMaxOfTwo(a, b), c);
    }
}

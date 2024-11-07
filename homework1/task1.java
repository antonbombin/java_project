package homework1;

public class task1 {
    public  static void main(String[] args) {
        int n = 5;

        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        }
        task1 ans = new task1();
        int itresume_res = ans.factorial(n);
        System.out.println(itresume_res);
    }

    public int factorial(int n) {
        if (n < 0) {
            return - 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}

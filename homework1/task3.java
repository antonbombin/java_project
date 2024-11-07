package homework1;

public class task3 {
    public  static void main(String[] args) {
        int n = 12345;

        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        }

        task3 ans = new task3();

        int itresume_res = ans.sumDigits(n);
        System.out.println(itresume_res);
    }

    public int sumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}

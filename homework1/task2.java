package homework1;

public class task2 {
    public  static void main(String[] args) {
    task2 ans = new task2();
    ans.printEvenNums();
    }

    public static void printEvenNums() {
        for (int i = 2; i <= 100 ; i  += 2) {
            System.out.println(i);
        }
    }
}

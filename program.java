/**
 * program
 */
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class program {
    public static void main(String[] args) {
        // System.out.println("world"); // вывод текста в консоль
        // float f = 123.45f;
        // System.out.println(f);
        // char ch = 123;
        // System.out.println(ch);

        // Неявная типизация
        // var i = 123;
        // System.out.println(i);
        // String s = "qwer";
        // s.charAt(1);
        // System.out.println(s);
        // int[] arr = new int[10];
        // arr[3] = 13;
        // System.out.println(arr[3]);
        
        // массивы одномерные и многомерные
        // int[][] arr = new int[3][5];
        
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //         System.out.printf("%d", arr[i][j]);    
        //     }
        //     System.out.println();
        // }
        // явное предоразование
        // byte b = Byte.parseByte("12");
        // System.out.println(b);
        
        // Ввод с консоли строки
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("name: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Привет, %s!", name);
        // iScanner.close();

        // Ввод с консоли целого числа и дробного
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a = ");
        // int x = iScanner.nextInt();
        // System.out.printf("double a = ");
        // double y = iScanner.nextDouble();
        // System.out.printf("%d + %2f = %2f", x, y, x + y);
        // iScanner.close();
        
        // Оператор выбора
        // int a = 123;
        // switch (a) {
        //     case 1:
        //         System.out.println('a');
        //         break;
        //     case 2:
        //         System.out.println('b');
        //         break;
        // }
        // for (int i = 0; i < 10; i++) {
        //     if (i % 2 != 0)
        //     {
        //         continue;
        //     }
        //     System.out.println(i);
        // }
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        

        // Работа с файлами
        // try (FileWriter fw = new FileWriter("text.txt", false)) {
        //     fw.write("line 1");
        //     fw.append('\n');
        //     fw.append('2');
        //     fw.append('\n');
        //     fw.write("line 3");
        //     fw.flush();
        // } catch (IOException ex) {
        //     System.out.println(ex.getMessage());
        // }
        

    }
    
}
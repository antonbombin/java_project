import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class lesson1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        LocalTime now = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("Дата: dd.MM.yyyy г., время: HH ч. mm мин. ss сек.");
        System.out.println(formatter.format(LocalDateTime.now()));
        
    }
}

package homework2;

public class task2 {

    public static String generateCSV(String[] headers, String[][] data) {
        StringBuilder csv = new StringBuilder();

        csv.append(String.join(",", headers)).append("\n");

        for (String[] row : data) {
            csv.append(String.join(",", row)).append("\n");
        }

        return csv.toString().trim();
    }

    public static void main(String[] args) {
        String[] headers = {};
        String[][] data = {};

        if (args.length == 0) {
            headers = new String[] {"Name", "Age", "City"};
            data = new String[][] {
                    {"John", "30", "New York"},
                    {"Alice", "25", "Los Angeles"},
                    {"Bob", "35", "Chicago"}
            };
        }

        task2 ans = new task2();
        System.out.println(ans.generateCSV(headers, data));

    }
}

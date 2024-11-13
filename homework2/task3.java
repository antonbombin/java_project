package homework2;

public class task3 {
    public static String removeEmptyLines(String text) {
        String[] lines = text.split("\n");
        StringBuilder cleanedText = new StringBuilder();

        for (String line : lines) {
            if (!line.trim().isEmpty()) {
                if (cleanedText.length() > 0) {
                    cleanedText.append("\n");
                }
                cleanedText.append(line);
            }
        }

        return cleanedText.toString();
    }

    public static void main(String[] args) {
        String text = "";

        if (args.length == 0) {
            text = "line1\n\nline2\n\nline3";
        } else {
            text = args[0];
        }

        task3 ans = new task3();
        System.out.println(ans.removeEmptyLines(text));
    }
}

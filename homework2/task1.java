package homework2;

public class task1 {
    public static String buildURL(String baseURL, String params) {
        StringBuilder url = new StringBuilder(baseURL);
        String[] pairs = params.split("&");

        for (int i = 0; i < pairs.length; i++) {
            String[] keyValue = pairs[i].split("=");
            if (!"null".equals(keyValue[1])) {
                if (i > 0) {
                    url.append("&");
                }
                url.append(keyValue[0]).append("=").append(keyValue[1]);
            }
        }
        return url.toString();
    }

    public static void main(String[] args) {
        String baseURL = "";
        String params = "";

        if (args.length == 0) {
            baseURL = "https://example.com/search?";
            params = "query=java&sort=desc&filter=null";
        } else {
            baseURL = args[0];
            params = args[1];
        }

        task1 ans = new task1();
        System.out.println(ans.buildURL(baseURL, params));

    }

}

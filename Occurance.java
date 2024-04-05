import java.util.regex.Pattern;

public class Occurance {
    public static void main(String[] args) {
        String str = "mynamemyisrockymynamemyeisrockymymy";
        String subStr = "mynamemy";

        // long count = Pattern.compile(subStr)
        // .matcher(str)
        // .results()
        // .count();

        // System.out.println("Number of occurrences of \"" + subStr + "\": " + count);

        int count2 = solve(str, subStr);
        boolean res = hasSubString(str, subStr);
        System.out.println(res);
        System.out.printf("Count: %d", count2);

    }

    private static int solve(String str, String target) {
        int windowSize = target.length();
        int i = 0;
        int j = 0;
        int count = 0;

        while (j < str.length()) {
            if ((j - i + 1) == windowSize) {
                String sub = str.substring(i, j + 1);
                if (sub.equals(target)) {
                    count++;
                }
                i++;
            }
            j++;
        }
        return count;
    }

    private static boolean hasSubString(String str, String target) {
        int windowSize = target.length();
        int i = 0;
        int j = 0;
        int count = 0;

        while (j < str.length()) {
            if ((j - i + 1) == windowSize) {
                String sub = str.substring(i, j + 1);
                if (sub.equals(target)) {
                    count++;
                }
                i++;
            }
            j++;
        }
        return count > 0;
    }

}

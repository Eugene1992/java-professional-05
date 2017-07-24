package regex;

import java.util.StringTokenizer;

public class StringTokenizerTest {
    public static void main(String[] args) {
        StringTokenizer stringTokenizer =
                new StringTokenizer("London, is a, capital of Great Britain!", ",", true);

        while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();
            System.out.println(token);
        }
    }
}

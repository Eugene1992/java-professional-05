package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        String str = "dey6@com";
        Pattern p = Pattern.compile("[a-z0-9@][^x]{2,10}"); // \\w == a-zA-Z0-9_
        Matcher m = p.matcher(str);
        System.out.println(m.matches());


//        Общая длина - не менее 10 символов
//        Должен включать символы в обеих регистрах  и цифры a также символ нижнего подчеркивания

    }
}

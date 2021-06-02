package validateaccount;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String ACOUNT_REGEX = "^[_a-z0-9]{6,}$";
    private static final String ACOUNT_REGEX1 = "^[APC][0-9]{4}[GHIKLM]$";
    public AccountExample(){
    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(ACOUNT_REGEX1);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

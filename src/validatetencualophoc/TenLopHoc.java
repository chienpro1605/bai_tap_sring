package validatetencualophoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TenLopHoc {
   // private static final String ACOUNT_REGEX1 = "^[APC][0-9]{4}[GHIKLM]$";
    private static final String PHONE_NUMBER_REGEX = "^[(][0-9]{2}[)][-][(][0][0-9]{9}[)]$";
    public static boolean validate(String regex){
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

package validatetencualophoc;

import validateaccount.AccountExample;

public class TenlopHocTest {
    private static TenLopHoc tenLopHoc;
    //public static final String[] invalidAccount1 = new String[]{"C0318G", "M0318G", "P0323A"};
    public static final String[] invalidAccount = new String[]{"(84)-(0978489648)", "(a8)-(22222222)"};

    public static void main(String[] args) {
        tenLopHoc = new TenLopHoc();
        for (String account : invalidAccount) {
            boolean isvalid = tenLopHoc.validate(account);
            System.out.println("Account is " + account + " is valid: " + isvalid);
        }
    }
}

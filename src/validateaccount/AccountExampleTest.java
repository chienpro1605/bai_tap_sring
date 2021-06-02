package validateaccount;

public class AccountExampleTest {
    private static AccountExample accountExample;

    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};
    public static final String[] invalidAccount1 = new String[]{"C0318G", "M0318G", "P0323A"};

    public static void main(String args[]) {
        accountExample = new AccountExample();
        for (String account : invalidAccount1) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account + " is valid: " + isvalid);
        }
//        for (String account : invalidAccount) {
//            boolean isvalid = accountExample.validate(account);
//            System.out.println("Account is " + account +" is valid: "+ isvalid);
//        }
//    }
    }
}

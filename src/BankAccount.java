public class BankAccount {
    private static double balance;
    String first;
    String last;
    String mail;
    long phone;
    boolean adminPriv;
    String username;
    String password;

    public BankAccount(String first, String last, String mail, long phone, String balance, boolean admin, String user, String pass) {
        this.first = first;
        this.last = last;
        this.mail = mail;
        this.phone = phone;
        this.balance = Integer.valueOf(balance);
        adminPriv = admin;
        username = user;
        password = pass;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public String getMail() {
        return mail;
    }

    public long getPhone() {
        return phone;
    }

    public static double getBalance() {
        return balance;
    }

    public boolean getAdminPriv() {
        return adminPriv;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static void setBalance(double a) {balance = a;}
}

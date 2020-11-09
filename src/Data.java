import java.util.ArrayList;
import java.util.HashMap;

public class Data {
    private static BankAccount[] database = new BankAccount[3];

    public static void init() {
        new Data().initializeData();
    }

    public void initializeData() {
        database[0] = new BankAccount("Devon", "Botney", "dbotney@ucvts.org", 3335551100L, "750", false, "dbotney", "123");
        database[1] = new BankAccount("Stewart", "Little", "slittle@gmail.com", 5432210099L, "15", false, "stlitle", "234");
        database[2] = new BankAccount("Big", "Boss", "bigboss@email.com", 9999999999L, "23000", true, "admin", "098");
    }

    public static boolean findUsername(String user) {
        for(BankAccount account : database) {
            if (account != null && account.getUsername().equals(user)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkPassword(String user, String pass) {
        for(BankAccount account : database) {
            if (account != null && account.getUsername().equals(user) && account.getPassword().equals(pass)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkPriv(String user, String pass) {
        for(BankAccount account : database) {
            if (account != null && account.getUsername().equals(user) && account.getPassword().equals(pass) && account.getAdminPriv() == true) {
                return true;
            }
        }
        return false;
    }

    public static boolean accountCheck(int a) {
        if (a >= database.length) return false;
        return true;
    }

    public static String dataInsert(int a, int d) {
        switch (d) {
            case 0:
                return database[a].getFirst();
            case 1:
                return database[a].getLast();
            case 2:
                return database[a].getMail();
            case 3:
                return String.valueOf(database[a].getPhone());
            case 4:
                return String.valueOf(database[a].getBalance());
            case 5:
                return String.valueOf(database[a].getAdminPriv());
            case 6:
                return database[a].getUsername();
            case 7:
                return database[a].getPassword();
            default:
                return "";
        }
    }
}

package Session7.ex6;

import java.util.ArrayList;

public class UserManager {
    public static ArrayList<User> users = new ArrayList<>();

    public static void addUser(User u) {
        users.add(u);
    }

    public static boolean checkLogin(String username, String password) {
        for (User u : users) {
            if (u.userName.equals(username) && u.password.equals(password)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        User u1 = new User(1, "admin", "123456");
        User u2 = new User(2, "bob", "password123");
        User u3 = new User(3, "alice", "alice@2024");

        UserManager.addUser(u1);
        UserManager.addUser(u2);
        UserManager.addUser(u3);

        System.out.println("---------------------------");

        System.out.println("Thử đăng nhập admin/123456: " + UserManager.checkLogin("admin", "123456"));
        System.out.println("Thử đăng nhập bob/wrongpass: " + UserManager.checkLogin("bob", "wrongpass"));
        System.out.println("Thử đăng nhập unknow/123: " + UserManager.checkLogin("unknow", "123"));
    }
}

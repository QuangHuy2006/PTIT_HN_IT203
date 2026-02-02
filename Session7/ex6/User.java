package Session7.ex6;

public class User {
    private final int id;
    String userName;
    String password;
    static int idauto = 0;
    public User( String userName, String password) {
        this.id = idauto++;
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User[ID=" + id + ", Username='" + userName + "']";
    }

}

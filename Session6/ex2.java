package Session6;

public class ex2 {
    String username;
    String password;
    String email;

    public ex2(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void changePassword(String newPassword){
        this.password = newPassword;
    }
    public void showAccount() {
        password = password.replaceAll("\\w", "*");
        System.out.println("Ten dang nhap: " + username);
        System.out.println("Mat khau: " + password);
        System.out.println("email: " + email);
    }
    public static void main(String[] args){
        ex2 account1 = new ex2("quanghuy1234", "dangquangyeurikkei", "quanghuy@gmail.com");
        account1.showAccount();
        account1.changePassword("dangquangyeutriduong");
        account1.showAccount();
    }
}

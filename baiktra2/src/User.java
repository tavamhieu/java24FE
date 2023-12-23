import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private String pass;
    private String usename;
    private String email;

    public User(String pass, String usename, String email) {
        this.pass = pass;
        this.usename = usename;
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void changename(){
        System.out.println("thay doi ten");
    }
    public  void changeemail(){
        System.out.println("doi email");
    }
    public  void changepass(){
        System.out.println("doi mat khau");
    }
    public  void logout(){
        System.out.println("dang xuat");
    }
    public  void thoatchuongtring(){
        System.out.println("thoat chuong trinh");
    }
}
class Main {
    private static User currentUser;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> userlist = new ArrayList<>();
        while (true) {
            System.out.println("nhap lua chọn cua ban");
            System.out.println("1. Đăng nhập");
            System.out.println("2. Đăng ký");
            System.out.println("3. đoi ten");
            System.out.println("4. Thoát");
            int nhap = sc.nextInt();

            switch (nhap) {
                case 1:
                    login(); {
                    break;
                }
                case 2:
                register();{

                    break;
                }
                case 3:
                changeUsername();{

                    break;
                }
                case 4: {

                    break;
                }
                default: {
                    System.out.println("Không có");
                    break;
                }
            }

        }
    }

    private static void login() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập email: ");
        String email = scanner.nextLine();

        System.out.print("Nhập mật khẩu: ");
        String pass = scanner.nextLine();

        User user = new User("pass","usename","email") ;

        if (user != null && user.getPass().equals(pass)) {
            currentUser = user;
            System.out.println("Chào mừng " + currentUser.getUsename() + ", bạn có thể thực hiện các công việc sau:");
            // Hiển thị menu công việc sau khi đăng nhập thành công

        } else {
            System.out.println("Tài khoản hoặc mật khẩu không chính xác.");
        }
    }
    private static void register() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên người dùng: ");
        String username = scanner.nextLine();

        String email;
            System.out.print("Nhập email: ");
            email = scanner.nextLine();


        String password;
        do {
            System.out.print("Nhập mật khẩu (7-15 ký tự): ");
            password = scanner.nextLine();
        } while (password.length() < 7 || password.length() > 15);

        User newUser= new User("pass","usename","email");

        System.out.println("Đăng ký thành công!");
    }
    private static void changeUsername() {
        if (currentUser == null) {
            System.out.println("Bạn cần đăng nhập trước khi thay đổi tên người dùng.");
            return;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên người dùng mới: ");
        String newUsername = scanner.nextLine();



        System.out.println("Thay đổi tên người dùng thành công.");
    }
}

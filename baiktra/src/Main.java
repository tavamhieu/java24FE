
//import java.util.ArrayList;
//import java.util.Scanner;
//
//// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
//// then press Enter. You can now see whitespace characters in your code.
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        ArrayList<User> user= new ArrayList<>();
//        while (true){
//            System.out.println("nhap lua chọn cua ban");
//            System.out.println("1. Đăng nhập");
//            System.out.println("2. Đăng ký");
//            System.out.println("3. Quên mật khẩu");
//            System.out.println("4. Thoát");
//            int nhap=sc.nextInt();
//
//            switch (nhap) {
//                case 1: login(){
//                    break;
//                }
//                case 2: {
//                    System.out.println("Cà phê đá");
//                    break;
//                }
//                case 3: {
//                    System.out.println("String dâu");
//                    break;
//                }
//                case 4: {
//                    System.out.println("Trà đá");
//                    break;
//                }
//                default: {
//                    System.out.println("Không có");
//                    break;
//                }
//            }
//
//        }
//    }
//    private static void login() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Nhập email: ");
//        String email = scanner.nextLine();
//
//        System.out.print("Nhập mật khẩu: ");
//        String password = scanner.nextLine();
//
//        User user = getUserByEmail(email);
//
//        if (user != null && user.getPass().equals(password)) {
//            currentUser = user;
//            System.out.println("Chào mừng " + currentUser.getUsername() + ", bạn có thể thực hiện các công việc sau:");
//            // Hiển thị menu công việc sau khi đăng nhập thành công
//            // ...
//        } else {
//            System.out.println("Tài khoản hoặc mật khẩu không chính xác.");
//        }
//    }
//
//}

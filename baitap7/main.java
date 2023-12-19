package baitap7;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Book> bk= new ArrayList<>();
        Book bkk=new Book();
        bkk.setId("2222");
        bkk.setTitle("cooking");
        bkk.setAuthor("sam");
        bkk.setCategory("new");
        bkk.setPublisher("ninh tay");
        bkk.setYear(2003);
        Book bkk2=new Book();
        bkk2.setId("2999");
        bkk2.setTitle("cooking2");
        bkk2.setAuthor("sam");
        bkk2.setCategory("old");
        bkk2.setPublisher("ninh tay");
        bkk2.setYear(2003);
        for (int i = 0; i < bk.size(); i++) {
            System.out.println(bk.get(i));
        }
        System.out.println("Nhập tên sản phẩm muốn tìm");
        String findName = sc.nextLine();
        for (int i = 0; i < bk.size(); i++) {
            if (bk.get(i).getTitle().equalsIgnoreCase(findName)) {
                System.out.println(bk.get(i));
            }

        }
        System.out.println("Nhập id sản phẩm muốn tìm");
        String findId = sc.nextLine();
        for (int i = 0; i < bk.size(); i++) {
            if (bk.get(i).getId().equalsIgnoreCase(findId)) {
                System.out.println(bk.get(i));
            }
        }
        System.out.println("nhap the loai sản phẩm muốn tìm");
        String findcatagory = sc.nextLine();
        for (int i = 0; i < bk.size(); i++) {
            if (bk.get(i).getCategory().equalsIgnoreCase(findcatagory)) {
                System.out.println(bk.get(i));
            }
        }

    }
}

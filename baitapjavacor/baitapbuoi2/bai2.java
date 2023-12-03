package baitapbuoi2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("xin chao moi bn nhap ten");
        System.out.println("nhap tedn");
        String name=sc.nextLine();
        System.out.println("nhap tuoi");
        int old= sc.nextInt();
        System.out.println("nhap gioi tinh");
        String gt=sc.nextLine();


        System.out.println("ten:"+name);
        System.out.println("tuoi"+old);
        System.out.println("gioi tinh"+gt);

    }
}

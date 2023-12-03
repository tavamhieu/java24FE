package baitapbuoi2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int chuvi=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("chieu dai hinh chu nhat");
        int d= sc.nextInt();
        System.out.println("chieu rong hinh chu nhat");
        int r= sc.nextInt();
        chuvi=chuvi+d+r;
        System.out.println("chu ci hcn la :"+chuvi);


    }
}

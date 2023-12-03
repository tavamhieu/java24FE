package baitapbuoi3;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
    show();
    }
    public static void show(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap0");
        String a=sc.nextLine();
        for (int i=1;i<=10;i++){
            System.out.print(a);
        }
    }

}

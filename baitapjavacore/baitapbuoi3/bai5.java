package baitapbuoi3;
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        tinhthetich();
    }
    public static void tinhthetich(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính của hình cầu: ");
        double radius = scanner.nextDouble();

        double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);


    }
}

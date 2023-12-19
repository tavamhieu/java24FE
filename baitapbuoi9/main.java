package baitapbuoi9;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Product>pr= new ArrayList<>();
        Product product =new Product();
        product.setId("555");
        product.setName("chuoi");
        product.setDescription("ngon");
        product.setPrice(22);
        product.setQuantity(512229);

        Product product2 =new Product();
        product2.setId("555");
        product2.setName("chao long");
        product2.setDescription("ngon");
        product2.setPrice(29);
        product2.setQuantity(512229);

        Product product3 =new Product();
        product3.setId("25248");
        product3.setName("bun ca");
        product3.setDescription("ngon");
        product3.setPrice(51);
        product3.setQuantity(512229);
        pr.add(product);
        pr.add(product2);
        pr.add(product3);

        for (int i = 0; i < pr.size(); i++) {
            System.out.println(pr.get(i));
        }

        System.out.println("Nhập tên sản phẩm muốn tìm");
        String findName = sc.nextLine();
        for (int i = 0; i < pr.size(); i++) {
            if (pr.get(i).getName().equalsIgnoreCase(findName)) {
                System.out.println(pr.get(i));
            }

        }
        System.out.println("Nhập id sản phẩm muốn tìm");
        String findId = sc.nextLine();
        for (int i = 0; i < pr.size(); i++) {
            if (pr.get(i).getId().equalsIgnoreCase(findId)) {
                System.out.println(pr.get(i));
            }
        }
        System.out.println("nhap sản phẩm muốn tìm có so luong duoi 5");

        for (int i = 0; i < pr.size(); i++) {
            if (pr.get(i).getQuantity()<5){
                System.out.println(pr.get(i));
            }
        }

    }
}

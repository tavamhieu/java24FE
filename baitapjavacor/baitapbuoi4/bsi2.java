package baitapbuoi4;

import java.util.Scanner;

public class bsi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang");
        int n = sc.nextInt();
        int[]arr =new int[n];
        System.out.println("nhap cac phan tu:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("mang vua nhap la:");
        for(int i =0;i<n;i++){
            System.out.println(arr[i]);
        }
        for (int i=0;i<n;i++){
            if(arr[i]%2==0){
                arr[i]++;
            }
        }
        System.out.println("mang 2 laf:");
        for(int i =0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}

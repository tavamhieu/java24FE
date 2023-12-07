import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        arr();
    }
    static void arr() {
        Scanner sc = new Scanner(System.in);

        int soDong, soCot;
        System.out.println("Nhập vào số dòng của mảng: ");
        soDong = sc.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        soCot = sc.nextInt();
        int[][] A = new int[soDong][soCot];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                A[i][j] = sc.nextInt();

            }
            System.out.println();
        }
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(A[i][j] + "\t");
            }
            // sau khi viết xong 1 dòng thi xuống hàng
            System.out.println("\n");
        }
        System.out.println("Các phần tử nằm trên đường chéo chính:");

        for (int i = 0; i < soDong; i++) {
            System.out.print(A[i][i] + " ");
        }
        }


//        mang 2


        int[][] B = new int[soDong][soCot];
            for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                B[i][j] = sc.nextInt();

            }
            System.out.println();
        }
            System.out.println("Mảng vừa nhập: ");
            for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(B[i][j] + "\t");
            }
            // sau khi viết xong 1 dòng thi xuống hàng
            System.out.println("\n");
        }

    }







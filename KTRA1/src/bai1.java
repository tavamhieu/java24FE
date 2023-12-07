import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        hinhvuong();
        tamgiacvuong();

    }
    static  void hinhvuong() {
        int[][] arr = new int[4][4];

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                arr[i][j] = 1;
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    static  void tamgiacvuong(){
        int n = 4;
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j] = 1;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }


}

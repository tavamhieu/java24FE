package baitapbuoi3;

public class bai4 {
    public static void main(String[] args) {
       tong();
    }
    public static void tong(){
        int sum = 0;
        for (int i =1;i<=100;i++){
            if(i % 5==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}

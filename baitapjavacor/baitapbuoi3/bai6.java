package baitapbuoi3;

public class bai6 {
    public static void main(String[] args) {
        System.out.println(number());

    }
    public static void number(int number){
        for (int i =1;i<=100;i++){
            if(i%3==0){
                System.out.println("so chia het cho ba:"+i+"fizz");
            }
            if(i%5==0){
                System.out.println("so chia hêt cho 5:"+i+"buzz");
            }
            if(i%3==0 && i%5==0){
                System.out.println("so chia hêt cho 5:"+i+"buzzfizz");
            }
        }
    }
}

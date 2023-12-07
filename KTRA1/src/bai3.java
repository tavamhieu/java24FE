import java.util.Random;

public class bai3 {
    public static void main(String[] args) {
        number1();

    }
    static void number1() {
            Random random = new Random();
            int n = random.nextInt(25) + 1;

            System.out.println("Số được sinh ra là: " + n);

            boolean isPrime = true;

            if (n <= 1) {
                isPrime = false;
            } else {
                for (int i = 1; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(n + " là số nguyên tố.");
            } else {
                System.out.println(n + " không phải là số nguyên tố.");
            }
    }
}



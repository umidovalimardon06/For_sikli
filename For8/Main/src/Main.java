import java.util.Scanner;   // Scanner sinfini olib kel
import java.math.BigInteger;   // BigInteger  sinfini olib kel

public class Main {
    public static void main (String[] args){
        // Scanner obyektini o'rnatish
        Scanner sc = new Scanner(System.in);

        System.out.print("a ni kiriting:");
        int a = sc.nextInt();
        System.out.print("b ni kiriting:");
        int b = sc.nextInt();


        // Kopaytmani saqlash uchun ozgaruvchi
        BigInteger kopaytma = BigInteger.ONE;

        // Hison kitoblar
        for (int i = a + 1; i < b ; i++) {

            kopaytma = kopaytma.multiply(BigInteger.valueOf(i));

        }

        // Natijalarni display qilish
        System.out.println("Ko'paytma: "+kopaytma);

    }
}


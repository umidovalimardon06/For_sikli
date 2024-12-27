import java.util.Scanner;  // Scanner sinfini olib kel
public class Main {
    public static void main (String[] args){
        // Scanner obyektini o'rnatish
        Scanner sc = new Scanner(System.in);

        System.out.print("a ni kiriting:");
        int a = sc.nextInt();
        System.out.print("b ni kiriting:");
        int b = sc.nextInt();

        // Summani saqlash uchun o'zgaruvchi
        long summa = 0;

        // Hison kitoblar
        for (long i = a+1; i < b ; i++) {

            summa += i * i;

        }

        // Natijalarni display qilish
        System.out.println("Summa: "+summa);


    }
}
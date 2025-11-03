import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan angka: ");
        int angka = input.nextInt();

        if (angka % 2 == 0){
            System.out.println(angka+" adalah angka bilangan genap");
        }else {
            System.out.println(angka + " adalah angka bilangan ganjil.");
        }
    }
}

/**
 * Program Kalkulator Sederhana dalam Java.
 * Program ini menyediakan operasi dasar seperti penjumlahan, pengurangan,
 * perkalian, dan pembagian.
 */
import java.util.Scanner;

public class SimpleCalculator {

    /**
     * Menambahkan dua angka.
     *
     * @param a Angka pertama
     * @param b Angka kedua
     * @return Hasil penjumlahan a dan b
     */
    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * Mengurangi angka kedua dari angka pertama.
     *
     * @param a Angka pertama
     * @param b Angka kedua
     * @return Hasil pengurangan a dikurangi b
     */
    public static double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Mengalikan dua angka.
     *
     * @param a Angka pertama
     * @param b Angka kedua
     * @return Hasil perkalian a dan b
     */
    public static double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Membagi angka pertama dengan angka kedua.
     *
     * @param a Pembilang
     * @param b Penyebut
     * @return Hasil pembagian a dibagi b
     * @throws ArithmeticException Jika b adalah nol
     */
    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Tidak dapat membagi dengan nol");
        }
        return a / b;
    }

    /**
     * Metode utama untuk menjalankan kalkulator.
     *
     * @param args Argumen baris perintah
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kalkulator Sederhana");
        System.out.print("Masukkan angka pertama: ");
        double num1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double num2 = scanner.nextDouble();

        System.out.println("Pilih operasi: +, -, *, /");
        char operation = scanner.next().charAt(0);

        double result;
        try {
            switch (operation) {
                case '+':
                    result = add(num1, num2);
                    System.out.println("Hasil: " + result);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    System.out.println("Hasil: " + result);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    System.out.println("Hasil: " + result);
                    break;
                case '/':
                    result = divide(num1, num2);
                    System.out.println("Hasil: " + result);
                    break;
                default:
                    System.out.println("Operasi tidak valid");
                    break;
            }
        } catch (ArithmeticException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }

        scanner.close();
    }
}

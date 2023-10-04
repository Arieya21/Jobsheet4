import java.util.Scanner;

public class Gaji17 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int jmlMasuk, JmlTdkMasuk, TotGaji;
        int gaji, potGaji;

        System.out.print("Masukkan Jumlah Gaji per Hari : ");
        gaji = input.nextInt();
        System.out.println("Masukkan Jumlah Pot Gaji Per Tidak Masuk Satu Hari : ");
        potGaji = input.nextInt();
        System.out.print("Masukkan Jumlah Hari Masuk Kerja : ");
        jmlMasuk = input.nextInt();
        System.out.print("Masukkan Jumlah Hari Tidak Masuk Kerja : ");
        JmlTdkMasuk=input.nextInt();

        TotGaji = (jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);

        System.out.println("Gaji yang anda terima adalah " +TotGaji);

    }
}

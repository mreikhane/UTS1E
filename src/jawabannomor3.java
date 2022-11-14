import java.util.Scanner;

public class jawabannomor3 {
    public static void main(String[] args) {
        int i;
        System.out.println("(KAMIR FROM CINDE)");
        System.out.println("--------KFC-------");
        System.out.println("==================");
        System.out.println("BUS 1 Top Level");
        System.out.println("BUS 2 Middle Level");
        System.out.println("BUS 3 Regular Staff");
        System.out.println("BUS 4 Staff");
        System.out.println();
        System.out.println("Masukan No NIK Karyawan");

        Scanner karyawan = new Scanner(System.in);
        i=karyawan.nextInt();

        System.out.println("Anda Ditempatkan Di BUS KEBERAPA ?" + 1);
        System.out.println("Jumlah BUS Top Level "+i);
        System.out.println("Jumlah BUS Middle Level "+i);
        System.out.println("Jumlah BUS Regular Staff "+i);
        System.out.println("Jumlah BUS Staff "+i);


    }
}
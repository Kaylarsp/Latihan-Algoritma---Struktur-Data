import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nPROGRAM MENGHITUNG NILAI AKHIR\n");
        System.out.print("Masukkan nilai tugas    : ");
        int tugas = sc.nextInt();
        System.out.print("Masukkan nilai UTS      : ");
        int uts = sc.nextInt();
        System.out.print("Masukkan nilai UAS      : ");
        int uas = sc.nextInt();

        double nilaiAkhir = (0.2*tugas) + (0.35*uts) + (0.45*uas);
        System.out.println("Nilai akhir             : " + nilaiAkhir);

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            System.out.println("Nilai huruf             : A");
        } else if (nilaiAkhir <= 80 && nilaiAkhir > 73) {
            System.out.println("Nilai huruf             : B+");
        } else if (nilaiAkhir <= 73 && nilaiAkhir > 65) {
            System.out.println("Nilai huruf             : B");
        } else if (nilaiAkhir <= 65 && nilaiAkhir > 60) {
            System.out.println("Nilai huruf             : C+");
        } else if (nilaiAkhir <= 60 && nilaiAkhir > 50) {
            System.out.println("Nilai huruf             : C");
        } else if (nilaiAkhir <= 50 && nilaiAkhir > 39) {
            System.out.println("Nilai huruf             : D");
        } else if (nilaiAkhir <= 39) {
            System.out.println("Nilai huruf             : E");
        }

        System.out.println();
        if (nilaiAkhir > 50 && nilaiAkhir <= 100) {
            System.out.println("SELAMAT ANDA LULUS");
        } else {
            System.out.println("ANDA TIDAK LULUS");
        }
    }
}
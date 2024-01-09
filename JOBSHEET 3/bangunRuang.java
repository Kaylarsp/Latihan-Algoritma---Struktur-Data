import java.util.Scanner;

/**
 * bangunRuang
 */
public class bangunRuang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n1. Kubus \n2. Balok \n3. Prisma Segitiga \n\nMasukkan pilihan anda : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Masukkan banyak kubus : ");
                int n = sc.nextInt();
                Kubus[] kubusArray = new Kubus[n];

                // menerima input
                for (int i = 0; i < n; i++) {
                    System.out.println("\nKubus ke-" + (i+1));
                    System.out.print("Masukkan panjang sisi : ");
                    int sisi = sc.nextInt();
                    kubusArray[i] = new Kubus(sisi); // inisialisasi
                }

                // mengakses array dan menampilkannya
                for (int i = 0; i < n; i++) {
                    System.out.println("\nKubus ke-" + (i+1));
                    System.out.println("Luas permukaan : " + kubusArray[i].luasPermukaanKubus());
                    System.out.println("Volume kubus   : " + kubusArray[i].hitungVolumeKubus());
                }
                break;
            case 2:
                System.out.print("Masukkan banyak balok : ");
                int n1 = sc.nextInt();

            default:
                break;
        }
        
    }
}

class Kubus {
    public int sisi;

    // Konstruktor
    public Kubus(int s){
        sisi = s;
    }

    public int hitungVolumeKubus() {
        return sisi * sisi * sisi;
    }

    public int luasPermukaanKubus() {
        return 6 * (sisi * sisi);
    }
}

class Balok {
    public int panjang;
    public int lebar;
    public int tinggi;

    // Konstruktor
    public Balok(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int hitungVolumeBalok() {
        return panjang * lebar * tinggi;
    }
}
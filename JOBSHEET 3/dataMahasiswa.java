import java.util.Scanner;

public class dataMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMasukkan banyak mahasiswa : ");
        int n = sc.nextInt();
        Mahasiswa[] dataMhs = new Mahasiswa[n];

        for (int i = 0; i < n; i++) {
            dataMhs[i] = new Mahasiswa();
            System.out.println("\nMasukkan data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan Nama          : ");
            dataMhs[i].nama = sc.next();
            System.out.print("Masukkan Nim           : ");
            dataMhs[i].nim = sc.next();
            System.out.print("Masukkan Jenis kelamin : ");
            dataMhs[i].gender = sc.next();
            System.out.print("Masukkan Nilai IPK     : ");
            dataMhs[i].ipk = sc.next();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("\nData mahasiswa ke-" + (i+1));
            System.out.println("Nama          : " + dataMhs[i].nama);
            System.out.println("Nim           : " + dataMhs[i].nim);
            System.out.println("Jenis kelamin : " + dataMhs[i].gender);
            System.out.println("Nilai IPK     : " + dataMhs[i].ipk);
        }
    }
}

class Mahasiswa {
    public String nama;
    public String nim;
    public String gender;
    public String ipk;
}
import java.util.Scanner;

public class Faktorial {
    
    public int nilai;

    // menghitung faktorial dari n dengan cara mengalikan n dengan semua bilangan positif dari 1 hingga n
    public int faktorialBF(int n) {
        int fakto = 1; // dideklarasikan dengan nilai 1 krn faktorial dr 0 adlh 1, dan perkalian akan dimulai dr angka tsb
        for (int i = 1; i <= n; i++) {
            fakto = fakto * i;
        }
        return fakto;
    }
    
    // memecah masalah menjadi masalah" yg lebih kecil, kemudian menyelesaikan masalah" tsb secara rekursif
    public int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }

    // faktorial = n!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();
        Faktorial[] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-" + (i + 1) + " : ");
            fk[i].nilai = sc.nextInt();
        }
        System.out.println("===================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("===================================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialDC(fk[i].nilai));
        }
        System.out.println("===================================================");
    }
}

// Baris 4-11: Algoritma Brute Force
// int fakto = 1;: Deklarasi dan inisialisasi variabel fakto dengan nilai 1.
// Ini karena faktorial dari 0 adalah 1 dan kita memulai perkalian dari angka tersebut.
// for (int i = 1; i <= n; i++): For loop ini berulang dari 1 hingga nilai parameter n.
// fakto = fakto * i;: Di dalam loop, nilai fakto dikalikan dengan nilai iterasi (i) pada setiap putaran.
// Ini secara efektif menambahkan nilai i sebagai faktor ke produk yang terus bertambah.
// return fakto;: Setelah loop selesai, nilai akhir dari fakto yang berisi hasil perkalian semua bilangan positif dari 1 hingga n dikembalikan sebagai faktorial dari n.

// Baris 12-19: Algoritma Divide and Conquer
// if (n == 1): Pemeriksaan dasar. Jika n sama dengan 1, berarti faktorialnya langsung dikembalikan sebagai 1 karena 1! = 1.
// else: Jika n tidak sama dengan 1, lanjut ke perhitungan rekursif.
// int fakto = n * faktorialDC(n-1);: Dilakukan pemanggilan rekursif ke metode faktorialDC() dengan parameter n-1.
// Ini memecah masalah perhitungan faktorial dari n menjadi sub-masalah perhitungan faktorial dari n-1.
// return fakto;: Hasil dari sub-masalah (faktorialDC(n-1)) yang merupakan faktorial dari n-1 dikalikan dengan n sendiri.
// Ini memperhitungkan nilai n yang belum termasuk dan mengembalikan hasil sebagai faktorial dari n.
// Perbedaan Algoritma:

// Brute Force: Lebih sederhana untuk dipahami, tetapi memiliki performa yang kurang efisien untuk nilai n yang besar karena membutuhkan banyak operasi perkalian.
// Divide and Conquer: Lebih efisien untuk nilai n yang besar karena memecah masalah menjadi sub-masalah yang lebih kecil dan mengurangi redundansi dalam perhitungan.
// Namun, implementasinya lebih kompleks dan melibatkan pemanggilan rekursif.
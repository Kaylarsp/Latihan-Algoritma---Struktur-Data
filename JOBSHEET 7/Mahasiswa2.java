import java.util.Scanner;

public class Mahasiswa2 {
    int nim;
    String nama;
    int umur;
    double ipk;

    // konstruktor
    Mahasiswa2(int ni, String n, int u, double i) {
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }

    void tampil() {
        System.out.println("Nim  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("IPK  : " + ipk);
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            PencarianMhs data = new PencarianMhs();
            int jmlMhs = 5;

            System.out.println("--------------------------------------------------------------");
            System.out.println("Masukkan data secara urut dari nim terkecil : ");
            for (int i = 0; i < jmlMhs; i++) {
                System.out.println("---------------------");
                System.out.print("Nim\t: ");
                int nim = s.nextInt();
                System.out.print("Nama\t: ");
                String nama = s.next();
                System.out.print("Umur\t: ");
                int umur = s.nextInt();
                System.out.print("IPK\t: ");
                double ipk = s.nextDouble();

                Mahasiswa2 m = new Mahasiswa2(nim, nama, umur, ipk);
                data.tambah(m);
            }

            System.out.println("---------------------------------------------------------------");
            System.out.println("Data keseluruhan mahasiswa : ");
            data.tampil();

            System.out.println();
            System.out.println("---------------------------------------------------------------");
            System.out.println("---------------------------------------------------------------");
            System.out.println("Pencarian data");
            System.out.println("Masukkan nim mahasiswa yang dicari");
            System.out.print("NIM\t: ");
            int cari = s.nextInt();
            System.out.println("\nMenggunakan sequential search\n");
            int posisi = data.FindSeqSearch(cari);

            data.TampilPosisi(cari, posisi);
            data.TampilData(cari, posisi);
        }
    }
}

class PencarianMhs {
    Mahasiswa2 listMhs[] = new Mahasiswa2[5];
    int idx;

    void tambah(Mahasiswa2 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (Mahasiswa2 m : listMhs) {
            m.tampil();
            System.out.println("---------------------");
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int i = 0; i < listMhs.length; i++) {
            if (listMhs[i].nim == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    void TampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data\t: " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }

    void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Nim\t : " + x);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }
}

import java.util.Scanner;

class ArrayObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Modifikasi kode program agar length array menjadi inputan
        System.out.print("\nMasukkan panjang array : ");
        int n = sc.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[n];
        
        // menerima input
        for (int i = 0; i < n; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("\nPersegi panjang ke-" + i);
            System.out.print("Masukkan panjang : ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar   : ");
            ppArray[i].lebar = sc.nextInt();
        }

        // mengakses isi array ppArray dan menampilkannya
        for (int i = 0; i < n; i++) {
            System.out.println("\nPersegi panjang ke-" + i);
            System.out.println("Panjang : " + ppArray[i].panjang + "\nLebar   : " + ppArray[i].lebar);
        }
    
        // ppArray[0] = new PersegiPanjang();
        // ppArray[0].panjang = 110;
        // ppArray[0].lebar = 30;
    
        // ppArray[1] = new PersegiPanjang();
        // ppArray[1].panjang = 80;
        // ppArray[1].lebar = 40;
    
        // ppArray[2] = new PersegiPanjang();
        // ppArray[2].panjang = 100;
        // ppArray[2].lebar = 20;
    
        // System.out.println();
        // System.out.println("Persegi panjang ke-0, panjang : " + ppArray[0].panjang + ", lebar : " + ppArray[0].lebar);
        // System.out.println("Persegi panjang ke-1, panjang :  " + ppArray[1].panjang + ", lebar : " + ppArray[1].lebar);
        // System.out.println("Persegi panjang ke-2, panjang : " + ppArray[2].panjang + ", lebar : " + ppArray[2].lebar);
    }
}

public class PersegiPanjang {
    public int panjang;
    public int lebar;
}


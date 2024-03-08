import java.util.Scanner;

public class transaksiBarang15 {
    barang15 barang = new barang15(null, null, 0, 0);
    pembelian15 pembelian = new pembelian15();
    Scanner sc = new Scanner(System.in);

    public void beli(barang15[] data) {
        System.out.println("-------------------------------------------");
        System.out.print("Masukkan kode barang : ");
        String kodeBarang = sc.next();
        barang15.checkKode(kodeBarang, data);
        
    }
}
import java.util.Scanner;

public class transaksiBarang15 {
    public transaksiBarang15() {}
    barang15 barang = new barang15(null, null, 0, 0);
    Scanner sc = new Scanner(System.in);

    public void tampilkanPembelian(barang15[] data) {
        barang.checkKode(null, data);
        System.out.println("-------------------------------------------");
        System.out.println("              DAFTAR PEMBELIAN             ");
        System.out.println("-------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s\n", "NAMA" , "KODE" , "STOK" , "HARGA");
        System.out.printf("%-10s %-10s %-10s Rp.%-10s\n", barang.namaBarang, barang.kodeBarang, barang.stok, barang.harga);
    }
}
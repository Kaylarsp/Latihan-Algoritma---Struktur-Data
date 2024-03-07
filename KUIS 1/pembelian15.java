public class pembelian15 {
    barang15 barang = new barang15(null, null, 0, 0);
    transaksiBarang15 transaksi = new transaksiBarang15();

    public static void daftarPembelian() {
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("     DAFTAR PEMBELIAN    ");
        System.out.println("-------------------------");
        System.out.printf("%-10s %-10s %-10d %10d\n", "NAMA" , "KODE" , "STOK" , "HARGA");
        
    }
}

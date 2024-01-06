public class barangMain {
    public static void main(String[] args) {
        barang bl = new barang();
        bl.namaBarang = "Corsair 2 GB";
        bl.jenisBarang = "DDR";
        bl.hargaSatuan = 250000;
        bl.stok = 10;
        bl.tambahStok(1);
        bl.kurangiStok(3);
        bl.tampilBarang();
        int hargaTotal = bl.hitungHargaTotal(4);
        System.out.println("Harga 4 buah : " + hargaTotal);

    }
}

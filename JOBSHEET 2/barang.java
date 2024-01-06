public class barang {
    // ga bisa di run karena ga ada method main nya
    String namaBarang, jenisBarang;
    int stok, hargaSatuan;

    void tampilBarang() {
        System.out.println("Nama barang  : " + namaBarang);
        System.out.println("Jenis barang : " + jenisBarang);
        System.out.println("Stok barang  : " + stok);
        System.out.println("Harga satuan : " + hargaSatuan);
    }

    void tambahStok(int n ) {
        stok = stok + n;
    }

    void kurangiStok(int n) {
        if (stok > 0) {
            stok = stok - n;
        }
    }

    int hitungHargaTotal(int jumlah) {
        return jumlah * hargaSatuan;
    }
}
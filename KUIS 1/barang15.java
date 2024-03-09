public class barang15 {
    String namaBarang, kodeBarang;
    int stok, harga;

    public barang15(String namaBarang, String kodeBarang, int stok, int harga) {
        this.namaBarang = namaBarang;
        this.kodeBarang = kodeBarang;
        this.stok = stok;
        this.harga = harga;
    }

    public void tampilBarang(barang15[] data) {
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("                DAFTAR BARANG              ");
        System.out.println("-------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s\n", "NAMA" , "KODE" , "STOK" , "HARGA");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10s %-10s %-10s Rp. %-10s\n" , data[i].namaBarang, data[i].kodeBarang, data[i].stok, data[i].harga);
        }
    }

    public boolean checkKode(String kodeBarang, barang15[] data) {
        boolean result = false;
        boolean found = false;
        for(int i =0; i<data.length; i++) {
            // ngecek kodeBarang nya bener apa engga
            if(data[i].kodeBarang.equalsIgnoreCase(kodeBarang)){
                result =  true;
                found = true;
                System.out.println("Nama barang : " + data[i].namaBarang);
            }
        }
        if (!found) {
            System.out.println("Kode barang tidak ditemukan");
        }
        return result;
    }
}
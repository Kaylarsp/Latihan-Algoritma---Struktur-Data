public class barangPraktikum {
    String nama;
    int hargaSatuan, jumlah;

    void display() {
        System.out.println();
        System.out.println("Nama         : " + nama);
        System.out.println("Harga satuan : " + hargaSatuan);
        System.out.println("Jumlah       : " + jumlah);
    }
    
    int hitungHargaTotal() {
        return hargaSatuan * jumlah;
    }

    int hitungDiskon() {
        int hargaTotal = hitungHargaTotal();
        int diskon;
        if (hargaTotal > 100000) {
            diskon = (int) (hargaTotal * 0.1);
        } else if (hargaTotal >= 50000 && hargaTotal < 100000) {
            diskon = (int) (hargaTotal * 0.05);
        } else {
            diskon = 0;
        }
        return diskon;
    }

    int hitungHargaBayar() {
        return hitungHargaTotal() - hitungDiskon();
    }
}

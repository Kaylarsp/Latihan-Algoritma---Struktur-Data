public class barangPraktikumMain {
    public static void main(String[] args) {
        barangPraktikum b1 = new barangPraktikum();
        b1.nama = "Corsair 2 GB";
        b1.hargaSatuan = 250000;
        b1.jumlah = 1;
        b1.display();
        int hargaTotal = b1.hitungHargaTotal();
        System.out.println("Harga total  : " + hargaTotal);
        int diskon = b1.hitungDiskon();
        System.out.println("Diskon       : " + diskon);
        int hargaBayar = b1.hitungHargaBayar();
        System.out.println("Harga bayar  : " + hargaBayar);
    }
}

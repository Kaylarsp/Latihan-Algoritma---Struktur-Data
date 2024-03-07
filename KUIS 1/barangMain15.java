import java.util.Scanner;

public class barangMain15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        barang15 barang = new barang15(null, null, 0, 0);

        barang15[] data = new barang15[5];
        data[0] = new barang15("BUKU" , "B01" , 100, 15000);
        data[1] = new barang15("BOLPEN" , "B02" , 100, 4000);
        data[2] = new barang15("PENSIL" , "B03" , 100, 2000);
        data[3] = new barang15("PENSIL" , "B04" , 100, 2000);
        data[4] = new barang15("SPIDOL" , "B05" , 100, 7000);

        while (true) {
            System.out.println("-------------------------------------------");
            System.out.println("                TOKO KAYLA 15              ");
            System.out.println("-------------------------------------------");
            System.out.println("1. Tampilkan barang");
            System.out.println("2. Pembelian");
            System.out.println("3. Tampilkan pembelian");
            System.out.println("4. Exit");
            System.out.println("-------------------------------------------");
            System.out.print("Masukkan pilihan : ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    barang.tampilBarang(data);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                    break;
            
                default:
                    break;
            }
        }
    }
}
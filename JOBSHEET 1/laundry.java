import java.util.Scanner;;

public class laundry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMasukkan nama pelanggan : ");
        String nama = sc.next();
        hitung();
    }

    static void hitung() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan berat laundry  : ");
        int berat = sc.nextInt();

        int perKg = 4500;
        if (berat > 10) {
            double harga = (berat * perKg) - 0.05;
            System.out.println("Total harga             : Rp." + harga);
        } else {
            double harga = berat * perKg;
            System.out.println("Total harga             : Rp." + harga);
        }
    }
}

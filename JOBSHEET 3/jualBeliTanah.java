import java.util.Scanner;

public class jualBeliTanah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nJumlah tanah : ");
        int n = sc.nextInt();
        Tanah[] tanahArray = new Tanah[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nTanah " + (i+1));
            System.out.print("Panjang : ");
            int panjang = sc.nextInt();
            System.out.print("Lebar   : ");
            int lebar = sc.nextInt();
            tanahArray[i] = new Tanah(panjang, lebar);
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println("Luas tanah " + (i+1) + "  : " + tanahArray[i].hitungLuasTanah());
        }

        Tanah tanahTerluas = tanahArray[0];
        int tanahTerluasIndex = 0;
        for (int i = 1; i < n; i++) {
            if (tanahArray[i].hitungLuasTanah() > tanahTerluas.hitungLuasTanah()) {
                tanahTerluas = tanahArray[i];
                tanahTerluasIndex = i;
            }
        }

        System.out.println("\nTanah terluas : Tanah " + (tanahTerluasIndex + 1));
    }
}

class Tanah {
    public int panjang;
    public int lebar;

    public Tanah(int p, int l) {
        panjang = p;
        lebar = l;
    }

    public int hitungLuasTanah() {
        return panjang * lebar;
    }
}
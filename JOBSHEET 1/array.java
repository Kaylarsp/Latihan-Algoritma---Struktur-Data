import java.util.Arrays;

public class array {
    public static void main(String[] args) {

        // Flower species names and their available stock in each RoyalGarden area
        String[][] flowerStocks = {
            {"            ", "Aglonema", "Keladi  ", "Alocasia", "Mawar"},
            {"RoyalGarden1", "   10   ", "   5    ", "   15   ", "  7 "},
            {"RoyalGarden2", "    6   ", "  11    ", "    9   ", " 12 "},
            {"RoyalGarden3", "    2   ", "  10    ", "   10   ", "  5 "},
            {"RoyalGarden4", "    5   ", "   7    ", "   12   ", "  9 "}
        };
        
        System.out.println();
        
        // Print the flower stocks
        // for (tipe_data variabel : array)
        for (String[] flowerStock : flowerStocks) { // access line
            for (String stock : flowerStock) { // access column
                System.out.print(stock + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\nTerdapat pengurangan stok pada RoyalGarden 1, menjadi :\n");

        String[][] royalGarden1 = {
            {"            ", "Aglonema", "Keladi  ", "Alocasia", "Mawar"},
            {"RoyalGarden1", "    9   ", "   3    ", "   15   ", "  2 "},
        };

        for (String[] rg1 : royalGarden1) {
            for (String stocks : rg1) {
                System.out.print(stocks + "\t");
            }
            System.out.println();
        }

        // menghitung total pendapatan royalgarden1
        int aglonema = 75000, keladi = 50000, alocasia = 60000, mawar = 10000;
        double totalPendapatan = (9 * aglonema) + (3 * keladi) + (15 * alocasia) + (2 * mawar);
        System.out.println("\nTotal pendapatan dari RoyalGarden 1 apabila semua bunga terjual habis : Rp." + totalPendapatan);
    }
}
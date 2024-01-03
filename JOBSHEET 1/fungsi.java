public class fungsi {

    //  fungsi untuk menampilkan array stock bunga
    static void stokBunga() {
        String[][] flowerStocks = {
            {"            ", "Aglonema", "Keladi  ", "Alocasia", "Mawar"},
            {"RoyalGarden1", "   10   ", "   5    ", "   15   ", "  7 "},
            {"RoyalGarden2", "    6   ", "  11    ", "    9   ", " 12 "},
            {"RoyalGarden3", "    2   ", "  10    ", "   10   ", "  5 "},
            {"RoyalGarden4", "    5   ", "   7    ", "   12   ", "  9 "}
        };

        System.out.println();

        for (String[] flowerStock : flowerStocks) {
            for (String stock : flowerStock) {
                System.out.print(stock + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        stokBunga();
    }
}

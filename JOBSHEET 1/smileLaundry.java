/**
 * smileLaundry
 */
public class smileLaundry {

    public static void main(String[] args) {
        double totalBill = 0;
        totalBill += calculateBill(4); // Ani
        totalBill += calculateBill(15); // Budi
        totalBill += calculateBill(6); // Bina
        totalBill += calculateBill(11); // Cita
        System.out.println("\nTotal pendapatan smile laundry hari ini : " + totalBill);
    }

    public static double calculateBill(double weight) {
        double bill = weight * 4500;
        if (weight > 10) {
            bill -= bill * 0.05;
        }
        return bill;
    }
}
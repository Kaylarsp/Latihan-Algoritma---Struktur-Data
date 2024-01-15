import java.util.Scanner;
import java.text.DecimalFormat;

public class Sum {
    
    public int elemen;
    public double keuntungan[];
    public double total;

    // konstruktor
    Sum(int elemen) {
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }

    double totalBF(double arr[]) {
        for (int i = 0; i < elemen; i++) {
            total = total + arr[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l+r) / 2;
            double lsum = totalDC(arr, l, mid-1);
            double rsum = totalDC(arr, mid+1, r);
            return lsum + rsum + arr[mid];
        }
        return 0;
    }

    public String formatDouble(double number) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(number);
    }
}

class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================================================");
        System.out.println("Program menghitung keuntungan total (satuan juta. misal 5.9)");
        System.out.print("Masukkan jumlah bulan : ");
        int elm = sc.nextInt();

        Sum sm = new Sum(elm);
        System.out.println("===============================================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Masukkan untung bulan ke-" + (i+1) + " : ");
            sm.keuntungan[i] = sc.nextDouble();
        }

        System.out.println("===============================================================");
        System.out.println("Algoritma Brute Force");
        double formattedBF = Double.parseDouble(sm.formatDouble(sm.totalBF(sm.keuntungan)));
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah : " + formattedBF);
        System.out.println("===============================================================");
        System.out.println("Algoritma Divide and Conquer");
        double formattedDC = Double.parseDouble(sm.formatDouble(sm.totalDC(sm.keuntungan, 0, sm.elemen-1)));
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah : " + formattedDC);
    }
}
import java.util.Scanner;;

public class perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nMasukkan NIM : ");
        String nim = sc.next();
        String[] hari = {"senin ", "selasa ", "rabu ", "kamis ", "jumat ", "sabtu ", "minggu "};
        int n = Integer.parseInt(nim.substring(nim.length() - 2));
        if (n < 10) {
            n += 10;
        }
        
        System.out.println("n : " + n);

        for (int i = 0; i < n; i++) {
            System.out.print(hari[i % 7]);
        }
    }
}

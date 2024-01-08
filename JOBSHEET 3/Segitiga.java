public class Segitiga {
    
    public int alas;
    public int tinggi;

    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public int hitungLuas() {
        return (alas * tinggi) / 2;
    }

    public double hitungKeliling() {
        return 2 * (0.5 * alas * tinggi);
    }
}

class ArraySegitiga {
    public static void main(String[] args) {
        System.out.println();
        Segitiga[] sgArray = new Segitiga[4];
        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);
        sgArray[3] = new Segitiga(25, 10);
    
        for (int i = 0; i < 3; i++) {
            System.out.println("Segitiga ke-" + i + ", Luas : " + sgArray[i].hitungLuas() + ", Keliling : " + sgArray[i].hitungKeliling());
        }
    }
}
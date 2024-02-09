public class Tiket {
    String maskapai, asal, tujuan;
    int harga;

    Tiket(String m, String a, String t, int h) {
        maskapai = m;
        asal = a;
        tujuan = t;
        harga = h;
    }

    void tampilAll() {
        System.out.println("Maskapai : " + maskapai);
        System.out.println("Asal     : " + asal);
        System.out.println("Tujuan   : " + tujuan);
        System.out.println("Harga    : " + harga);
    }
}

class TiketService {
    Tiket tikets[] = new Tiket[5];
    int idx;

    void tambah(Tiket t) {
        if (idx < tikets.length) {
            tikets[idx] = t;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampilAll() {
        for (Tiket t : tikets) {
            t.tampilAll();
            System.out.println("------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < tikets.length - 1; i++) {
            for (int j = 1; j < tikets.length - i; j++) {
                if (tikets[j].harga > tikets[j - 1].harga) {
                    // swap
                    Tiket tmp = tikets[j];
                    tikets[j] = tikets[j -1];
                    tikets[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < tikets.length - 1; i++) {
            int idxMin = i;
            for (int j = i; j < tikets.length; j++) {
                if (tikets[j].harga < tikets[j].harga) {
                    idxMin = j;
                }
            }
            // swap
            Tiket tmp = tikets[idxMin];
            tikets[idxMin] = tikets[i];
            tikets[i] = tmp;
        }
    }
}

class MainTiket {
    public static void main(String[] args) {
        TiketService list = new TiketService();
        Tiket t1 = new Tiket("Garuda", "Surabaya", "Jakarta", 1400000);
        Tiket t2 = new Tiket("Lion Air", "Surabaya", "Jakarta", 895000);
    }
}

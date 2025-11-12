import java.util.Scanner;

public class TugasNilaiMahasiswa20 {
    public static void main(String[] args) {
        Scanner rdn = new Scanner(System.in);

        // Memasukkan banyaknya nilai mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = rdn.nextInt();

        int[] nilai = new int[jumlah];
        int total = 0;
        int tertinggi = Integer.MIN_VALUE;
        int terendah = Integer.MAX_VALUE;

        // Memasukkan setiap nilai mahasiswa
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = rdn.nextInt();
            total += nilai[i];

            if (nilai[i] > tertinggi)
                tertinggi = nilai[i];
            if (nilai[i] < terendah)
                terendah = nilai[i];
        }

        // Menghitung rata-rata
        double rataRata = (double) total / jumlah;

        // Menampilkan semua hasil
        System.out.println("\n— Hasil —");
        System.out.println("Nilai mahasiswa:");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
        System.out.println("Nilai rata-rata : " + rataRata);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);

        rdn.close();
    }
}

import java.util.Scanner;

public class TugasPemesananKafe20 {
    public static void main(String[] args) {
        Scanner rdn = new Scanner(System.in);

        // Input jumlah pesanan
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = rdn.nextInt();
        rdn.nextLine(); 

        String[] namaPesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];
        int totalBiaya = 0;

        // Input nama dan harga tiap pesanan
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Pesanan ke-" + (i + 1));
            System.out.print(" Nama makanan/minuman: ");
            namaPesanan[i] = rdn.nextLine();
            System.out.print("Harga: ");
            hargaPesanan[i] = rdn.nextInt();
            rdn.nextLine(); 
            totalBiaya += hargaPesanan[i];
        }

        // Output daftar pesanan dan total biaya
        System.out.println("\n---- Daftar Pesanan ----");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp" + hargaPesanan[i]);
        }
        System.out.println("Total biaya: Rp" + totalBiaya);

        rdn.close();
    }
}
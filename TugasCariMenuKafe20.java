import java.util.Scanner;

public class TugasCariMenuKafe20 {
    public static void main(String[] args) {
        Scanner rdn = new Scanner(System.in);

        // Daftar menu yang telah ditentukan
        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };

        // Input nama makanan yang ingin dicari
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String cari = rdn.nextLine();

        // Proses pencarian menggunakan linear search
        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                ditemukan = true;
                break;
            }
        }

        // Output hasil pencarian
        System.out.println("\n--- Hasil Pencarian ---");
        if (ditemukan) {
            System.out.println(cari + " tersedia di menu.");
        } else {
            System.out.println(cari + " tidak ditemukan di menu.");
        }

        rdn.close();
    }
}
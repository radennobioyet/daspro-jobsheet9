# JOBSHEET 9

# Percobaan 3


Pertanyaan
1. Modifikasi kode program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) agar program dapat menampilkan banyaknya mahasiswa yang lulus, yaitu mahasiswa yang memiliki lebih besar dari 70 (>70). 



Jawaban 
1. 
```
import java.util.Scanner;

public class ArrayRataNilai20 {
    public static void main(String[] args) {
        Scanner rdn = new Scanner(System.in);

        int []nilaiMhs = new int[10];
        double total =0;
        double rata2;
        int jumlahLulus=0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = rdn.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
            }
        }

        rata2 = total/nilaiMhs.length;
        System.out.println("Rata rata nilai = " + rata2);
        System.out.println("Jumlah Mahasiswa yang lulus: " + jumlahLulus);
    }
}
```

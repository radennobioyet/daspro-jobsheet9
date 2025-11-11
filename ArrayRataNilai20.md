# JOBSHEET 9

# Percobaan 3


Pertanyaan
1. Modifikasi kode program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) agar program dapat menampilkan banyaknya mahasiswa yang lulus, yaitu mahasiswa yang memiliki lebih besar dari 70 (>70). 
2. Modifikasi program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java) sehingga program menerima jumlah elemen berdasarkan input dari pengguna dan mengeluarkan output seperti berikut ini: 
```
Masukkan jumlah mahasiswa : 5

Masukkan nilai mahasiswa ke-1: 80

Masukkan nilai mahasiswa ke-2: 60

Masukkan nilai mahasiswa ke-3: 90

Masukkan nilai mahasiswa ke-4: 85

Masukkan nilai mahasiswa ke-5: 65

Rata-rata nilai lulus = 85.0

Rata-rata nilai tidak lulus = 62.5
```



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
2. 
```
import java.util.Scanner;

public class ArrayRataNilai20 {
    public static void main(String[] args) {
        Scanner rdn = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = rdn.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        double totalLulus = 0, totaltidakLulus = 0;
        double jumlahLulus = 0, jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = rdn.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totaltidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }
        double rataLulus = (jumlahLulus > 0) ? totalLulus / jumlahLulus : 0;
        double rataTidakLulus = (jumlahTidakLulus > 0) ? totaltidakLulus / jumlahTidakLulus : 0;
        
        System.out.println("Rata Rata Nilai Mahasiswa Lulus : " + rataLulus);
        System.out.println("Rata Rata Nilai Mahasiswa Tidak Lulus : " + rataTidakLulus);
    }
}
```
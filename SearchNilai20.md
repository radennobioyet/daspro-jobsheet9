# JOBSHEET 9

# Percobaan 4


Pertanyaan
1. Jelaskan maksud dari statement break; pada baris ke-10 kode program percobaan 4 di atas.
2. Modifikasi kode program pada percobaan 4 di atas sehingga program dapat menerima input berupa banyaknya elemen array nilai, isi array, dan sebuah nilai (key) yang ingin dicari. Lalu cetak ke layar indeks posisi elemen dari nilai (key) yang dicari. Contoh hasil program: 
```
Masukkan 'banyaknya nilai yang akan diinput: 6

Masukkan nilai mahasiswa ke-1: 80

Masukkan nilai mahasiswa ke-2: 90

Masukkan nilai mahasiswa ke-3: 75

Masukkan nilai mahasiswa ke-4: 83

Masukkan nilai mahasiswa ke-5: 78

Masukkan nilai mahasiswa ke-6: 92

Masukkan nilai yang ingin dicari: 78

Nilai 78 ketemu, merupakan nilai mahasiswa ke-5
```
3. Modifikasi program pada percobaan 4 di atas, sehingga program akan memberikan pesan "Nilai yang dicari tidak ditemukan" jika nilai yang dicari (key) tidak ada di dalam array. Contoh tampilan program sebagai berikut: 
```
Masukkan banyaknya nilai yang akan diinput: 6

Masukkan nilai mahasiswa ke-1: 80

Masukkan nilai mahasiswa ke-2: 90

Masukkan nilai mahasiswa ke-3: 75

Masukkan nilai mahasiswa ke-4: 82

Masukkan nilai mahasiswa ke-5: 95

Masukkan nilai mahasiswa ke-6: 70

Masukkan nilai yang ingin dicari: 85

Nilai yang dicari tidak ditemukan
```



Jawaban 
1. Maksud dari break; pada baris ke-10 adalah untuk menghentikan perulangan for secara langsung setelah menemukan nilai yang dicari (key).
2. 
```

import java.util.Scanner;

public class SearchNilai20 {
    public static void main(String[] args) {
        Scanner rdn = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlah = rdn.nextInt();

        int[] nilaiMhs = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = rdn.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = rdn.nextInt();

        int posisi = -1;
        for (int i = 0; i < jumlah; i++) {
            if (nilaiMhs[i] == key) {
                posisi = i + 1;
                break;
            }
        }

        System.out.println();
        if (posisi != 0) {
            System.out.println("Nilai " + key + "Ketemu merupakan nilai mahasiswa ke-" + posisi);
        }
        System.out.println();
    }
}
```
3. 
```
import java.util.Scanner;

public class SearchNilai20 {
    public static void main(String[] args) {
        Scanner rdn = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlah = rdn.nextInt();

        int[] nilaiMhs = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = rdn.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = rdn.nextInt();

        int posisi = -1;
        for (int i = 0; i < jumlah; i++) {
            if (nilaiMhs[i] == key) {
                posisi = i + 1;
                break;
            }
        }

        System.out.println();
        if (posisi != -1) {
            System.out.println("Nilai " + key + " Ketemu merupakan nilai mahasiswa ke-" + posisi);
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan");
        }
        System.out.println();
        
    }
}
```
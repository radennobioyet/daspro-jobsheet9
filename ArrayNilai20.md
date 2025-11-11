# JOBSHEET 9

# Percobaan 2

Pertanyaan
1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini: 
```
for (int i = 0; i < nilaiAkhir.length; i++) {
    System.out.print("Masukkan nilai akhir ke-" + i + " : ");
    nilaiAkhir[i] = rdn.nextInt();
}
``` 
Jalankan program. Apakah terjadi perubahan? Mengapa demikian? 

2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length ?  
3. Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai > 70): 
```
for (int i = 0; i < nilaiAkhir.length; i++) {
    if (nilaiAkhir[i] > 70) {
        System.out.println("Mahasiswa ke-" +i + " lulus!");
    } 
}
```
Jalankan program dan jelaskan alur program! 

4. Modifikasi program agar menampilkan status kelulusan semua mahasiswa berdasarkan nilai, yaitu dengan menampilkan status mana mahasiswa yang lulus dan tidak lulus, seperti ilustrasi output berikut: 


jawaban
1. Tidak terjadi perubahan karena nilaiAkhir.length itu menghitung panjang array. karena panjang array-nya sama dengan 9, dan program sebelumnya juga i < 10
2. Jika i lebih kecil dari panjang array, yang dimana panjang array adalah 9. 
3. a. Program membuat objek Scanner untuk membaca input dari keyboard.
b. Membuat array nilaiAkhir berisi 10 elemen untuk menyimpan nilai mahasiswa.
c. Melalui perulangan for, program meminta pengguna memasukkan nilai akhir setiap mahasiswa.
d. Setelah semua nilai dimasukkan, program memeriksa setiap nilai dengan perulangan kedua.
e. Jika nilai mahasiswa lebih dari 70, program menampilkan pesan "Mahasiswa ke-i lulus!".
f. Program hanya menampilkan mahasiswa yang lulus saja, lalu selesai.
4. ```
import java.util.Scanner;

public class ArrayNilai20 {
    public static void main(String[] args) {
        Scanner rdn = new Scanner(System.in);

        int[]nilaiAkhir = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            nilaiAkhir[i] = rdn.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " lulus!");
            } else {
                System.out.println("Mahasiswa ke-" + i + " tidak lulus!");
            }
        }
    }
}
```
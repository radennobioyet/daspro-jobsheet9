# JOBSHEET 9

# Percobaan 1

Pertanyaan
1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?
2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus pada saat deklarasi array.
3. Ubah statement pada langkah No 4 menjadi seperti berikut 
```
 for (int i = 0; i < 4; i++) {
     System.out.println(bil[i]);
 }
```
Apa keluaran dari program? Jelaskan maksud dari statement tersebut.


Jawaban
1. Jika array bertipe int, nilai seperti 5.0 dan 7.5 menyebabkan error karena bukan bilangan bulat.
2. ```
   public class ArrayBilangan20{
       public static void main(String[] args) {
           int[] bil = {5, 13, -7, 17};

           System.out.println(bil[0]);
           System.out.println(bil[1]);
           System.out.println(bil[2]);
           System.out.println(bil[3]);
       }
   }
   ```
   3. Program akan tetap menampilkan output yang sama dengan program sebelumnya Karena for hanya menggantikan penulisan manual dengan pengulangan otomatis. Nilai array tidak berubah, hanya cara mencetaknya yang lebih efisien. 
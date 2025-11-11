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


jawaban
1. Tidak terjadi perubahan karena nilaiAkhir.length itu menghitung panjang array. karena panjang array-nya sama dengan 9, dan program sebelumnya juga i < 10
2. Jika i lebih kecil dari panjang array, yang dimana panjang array adalah 9. 
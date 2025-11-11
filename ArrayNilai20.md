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


jawaban
1. Tidak terjadi perubahan karena nilaiAkhir.length itu menghitung panjang array. karena panjang array-nya sama dengan 9, dan program sebelumnya juga i < 10
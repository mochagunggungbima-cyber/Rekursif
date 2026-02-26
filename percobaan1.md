Jawaban Pertanyaan Percobaan 1

Apa yang dimaksud dengan fungsi rekursif? Fungsi rekursif adalah fungsi yang memanggil dirinya sendiri dalam proses eksekusinya. Fungsi rekursif memiliki dua komponen penting:
Base case (kasus dasar): Kondisi yang menghentikan pemanggilan rekursif, mencegah terjadinya infinite loop Recursive call (pemanggilan rekursif): Bagian di mana fungsi memanggil dirinya sendiri dengan parameter yang berbeda (biasanya lebih kecil/sederhana)

Fungsi rekursif bekerja dengan memecah masalah besar menjadi masalah yang lebih kecil hingga mencapai kasus dasar yang dapat diselesaikan secara langsung. 2. Apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program! Ya, hasil yang diberikan kedua fungsi adalah sama, keduanya menghasilkan nilai faktorial yang benar (misalnya 5! = 120). Perbedaan alur jalannya program: Fungsi Rekursif:

Bekerja dengan memanggil dirinya sendiri berulang kali Memiliki fase ekspansi (pemanggilan berlapis) dan fase substitusi (pengembalian nilai) Setiap pemanggilan disimpan dalam call stack memori Contoh: 5 * faktorialRekursif(4) → 4 * faktorialRekursif(3) → dst hingga mencapai base case, lalu nilai dikembalikan dari bawah ke atas Lebih elegant dan mudah dipahami untuk masalah yang bersifat rekursif Menggunakan lebih banyak memori karena call stack

Fungsi Iteratif:

Menggunakan perulangan (loop) seperti for atau while Bekerja secara sequential/berurutan dari awal hingga akhir Tidak ada pemanggilan fungsi berlapis, hanya satu alur eksekusi Menggunakan variabel untuk menyimpan hasil sementara yang terus diperbarui Lebih efisien dalam penggunaan memori Contoh: hasil = 1; for(i=1; i<=5; i++) hasil *= i;
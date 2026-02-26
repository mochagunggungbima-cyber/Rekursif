Jawaban Pertanyaan Percobaan 3

Sebutkan blok kode program manakah yang merupakan "base case" dan "recursion call"! Pada fungsi hitungLaba(): Base Case: javaif (tahun == 0) { return saldo; }
Ini adalah kondisi penghentian rekursif Ketika tahun mencapai 0, fungsi berhenti memanggil dirinya sendiri dan mengembalikan nilai saldo

Recursion Call: javaelse { return 1.11 * hitungLaba(saldo, tahun - 1); }

Ini adalah pemanggilan fungsi ke dirinya sendiri
Parameter tahun dikurangi 1 setiap pemanggilan
Fungsi memanggil hitungLaba() dengan tahun yang lebih kecil hingga mencapai base case
Jabarkan trace fase ekspansi dan fase substitusi algoritma perhitungan laba jika diberikan nilai hitungLaba(100000, 3)
FASE EKSPANSI (Pemanggilan fungsi berlapis):

hitungLaba(100000, 3)
├─> 1.11 * hitungLaba(100000, 2)
    ├─> 1.11 * hitungLaba(100000, 1)
        ├─> 1.11 * hitungLaba(100000, 0)
            └─> return 100000  [BASE CASE tercapai]
Penjelasan Fase Ekspansi:

Level 1: hitungLaba(100000, 3) → tahun = 3, belum base case
Level 2: hitungLaba(100000, 2) → tahun = 2, belum base case
Level 3: hitungLaba(100000, 1) → tahun = 1, belum base case
Level 4: hitungLaba(100000, 0) → tahun = 0, BASE CASE → return 100000
FASE SUBSTITUSI (Pengembalian nilai dari bawah ke atas):

Level 4: hitungLaba(100000, 0) = 100000

Level 3: hitungLaba(100000, 1) = 1.11 * 100000
                                = 111000

Level 2: hitungLaba(100000, 2) = 1.11 * 111000
                                = 123210

Level 1: hitungLaba(100000, 3) = 1.11 * 123210
                                = 136763.1
Penjelasan Fase Substitusi:

Tahun ke-0: Saldo = 100000 (base case)
Tahun ke-1: Saldo = 100000 × 1.11 = 111000
Tahun ke-2: Saldo = 111000 × 1.11 = 123210
Tahun ke-3: Saldo = 123210 × 1.11 = 136763.1
Hasil Akhir: Rp 136.763,10
Jawaban Pertanyaan Percobaan 2

Jelaskan sampai kapan proses pemanggilan fungsi hitungPangkat() akan dijalankan! Proses pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) akan terus dijalankan sampai pangkat mencapai nilai 0 (base case). Penjelasan alur:
Setiap kali fungsi dipanggil, nilai pangkat dikurangi 1 Pemanggilan rekursif: bilangan * hitungPangkat(bilangan, pangkat - 1) Ketika pangkat == 0, fungsi mengembalikan nilai 1 (base case) dan proses rekursif berhenti Setelah mencapai base case, nilai dikembalikan secara bertahap dari bawah ke atas 2. Done
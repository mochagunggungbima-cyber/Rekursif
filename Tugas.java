import java.util.Scanner;

public class Tugas {
    
    static int hitungTotalRekursif(int n) {
        if (n == 1) {
            // Base case: jika n = 1, kembalikan 1
            return 1;
        } else {
            // Recursive call: n + hitungTotal(n-1)
            return n + hitungTotalRekursif(n - 1);
        }
    }
    
    static int hitungTotalIteratif(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }
    
    static void cetakDeret(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i < n) {
                System.out.print(" + ");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        System.out.println("===========================================");
        System.out.println("Program Menghitung Total Nilai 1 + 2 + ... + N");
        System.out.println("===========================================");
        
        System.out.print("\nMasukkan nilai N: ");
        n = sc.nextInt();
        
        System.out.println("\n--- Menggunakan Fungsi REKURSIF ---");
        System.out.print("Deret bilangan: ");
        cetakDeret(n);
        int hasilRekursif = hitungTotalRekursif(n);
        System.out.println(" = " + hasilRekursif);
        
        System.out.println("\n--- Menggunakan Fungsi ITERATIF ---");
        System.out.print("Deret bilangan: ");
        cetakDeret(n);
        int hasilIteratif = hitungTotalIteratif(n);
        System.out.println(" = " + hasilIteratif);
        
        System.out.println("\n===========================================");
        if (hasilRekursif == hasilIteratif) {
            System.out.println("✓ Hasil Rekursif dan Iteratif SAMA");
        } else {
            System.out.println("✗ Hasil Rekursif dan Iteratif BERBEDA");
        }
        System.out.println("===========================================");
        
        sc.close();
    }
}
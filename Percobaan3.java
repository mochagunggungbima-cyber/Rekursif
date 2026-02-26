import java.util.Scanner;

public class Percobaan3 {
    
    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return saldo;
        } else {
            return 1.11 * hitungLaba(saldo, tahun - 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double saldoAwal;
        int tahun;
        
        System.out.print("Masukkan jumlah saldo awal: ");
        saldoAwal = sc.nextDouble();
        System.out.print("Masukkan lamanya investasi (tahun): ");
        tahun = sc.nextInt();
        
        double totalSaldo = hitungLaba(saldoAwal, tahun);
        
        System.out.println("\nJumlah uang setelah " + tahun + " tahun: " + totalSaldo);
        
        sc.close();
    }
}
import java.util.Scanner;

public class Percobaan2 {
    
    static int hitungPangkat(int bilangan, int pangkat) {
        if (pangkat == 0) {
            return 1;
        } else {
            return bilangan * hitungPangkat(bilangan, pangkat - 1);
        }
    }
    
    static void cetakDeret(int bilangan, int pangkat) {
        if (pangkat == 0) {
            System.out.print("1");
        } else {
            System.out.print(bilangan);
            if (pangkat > 1) {
                System.out.print("x");
                cetakDeret(bilangan, pangkat - 1);
            } else {
                System.out.print("x1");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int bilangan, pangkat;
        
        System.out.print("Masukkan bilangan: ");
        bilangan = sc.nextInt();
        System.out.print("Masukkan pangkat: ");
        pangkat = sc.nextInt();
        
        cetakDeret(bilangan, pangkat);
        System.out.print(" = " + hitungPangkat(bilangan, pangkat));
        
        sc.close();
    }
}
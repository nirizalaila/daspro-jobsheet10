import java.util.Scanner;
public class ModifBioskopWithScanner {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int baris, kolom, pilihan;
    String nama, next;
    String [][] penonton = new String[4][2];
    
    while (true) {
        System.out.println("Menu: ");
        System.out.println("1. Input data penonton");
        System.out.println("2. Tampilkan daftar penonton");
        System.out.println("3. Exit");
        System.out.print("Pilih menu (1/2/3): ");
        pilihan = sc.nextInt();
        sc.nextLine();

        switch (pilihan) {
            case 1:
                while (true) {
                    System.out.println("INPUT DATA PENONTON");
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    penonton [baris-1][kolom-1] = nama;
                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();

                    if (next.equals("n")) {
                        break;
                    }
                }
                break;
            case 2:
                System.out.println("***********************************************");
                System.out.println("DAFTAR PENONTON");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[0].length; j++) {
                    if (penonton[i][j] !=null) {
                        System.out.println("Baris " + (i+1) + ", Kolom " + (j+1) + ": " + penonton[i][j]);
                    }
                    }
                }
                break;
            case 3:
                System.out.println("***********************************************");
                System.out.println("Terima kasih");
                return;
            default:
                System.out.println("***********************************************");
                System.out.println("Menu yang anda pilih tidak valid");
        }
        System.out.println("***********************************************");
        System.out.print("Kembali ke menu? (y/n): ");
        next = sc.nextLine();

        if (next.equalsIgnoreCase("n")) {
            break;
        }
    }
    }
}

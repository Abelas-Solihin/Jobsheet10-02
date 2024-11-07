import java.util.Scanner;

public class BioskopWithScanner02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, next;
        int baris, kolom;
        int pilihan;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            if (pilihan == 1) {
                System.out.println("Masukkan nama : ");
                nama = sc.nextLine();
                System.out.println("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.println("Masukkan kolom : ");
                kolom = sc.nextInt();
                sc.nextLine();
                if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data penonton berhasil dimasukkan.");
                } else {
                    System.out.println("Baris atau kolom tidak valid.");
                }
            } else if (pilihan == 2) {
                System.out.println("Daftar penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] != null) {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                        }
                    }
               }
            } else if (pilihan == 3) {
                System.out.println("Terima kasih! proses selesai.");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}

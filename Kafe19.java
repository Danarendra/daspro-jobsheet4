import java.util.Scanner;
public class Kafe19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;
        System.out.println("masukkan menu: ");
        menu = sc.nextLine();
        System.out.println("masukkan ukuran cup: ");
        ukuranCup = sc.next().charAt(0);
        System.out.println("masukkan keanggotaan: ");
        keanggotaan = sc.nextBoolean();
    
        double hargaMenu = 0;
        switch (menu.toLowerCase()) {
            case "kopi":
            hargaMenu = 12000;
            break;
            case "teh":
            hargaMenu = 12000;
            break;
            case "coklat":
            hargaMenu = 20000;
            break;
        
        
          double totalHarga = hargaMenu * jumlah; 
            switch (ukuranCup) {
            case "S":
            break;
            case "M":
           totalHarga += 0.25 * totalHarga;
            break;
            case "L":
            totalHarga += 0.4 * totalHarga;
          break;
        
            }
        double diskon = keanggotaan ? 0.1 : 0;
        double nominalBayar = totalHarga - (diskon * totalHarga);
        System.out.println("item pembelian: " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
        System.out.println("Nominal bayar: " + nominalBayar);
        } 
    } 
    
    }

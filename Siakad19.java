import java.util.Scanner;
public class Siakad19 {
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        String kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
        System.out.println("Masukkan Nama: ");
        nama = sc.nextLine();
        System.out.println("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.println("Masukkan Kelas: "); 
        kelas = sc.nextLine();
        System.out.println("Masukkan Nomor Absen: ");
        absen = sc.nextByte();
        System.out.println("Masukkan Nilai Kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.println("Masukkan Nilai Tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.println("Masukkan Nilai Ujian: ");
        nilaiUjian = sc.nextDouble();
        
        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        String klasifikasi;
        String penilaian;

         if (nilaiAkhir >= 80) {
            klasifikasi = "A";
            penilaian = "Sangat Baik";
        
        } else if (nilaiAkhir >= 73) {
            klasifikasi = "B+";
            penilaian = "Lebih Dari Baik";
        } else if (nilaiAkhir >= 65) {
            klasifikasi = "B";
            penilaian = "Baik";
        } else if (nilaiAkhir >= 60) {
            klasifikasi = "C+";
            penilaian = "Lebih dari cukup";
        } else if (nilaiAkhir >= 50) {
            klasifikasi = "C";
            penilaian = "Cukup";
        } else if (nilaiAkhir >= 39) {
            klasifikasi = "D";
            penilaian = "Kurang";
        } else if (nilaiAkhir < 39) {
            klasifikasi = "E";
            penilaian = "Gagal";
        }
        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ") kelas " + kelas + " nomor absen " + absen);
        System.out.printf("Nilai akhir %.2\n", nilaiAkhir);
        System.out.println("Klasifikasi: " + klasifikasi);
        System.out.println("Penilaian akhir: " + penilaian);
    }


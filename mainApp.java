package Latihan;

import java.util.Scanner;

public class mainApp {
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        Siswa Siswa=new Siswa(1231,"junaidi","Laki-laki");
        Siswa.cetak_siswa();
        System.out.println("========== input data Matapelajaran : ==========");
        nilai nilai=new nilai();
        System.out.println("Kode Matapelajaran = ");
        nilai.kdmt= obj.nextLine();
        System.out.println("Nama Pelajaran = ");
        nilai.kdmt=obj.nextLine();
        System.out.println("========= Data Matapelajaran ==========");
        nilai.cetakmt();
        System.out.println("========== Data Nilai ============");
        System.out.println("jumlah kehadiran = ");
        nilai.nilai_absen=obj.nextInt();
        System.out.println("Nilai Tugas = ");
        nilai.nilai_tugas=obj.nextInt();
        System.out.println("Nilai UTS = ");
        nilai.nilai_uts=obj.nextInt();
        System.out.println("Nilai UAS = ");
        nilai.nilai_uas=obj.nextInt();
        nilai.addnnlai();
        System.out.println("=========== Status NIlai ============");
        nilai.getRata_rata();
        nilai.cetak_nilai();
        System.out.println("==================");
        nilai.cetak_status();

    }
}

package Latihan;

public class Siswa {

    int nis;

    String nama;

    String jkl;

    String alamat;

    public Siswa(){
    }

    public Siswa(int nis, String nama, String jkl){
        this.nis = nis;
        this.nama = nama;
        this.jkl = jkl;
    }

    public Siswa(int nis, String nama, String jkl, String alamat){
        this.nis = nis;
        this.nama = nama;
        this.jkl = jkl;
        this.alamat = alamat;
    }
    public void cetak_siswa(){
        System.out.println("Nis = "+ nis + "\n"+ "Nama = "+nama + "\n"+ "jkl = "+jkl +"\n");
    }
}


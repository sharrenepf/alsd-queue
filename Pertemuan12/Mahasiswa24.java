package Pertemuan12;
public class Mahasiswa24 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa24() {}

    public Mahasiswa24(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.printf("%-15s %-13s %-9s %.2f\n", nama, nim, kelas, ipk);
    }
}

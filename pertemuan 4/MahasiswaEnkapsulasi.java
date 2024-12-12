public class MahasiswaEnkapsulasi {

    private String nim;
    private String nama;
    private String alamat;
    private double ipk;

    public MahasiswaEnkapsulasi() {
    }

    public MahasiswaEnkapsulasi(String nim) {
        this.nim = nim;
    }

    public MahasiswaEnkapsulasi(String nimBaru, String namaBaru, String alamatBaru, double ipkBaru) {
        this.nim = nimBaru;
        this.nama = namaBaru;
        this.alamat = alamatBaru;
        this.ipk = ipkBaru;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return this.nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public double getIpk() {
        return this.ipk;
    }

    public String predikat(double ipk) {
        if (ipk >= 2.0 && ipk <= 2.75) {
            return "Memuaskan";
        } else if (ipk >= 2.76 && ipk <= 3.5) {
            return "Sangat Memuaskan";
        } else if (ipk >= 3.51 && ipk <= 4.0) {
            return "Dengan Pujian";
        } else {
            return "-";
        }
    }

    public void cetak() {
        System.out.println("Nama = " + getNama());
        System.out.println("Alamat = " + getAlamat());
        System.out.println("NIM = " + getNim());
        System.out.println("IPK = " + getIpk());
        System.out.println("Predikat = " + predikat(getIpk()));
    }

    public static void main(String[] args) {
        MahasiswaEnkapsulasi mahasiswa1 = new MahasiswaEnkapsulasi("1", "Dilan", "Bandung", 3.51);
        mahasiswa1.cetak();

      
        MahasiswaEnkapsulasi mahasiswa2 = new MahasiswaEnkapsulasi();
        mahasiswa2.setNim("2");
        mahasiswa2.setNama("liftypavita");
        mahasiswa2.setAlamat("BandarLampung");
        mahasiswa2.setIpk(4.0);
        mahasiswa2.cetak();
    }
}

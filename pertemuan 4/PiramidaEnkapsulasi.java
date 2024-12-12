public class PiramidaEnkapsulasi {

    private double tinggi;
    private double panjangAlas;
    private double lebarAlas;

    private final double SEPERTIGA = 1.0 / 3.0;

    private static int jumlahPiramida = 0;

    public PiramidaEnkapsulasi() {
        this.tinggi = 0;
        this.panjangAlas = 0;
        this.lebarAlas = 0;
        jumlahPiramida++;
    }

    public PiramidaEnkapsulasi(double tinggi, double panjangAlas, double lebarAlas) {
        this.tinggi = tinggi;
        this.panjangAlas = panjangAlas;
        this.lebarAlas = lebarAlas;
        jumlahPiramida++;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return this.tinggi;
    }

    public void setPanjangAlas(double panjangAlas) {
        this.panjangAlas = panjangAlas;
    }

    public double getPanjangAlas() {
        return this.panjangAlas;
    }

    public void setLebarAlas(double lebarAlas) {
        this.lebarAlas = lebarAlas;
    }

    public double getLebarAlas() {
        return this.lebarAlas;
    }

    public double getVolume() {
        return SEPERTIGA * panjangAlas * lebarAlas * tinggi;
    }

    public double getLuasPermukaan() {
        double luasAlas = panjangAlas * lebarAlas;

        double tinggiSisiMiring = Math.sqrt(Math.pow(tinggi, 2) + Math.pow(panjangAlas / 2, 2));
        double luasSisi1 = (panjangAlas * tinggiSisiMiring) / 2;

        tinggiSisiMiring = Math.sqrt(Math.pow(tinggi, 2) + Math.pow(lebarAlas / 2, 2));
        double luasSisi2 = (lebarAlas * tinggiSisiMiring) / 2;

        return luasAlas + 2 * luasSisi1 + 2 * luasSisi2;
    }

    public static int getJumlahPiramida() {
        return jumlahPiramida;
    }

    public static void main(String[] args) {
      
        PiramidaEnkapsulasi piramida1 = new PiramidaEnkapsulasi();
        System.out.println("Piramida 1 - Tinggi: " + piramida1.getTinggi());
        System.out.println("Piramida 1 - Volume: " + piramida1.getVolume());
        System.out.println("Piramida 1 - Luas Permukaan: " + piramida1.getLuasPermukaan());

        PiramidaEnkapsulasi piramida2 = new PiramidaEnkapsulasi(10, 6, 8);
        System.out.println("Piramida 2 - Tinggi: " + piramida2.getTinggi());
        System.out.println("Piramida 2 - Panjang Alas: " + piramida2.getPanjangAlas());
        System.out.println("Piramida 2 - Lebar Alas: " + piramida2.getLebarAlas());
        System.out.println("Piramida 2 - Volume: " + piramida2.getVolume());
        System.out.println("Piramida 2 - Luas Permukaan: " + piramida2.getLuasPermukaan());

        System.out.println("\nJumlah Piramida yang dibuat: " + PiramidaEnkapsulasi.getJumlahPiramida());
    }
}

public class LingkaranEnkapsulasi {

    private double jariJari;
    private final double PHI = 3.14;
    private static int jumlahLingkaran = 0;

    public LingkaranEnkapsulasi() {
        this.jariJari = 0;
        jumlahLingkaran++;
    }

    public LingkaranEnkapsulasi(double jariJariBaru) {
        this.jariJari = jariJariBaru;
        jumlahLingkaran++;
    }

    public void setJariJari(double jariJariBaru) {
        this.jariJari = jariJariBaru;
    }

    public double getJariJari() {
        return this.jariJari;
    }

    public double getLuas() {
        return PHI * Math.pow(this.jariJari, 2);
    }

    public double getKeliling() {
        return 2 * PHI * this.jariJari;
    }

    public static int getJumlahLingkaran() {
        return jumlahLingkaran;
    }

    public static void main(String[] args) {
    
        LingkaranEnkapsulasi lingkaran1 = new LingkaranEnkapsulasi();
        System.out.println("Lingkaran 1 - Jari-jari: " + lingkaran1.getJariJari());
        System.out.println("Lingkaran 1 - Luas: 7" + lingkaran1.getLuas());
        System.out.println("Lingkaran 1 - Keliling: " + lingkaran1.getKeliling());

        LingkaranEnkapsulasi lingkaran2 = new LingkaranEnkapsulasi(5);
        System.out.println("Lingkaran 2 - Jari-jari: " + lingkaran2.getJariJari());
        System.out.println("Lingkaran 2 - Luas: " + lingkaran2.getLuas());
        System.out.println("Lingkaran 2 - Keliling: " + lingkaran2.getKeliling());


        System.out.println("Jumlah Lingkaran yang dibuat: " + LingkaranEnkapsulasi.getJumlahLingkaran());
    }
}


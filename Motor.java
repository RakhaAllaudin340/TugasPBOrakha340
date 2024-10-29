public class Motor extends Kendaraan {
    private boolean jenisSport;

    public Motor(String platNomor, String merk, boolean jenisSport) {
        super(platNomor, merk);
        this.jenisSport = jenisSport;
    }

    @Override
    public void infoKendaraan() {
        System.out.println("Motor - Plat Nomor: " + getPlatNomor() + ", Merk: " + getMerk() + ", Jenis Sport: " + (jenisSport ? "Ya" : "Tidak"));
    }
}

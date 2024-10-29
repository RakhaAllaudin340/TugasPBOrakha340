public abstract class Kendaraan {
    private String platNomor;
    private String merk;

    public Kendaraan(String platNomor, String merk) {
        this.platNomor = platNomor;
        this.merk = merk;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public String getMerk() {
        return merk;
    }

    public abstract void infoKendaraan();
}

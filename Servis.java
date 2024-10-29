public abstract class Servis {
    protected String deskripsi;
    protected double biaya;

    public Servis(String deskripsi, double biaya) {
        this.deskripsi = deskripsi;
        this.biaya = biaya;
    }

    public abstract void detailServis();
}

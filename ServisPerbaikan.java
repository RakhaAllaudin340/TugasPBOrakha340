public class ServisPerbaikan extends Servis {
    public ServisPerbaikan(String deskripsi, double biaya) {
        super(deskripsi, biaya);
    }

    @Override
    public void detailServis() {
        System.out.println("Servis Perbaikan: " + deskripsi + ", Biaya: " + biaya);
    }
}

public class ServisPenggantianOli extends Servis {
    public ServisPenggantianOli(String deskripsi, double biaya) {
        super(deskripsi, biaya);
    }

    @Override
    public void detailServis() {
        System.out.println("Servis Penggantian Oli: " + deskripsi + ", Biaya: " + biaya);
    }
}

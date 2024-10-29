public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String platNomor, String merk, int jumlahPintu) {
        super(platNomor, merk);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void infoKendaraan() {
        System.out.println("Mobil - Plat Nomor: " + getPlatNomor() + ", Merk: " + getMerk() + ", Jumlah Pintu: " + jumlahPintu);
    }
}


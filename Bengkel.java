import java.util.ArrayList;
import java.util.List;

public class Bengkel {
    private List<Kendaraan> kendaraanList;
    private List<Pelanggan> pelangganList;

    public Bengkel() {
        kendaraanList = new ArrayList<>();
        pelangganList = new ArrayList<>();
    }

    public void tambahKendaraan(Kendaraan kendaraan) {
        kendaraanList.add(kendaraan);
    }

    public void tambahPelanggan(Pelanggan pelanggan) {
        pelangganList.add(pelanggan);
    }

    public void tampilkanKendaraan() {
        for (Kendaraan k : kendaraanList) {
            k.infoKendaraan();
        }
    }

    public static void main(String[] args) {
        Bengkel bengkel = new Bengkel();
        Pelanggan pelanggan1 = new Pelanggan("John Doe", "08123456789");
        bengkel.tambahPelanggan(pelanggan1);

        Mobil mobil1 = new Mobil("B 1234 CD", "Toyota", 4);
        Motor motor1 = new Motor("B 5678 EF", "Yamaha", true);
        bengkel.tambahKendaraan(mobil1);
        bengkel.tambahKendaraan(motor1);

        RiwayatServis riwayat = new RiwayatServis();
        riwayat.tambahServis(new ServisPerbaikan("Perbaikan Rem", 200000));
        riwayat.tambahServis(new ServisPenggantianOli("Penggantian Oli Mesin", 150000));

        System.out.println("Data Kendaraan:");
        bengkel.tampilkanKendaraan();

        System.out.println("\nRiwayat Servis:");
        riwayat.tampilkanRiwayat();
    }
}

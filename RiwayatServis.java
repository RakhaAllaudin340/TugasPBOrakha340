import java.util.ArrayList;
import java.util.List;

public class RiwayatServis {
    private List<Servis> riwayat;

    public RiwayatServis() {
        riwayat = new ArrayList<>();
    }

    public void tambahServis(Servis servis) {
        riwayat.add(servis);
    }

    public void tampilkanRiwayat() {
        for (Servis s : riwayat) {
            s.detailServis();
        }
    }
}

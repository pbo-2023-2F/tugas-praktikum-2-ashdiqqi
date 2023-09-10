import java.util.ArrayList;
import java.util.List;

public class BukuTamu {
    private List<Komentar> daftarKomentar;

    public BukuTamu() {
        daftarKomentar = new ArrayList<>();
    }

    public void tambahkanKomentar(String nama, String email, String komentar, String alamat) {
        Komentar komen = new Komentar(nama, email, komentar, alamat);
        daftarKomentar.add(komen);
    }

    public void cetakKomentar() {
        for (Komentar komen : daftarKomentar) {
            System.out.println("===========================================");
            System.out.println("Nama: " + komen.getNama());
            System.out.println("Email: " + komen.getEmail());
            System.out.println("Komentar: " + komen.getKomentar());
            System.out.println("Komentar: " + komen.getAlamat());
            System.out.println("===========================================");
            System.out.println();
        }
    }
}

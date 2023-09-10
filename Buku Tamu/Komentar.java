public class Komentar {
    private String nama, email, komentar, alamat;

    public Komentar(String nama, String email, String komentar, String alamat) {
        this.nama = nama;
        this.email = email;
        this.komentar = komentar;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getKomentar() {
        return komentar;
    }

    public String getAlamat() {
        return alamat;
    }
}

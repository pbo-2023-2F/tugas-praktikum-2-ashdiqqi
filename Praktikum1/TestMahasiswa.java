public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();

        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();

        mhs2.nim = 102;
        mhs2.nama = "Joan";
        mhs2.alamat = "Jl. Melati No 1A";
        mhs2.kelas = "1A";
        mhs2.tampilBiodata();

        mhs3.nim = 103;
        mhs3.nama = "Rudi";
        mhs3.alamat = "Jl. Jawa No 1A";
        mhs3.kelas = "1A";
        mhs3.tampilBiodata();

    }
}

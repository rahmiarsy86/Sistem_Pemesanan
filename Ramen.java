public class Ramen extends Menu {
    private String namaRamen;
    private String jenisKaldu;

    void setNamaRamen(String namaRamen) {
        this.namaRamen = namaRamen;
    }
    String getNamaRamen() {
        return this.namaRamen;
    }

    void setJenisKaldu(String jenisKaldu) {
        this.jenisKaldu = jenisKaldu;
    }
    String getJenisKaldu() {
        return this.jenisKaldu;
    }

    @Override
    void output() {
        System.out.println("Jenis Menu     :" + super.getJenisMenu());
        System.out.println("Nama Ramen     :" + this.namaRamen);
        System.out.println("Jenis Kaldu    :" + this.jenisKaldu);
        System.out.println("Harga Ramen    :" + super.getHarga());
    }
}

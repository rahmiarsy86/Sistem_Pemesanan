public class Minuman extends Menu {
    private String namaMinuman;
    private String ukuranMinuman;
    private String jenisMinuman;

    void setNamaMinuman(String namaMinuman) {
        this.namaMinuman = namaMinuman;
    }
    String getNamaMinuman() {
        return this.namaMinuman;
    }

    void setUkuranMinuman(String ukuranMinuman) {
        this.ukuranMinuman = ukuranMinuman;
    }
    String getUkuranMinuman() {
        return this.ukuranMinuman;
    }

    void setJenisMinuman(String jenisMinuman) {
        this.jenisMinuman = jenisMinuman;
    }
    String getJenisMinuman() {
        return this.jenisMinuman;
    }

    @Override
    void output() {
        System.out.println("Jenis Menu     :" + super.getJenisMenu());
        System.out.println("Nama Minuman   :" + this.namaMinuman);
        System.out.println("Ukuran Minuman :" + this.ukuranMinuman);
        System.out.println("Jenis Minuman  :" + this.jenisMinuman);
        System.out.println("Harga Minuman  :" + super.getHarga());
    }
}

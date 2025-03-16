abstract class Menu {
    private String jenisMenu;
    private double harga;
    private int jumlah;

    void setJenisMenu(String jenisMenu) {
        this.jenisMenu = jenisMenu;
    }
    String getJenisMenu() {
        return this.jenisMenu;
    }

    void setHarga(double harga) {
        this.harga = harga;
    }
    double getHarga() {
        return this.harga;
    }

    void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    int getJumlah() {
        return this.jumlah;
    }

    abstract void output();
}

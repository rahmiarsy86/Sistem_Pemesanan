public class MakananPendamping extends Menu {
    private String namaMakananPendamping;

    void setNamaMakananPendamping(String namaMakananPendamping) {
        this.namaMakananPendamping = namaMakananPendamping;
    }
    String getNamaMakananPendamping() {
        return this.namaMakananPendamping;
    }

    @Override
    void output() {
        System.out.println("Jenis Menu     :" + super.getJenisMenu());
        System.out.println("Nama Makanan   :" + this.namaMakananPendamping);
        System.out.println("Harga Makanan  :" + super.getHarga());
    }
}

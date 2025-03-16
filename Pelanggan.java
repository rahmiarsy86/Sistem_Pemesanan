
import java.util.ArrayList;

public class Pelanggan {
    private String namaPelanggan;
    private ArrayList<Menu> listPesanan = new ArrayList<>();

    Menu copyMenu(Menu menu, int jumlah) {
        if (menu instanceof Ramen) {
            Ramen ramen = (Ramen) menu;
            Ramen pesanan = new Ramen();
            pesanan.setJenisMenu(ramen.getJenisMenu());
            pesanan.setNamaRamen(ramen.getNamaRamen());
            pesanan.setJenisKaldu(ramen.getJenisKaldu());
            pesanan.setHarga(ramen.getHarga()*jumlah);
            pesanan.setJumlah(jumlah);
            return pesanan;
        } else if (menu instanceof MakananPendamping) {
            MakananPendamping makananPendamping = (MakananPendamping) menu;
            MakananPendamping pesanan = new MakananPendamping();
            pesanan.setJenisMenu(makananPendamping.getJenisMenu());
            pesanan.setNamaMakananPendamping(makananPendamping.getNamaMakananPendamping());
            pesanan.setHarga(makananPendamping.getHarga()*jumlah);
            pesanan.setJumlah(jumlah);
            return pesanan;
        } else if (menu instanceof Minuman) {
            Minuman minuman = (Minuman) menu;
            Minuman pesanan = new Minuman();
            pesanan.setJenisMenu(minuman.getJenisMenu());
            pesanan.setNamaMinuman(minuman.getNamaMinuman());
            pesanan.setUkuranMinuman(minuman.getUkuranMinuman());
            pesanan.setJenisMinuman(minuman.getJenisMinuman());
            pesanan.setHarga(minuman.getHarga()*jumlah);
            pesanan.setJumlah(jumlah);
            return pesanan;
        } else {
            throw new IllegalArgumentException("Tipe menu tidak dikenali!");
        }
    }

    void input(String namaPelanggan, ArrayList<Menu> listMenu, int index, int jumlah) {
        this.namaPelanggan = namaPelanggan;
        listPesanan.add(copyMenu(listMenu.get(index-1), jumlah));
    }

    void output() {
        System.out.println("Nama Pelanggan :" + this.namaPelanggan);
        for (Menu pesanan : listPesanan) {
            System.out.println();
            pesanan.output();
            System.out.println("Jumlah Pesanan :" + pesanan.getJumlah());
            System.out.println();
        }
    }
}

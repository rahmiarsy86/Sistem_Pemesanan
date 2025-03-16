
import java.util.ArrayList;
import java.util.Scanner;

public class Restoran {
    // Main Class
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Menu> listMenu = new ArrayList<>();
        daftarMenu(listMenu);

        for (Menu menu : listMenu) {
            menu.output();
            System.out.println();
        }

        ArrayList<Pelanggan> listPelanggan = new ArrayList<>();

        inputPelanggan(listPelanggan, listMenu, input);

        for (Pelanggan out : listPelanggan) {
            out.output();
            System.out.println();
        }
    }

    static void daftarMenu(ArrayList<Menu> listMenu) {
        Ramen shoyu = new Ramen();
        shoyu.setJenisMenu("Ramen");
        shoyu.setNamaRamen("Shoyu");
        shoyu.setJenisKaldu("Kecap Asin");
        shoyu.setHarga(30000);
        listMenu.add(shoyu);

        Ramen curry = new Ramen();
        curry.setJenisMenu("Ramen");
        curry.setNamaRamen("Curry");
        curry.setJenisKaldu("Kari Jepang");
        curry.setHarga(35000);
        listMenu.add(curry);

        Ramen miso = new Ramen();
        miso.setJenisMenu("Ramen");
        miso.setNamaRamen("Miso");
        miso.setJenisKaldu("Kuah Miso");
        miso.setHarga(32000);
        listMenu.add(miso);

        MakananPendamping katsu = new MakananPendamping();
        katsu.setJenisMenu("Makanan Pendamping");
        katsu.setNamaMakananPendamping("Katsu");
        katsu.setHarga(18000);
        listMenu.add(katsu);

        MakananPendamping dimsum = new MakananPendamping();
        dimsum.setJenisMenu("Makanan Pendamping");
        dimsum.setNamaMakananPendamping("Dimsum");
        dimsum.setHarga(24000);
        listMenu.add(dimsum);
        
        Minuman ocha = new Minuman();
        ocha.setJenisMenu("Minuman");
        ocha.setNamaMinuman("Teh Ocha");
        ocha.setUkuranMinuman("Besar");
        ocha.setJenisMinuman("Dingin");
        ocha.setHarga(6000);
        listMenu.add(ocha);

        Minuman matcha = new Minuman();
        matcha.setJenisMenu("Minuman");
        matcha.setNamaMinuman("Matcha Latte");
        matcha.setUkuranMinuman("Sedang");
        matcha.setJenisMinuman("Panas");
        matcha.setHarga(12000);
        listMenu.add(matcha);
    }

    static void inputPelanggan(ArrayList<Pelanggan> listPelanggan, ArrayList<Menu> listMenu,Scanner input) {
        Pelanggan pelanggan = new Pelanggan();
        System.out.println("Masukkan Nama Pelanggan!");
        String namaPelanggan = input.nextLine();
        System.out.println();
        while (true) {
            System.out.print("Masukkan pilihan makanan : ");
            int pesanan = input.nextInt();
            System.out.print("Masukkan jumlah makanan : ");
            int jumlah = input.nextInt();
            input.nextLine();
            System.out.println();
            pelanggan.input(namaPelanggan, listMenu, pesanan, jumlah);
            System.out.println("Apakah anda ingin membuat pesanan lagi?");
            String pilihan = input.nextLine();
            System.out.println();
            if (!pilihan.equalsIgnoreCase("Ya")) break;
        }
        listPelanggan.add(pelanggan);
    }
}

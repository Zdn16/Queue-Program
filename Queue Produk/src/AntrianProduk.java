import java.util.LinkedList;
import java.util.Queue;

/**
 * AntrianBoneka
 */
public class AntrianBoneka {

    public static void main(String[] args) {
        
        Queue<String> produk = new LinkedList<>();

        produk.add("mainan");
        produk.add("mie instan");
        produk.add("permen");

        System.out.println("Jenis Produk:" +produk);
        
        System.out.println("Jumlah Produk :"+produk.size());

        produk.add("minuman");
        produk.add("baterai");
        System.out.println("Jenis produk:" +produk);

        produk.poll();
        System.out.println("Jenis produk:" +produk); //jika queue kosong akan null

        produk.remove();
        System.out.println("Jenis produk:" +produk); //jika kosong akan exception

        System.out.println("Dipanggil "+produk.peek()); //untuk mengintip data teratas, jika queue kosong akan null
        System.out.println("Dipanggil element: "+produk.element()); //untuk mengambil elemen yang atas, jika queue kosong akan exception


        produk.clear();
        System.out.println("Produk :"+produk);

    }
}
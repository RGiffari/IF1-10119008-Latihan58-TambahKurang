package latihan.TambahKurang;

public class JumlahBilangan extends Bilangan{
    public void tampilHasilJumlah() {
        int jumlah = getX() + getY();
        System.out.println("Hasil perjumlahan = " + jumlah);
    }
}
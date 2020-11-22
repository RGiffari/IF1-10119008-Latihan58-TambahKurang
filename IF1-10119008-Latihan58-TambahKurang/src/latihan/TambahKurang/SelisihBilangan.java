package latihan.TambahKurang;

public class SelisihBilangan extends Bilangan{
    public void tampilSelisih() {
        int selisih = getX() - getY();
        System.out.println("Hasil Selesih " + getX() + " - " + getY() + " = " + selisih);
    }
}
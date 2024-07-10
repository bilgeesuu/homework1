public class Rectangle {
    private double uzunluk;
    private double genislik;

    public Rectangle(double uzunluk, double genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        this.uzunluk = uzunluk;
    }

    public double getGenislik() {
        return genislik;
    }

    public void setGenislik(double genislik) {
        this.genislik = genislik;
    }

    public double alanHesapla() {
        return this.uzunluk * this.genislik;
    }

    public double cevreHesapla() {
        return 2 * (this.uzunluk + this.genislik);
    }

    public static void main(String[] args) {
        Rectangle dikdortgen = new Rectangle(12.0, 4.0);

        // Alan ve çevreyi hesaplayıp yazdırma
        System.out.println("Dikdörtgenin Alanı: " + dikdortgen.alanHesapla());
        System.out.println("Dikdörtgenin Çevresi: " + dikdortgen.cevreHesapla());
    }
}

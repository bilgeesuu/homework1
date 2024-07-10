public class Item {
    private String urunAdi;
    private String tedarikciAdi;
    private double satisFiyati;
    private double alisFiyati;

    public Item(String urunAdi, String tedarikciAdi, double satisFiyati, double alisFiyati) {
        this.urunAdi = urunAdi;
        this.tedarikciAdi = tedarikciAdi;
        this.satisFiyati = satisFiyati;
        this.alisFiyati = alisFiyati;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getTedarikciAdi() {
        return tedarikciAdi;
    }

    public void setTedarikciAdi(String tedarikciAdi) {
        this.tedarikciAdi = tedarikciAdi;
    }

    public double getSatisFiyati() {
        return satisFiyati;
    }

    public void setSatisFiyati(double satisFiyati) {
        this.satisFiyati = satisFiyati;
    }

    public double getAlisFiyati() {
        return alisFiyati;
    }

    public void setAlisFiyati(double alisFiyati) {
        this.alisFiyati = alisFiyati;
    }

    public void satisFiyatiniYuzde20Artir() {
        this.satisFiyati *= 1.20;
    }

    public double karHesapla() {
        return this.satisFiyati - this.alisFiyati;
    }

    public static void main(String[] args) {

        Item item = new Item("Laptop", "TechSupplier", 25000.0, 20000.0);
        System.out.println("Orijinal Satış Fiyatı: " + item.getSatisFiyati());
        item.satisFiyatiniYuzde20Artir();
        System.out.println("Artırılmış Satış Fiyatı: " + item.getSatisFiyati());
        System.out.println("Elde Edilen Kar: " + item.karHesapla());
    }
}

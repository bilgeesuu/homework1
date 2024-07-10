import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void urunEkle(Item item) {
        this.items.add(item);
    }

    public double toplamFiyatHesapla() {
        double toplamFiyat = 0;
        for (Item item : items) {
            toplamFiyat += item.getSatisFiyati();
        }
        return toplamFiyat;
    }

    public static void main(String[] args) {

        Item item1 = new Item("Laptop", "TechSupplier", 25000.0, 20000.0);
        Item item2 = new Item("Kulaklık", "PhoneSupplier", 2400.0, 1500.0);

        ShoppingCart sepet = new ShoppingCart();

        sepet.urunEkle(item1);
        sepet.urunEkle(item2);

        System.out.println("Toplam Fiyat: " + sepet.toplamFiyatHesapla());
    }
}

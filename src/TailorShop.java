
public class TailorShop {
    public void dressWomen(Clothing[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothing clothing : clothes) {
            if (clothing instanceof WomenClothing) {
                System.out.println("Размер: " + clothing.getSize() + ", Цена: $" + clothing.getCost() + ", Цвет: " + clothing.getColor());
                ((WomenClothing) clothing).dressWomen();
            }
        }
    }

    public void dressMen(Clothing[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothing clothing : clothes) {
            if (clothing instanceof MenClothing) {
                System.out.println("Размер: " + clothing.getSize() + ", Цена: $" + clothing.getCost() + ", Цвет: " + clothing.getColor());
                ((MenClothing) clothing).dressMen();
            }
        }
    }
}

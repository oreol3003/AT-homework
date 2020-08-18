package Space;

// Объекты недвижимости

public abstract class RealEstateObject {

    private int area;                                       // Площадь
    private int price;                                      // Цена за 1 м^2
    private int totalPrice;                                 // Полная цена

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}


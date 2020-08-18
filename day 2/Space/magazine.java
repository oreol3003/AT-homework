package Space;



public class magazine extends unihabited{

    private int area;           //Площадь
    private int price;          //Цена за 1 м^2
    private int total_price;    //Полная цена

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

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }
}

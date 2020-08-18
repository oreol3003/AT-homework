package Space;

public class main {
    public static void main(String[] args) {

        apartment apartment = new apartment();
        apartment.setArea(150);
        apartment.setPrice(35400);
        apartment.setTotal_price(4779000);
        System.out.println(apartment);

        magazine magazine = new magazine();
        magazine.setArea(850);
        magazine.setPrice(25000);
        magazine.setTotal_price(21250000);
        System.out.println(magazine);

        house house = new house();
        house.setArea(250);
        house.setPrice(27400);
        house.setTotal_price(6850000);
        System.out.println(house);


    }
}

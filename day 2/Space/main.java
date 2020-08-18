package Space;

public class main {

    public static void main(String[] args) {

        Apartment apartment = new Apartment();
        apartment.setArea(150);
        apartment.setPrice(35400);
        apartment.setTotalPrice(4779000);

        System.out.println("apartment area = " + apartment.getArea());
        System.out.println("apartment price = " + apartment.getPrice());
        System.out.println("apartment total price = " + apartment.getTotalPrice());

        Magazine magazine = new Magazine();
        magazine.setArea(850);
        magazine.setPrice(25000);
        magazine.setTotalPrice(21250000);

        System.out.println("magazine area = " + apartment.getArea());
        System.out.println("magazine price = " + apartment.getPrice());
        System.out.println("magazine total price = " + apartment.getTotalPrice());

        House house = new House();
        house.setArea(250);
        house.setPrice(27400);
        house.setTotalPrice(6850000);

        System.out.println("house area = " + apartment.getArea());
        System.out.println("house price = " + apartment.getPrice());
        System.out.println("house total price = " + apartment.getTotalPrice());

    }
}

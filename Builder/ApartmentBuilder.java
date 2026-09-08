public class ApartmentBuilder implements HousingBuilder {
    Apartment apartment;
    public ApartmentBuilder() {
        apartment = new Apartment();
    }

    public Housing build() {
        return apartment;
    }

    public HousingBuilder setSize(int size) {
        apartment.setSize(size);
        return this;
    }

    public HousingBuilder setPrice(int price) {
        apartment.setPrice(price);
        return this;
    }

    public HousingBuilder setRooms(int rooms) {
        apartment.setRooms(rooms);
        return this;
    }

    public HousingBuilder setName(String name) {
        apartment.setName(name);
        return this;
    }
}

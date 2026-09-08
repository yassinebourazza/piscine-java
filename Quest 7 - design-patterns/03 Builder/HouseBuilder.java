public class HouseBuilder implements HousingBuilder {
    House house;
    public HouseBuilder() {
        house = new House();
    }

    public Housing build() {
        return house;
    }
    
    public HousingBuilder setSize(int size) {
        house.setSize(size);
        return this;
    }

    public HousingBuilder setPrice(int price) {
        house.setPrice(price);
        return this;
    }

    public HousingBuilder setRooms(int rooms) {
        house.setRooms(rooms);
        return this;
    }

    public HousingBuilder setName(String name) {
        house.setName(name);
        return this;
    }


}

package livingspace;

import livingspace.rooms.*;

public class House {

    public static final int MAX_REST_ROOMS = 10;
    public static final int MAX_BED_ROOMS = 10;

    private Kitchen kitchen;
    private DiningRoom diningRoom;
    private LivingRoom livingRoom;
    private Yard yard;

    private RestRoom[] restRooms = new RestRoom[MAX_REST_ROOMS];
    private int restRoomIndex = 0;

    private BedRoom[] bedRooms = new BedRoom[MAX_BED_ROOMS];
    private int bedRoomIndex = 0;


    public void addRoom(BedRoom bedRoom){

    }

    public void addRoom(RestRoom restRoom){

    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public DiningRoom getDiningRoom() {
        return diningRoom;
    }

    public void setDiningRoom(DiningRoom diningRoom) {
        this.diningRoom = diningRoom;
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public void setLivingRoom(LivingRoom livingRoom) {
        this.livingRoom = livingRoom;
    }

    public RestRoom[] getRestRooms() {
        return restRooms;
    }

    public void setRestRooms(RestRoom[] restRooms) {
        this.restRooms = restRooms;
    }

    public BedRoom[] getBedRooms() {
        return bedRooms;
    }

    public void setBedRooms(BedRoom[] bedRooms) {
        this.bedRooms = bedRooms;
    }

    public Yard getYard() {
        return yard;
    }

    public void setYard(Yard yard) {
        this.yard = yard;
    }
    
}

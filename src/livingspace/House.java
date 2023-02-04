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

    public boolean addRoom(BedRoom bedRoom) {
        if(bedRoomIndex < MAX_BED_ROOMS){
            bedRooms[bedRoomIndex] = bedRoom;
            bedRoomIndex++;
            return true;
        }
        return false;
    }

    public boolean addRoom(RestRoom restRoom) {
        if(restRoomIndex < MAX_REST_ROOMS){
            restRooms[restRoomIndex] = restRoom;
            restRoomIndex++;
            return true;
        }
        return false;
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

    public BedRoom[] getBedRooms() {
        return bedRooms;
    }

    public Yard getYard() {
        return yard;
    }

    public void setYard(Yard yard) {
        this.yard = yard;
    }
    
}

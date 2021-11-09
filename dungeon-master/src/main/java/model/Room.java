package model;

import java.lang.reflect.Array;
import java.util.*;

public class Room {

    private Map<String, Room> nextRooms = new HashMap<String, Room>();
    private static final List<String> DIRECTIONS  = Arrays.asList("north", "south", "east", "west");
    private static final int PERCENT_CREATE_NEW_ROOM = 30;
    private Boolean isAlreadyVisited = false;

    public Room(Room previousRoom, String previousRoomDirection) {
        switch (previousRoomDirection) {
            case "north":
                this.nextRooms.put("south", previousRoom);
                break;
            case "south":
                this.nextRooms.put("north", previousRoom);
                break;
            case "west":
                this.nextRooms.put("east", previousRoom);
                break;
            case "east":
                this.nextRooms.put("west", previousRoom);
                break;
        }

        for (String direction : DIRECTIONS) {
            if (this.nextRooms.containsKey(direction)) continue;
            Random rand = new Random();
            if (rand.nextInt(100) <= PERCENT_CREATE_NEW_ROOM) {
                this.nextRooms.put(direction, new Room(this, direction));
            }
        }
    }

}
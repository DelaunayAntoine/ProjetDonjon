package model;

import java.util.*;

public class Map {

    private java.util.Map<String, Map> nextRooms = new HashMap<String, Map>();
    private static final List<String> DIRECTIONS  = Arrays.asList("north", "south", "east", "west");
    private static final int PERCENT_CREATE_NEW_ROOM = 50;
    private static final int FINAL_LAYER = 6;
    private Boolean isAlreadyVisited = false;

    public Map() {
        for (String direction : DIRECTIONS) {
            if (this.nextRooms.containsKey(direction)) continue;
            Random rand = new Random();
            if (rand.nextInt(100) <= PERCENT_CREATE_NEW_ROOM) {
                this.nextRooms.put(direction, new Map(this, direction, 1));
            }
        }
    }
    public Map(Map previousRoom, String previousRoomDirection, int layer) {
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
        if (layer != FINAL_LAYER) {
            for (String direction : DIRECTIONS) {
                if (this.nextRooms.containsKey(direction)) continue;
                Random rand = new Random();
                if (rand.nextInt(100) <= PERCENT_CREATE_NEW_ROOM) {
                    this.nextRooms.put(direction, new Map(this, direction, layer+1));
                }
            }
        }

        // COMBAT + TRESOR
        // rand création création combat
    }

    public void visitMap(Player player) {
        if(!this.getAlreadyVisited()) {
            this.setAlreadyVisited(true);

            //this.currentRoom.fight.start();
        }



    }


    public Map getNorthRoom() {
        return this.nextRooms.get("north");
    }
    public Map getSouthRoom() {
        return this.nextRooms.get("south");
    }
    public Map getEastRoom() {
        return this.nextRooms.get("east");
    }
    public Map getWestRoom() {
        return this.nextRooms.get("west");
    }

    public Boolean getAlreadyVisited() {
        return isAlreadyVisited;
    }

    public void setAlreadyVisited(Boolean alreadyVisited) {
        isAlreadyVisited = alreadyVisited;
    }
}
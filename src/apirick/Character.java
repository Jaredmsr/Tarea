package apirick;

import java.util.ArrayList;

public class Character {
    public int id;
    public String name;
    public String status;
    public String species;
    public String type;
    public String gender;
    public Origin origin;
    public Location location;
    public String image;
    public ArrayList<String> episode;
    public String url;
    public String created;

    // Clase anidada para Origin
    public static class Origin {
        public String name;
        public String url;
    }

    // Clase anidada para Location
    public static class Location {
        public String name;
        public String url;
    }
}
package tech.cititech.cricket.scoreboard;

public class Venue {
    
    private String country;
    private String city;
    private String ground;
    private int venueCapacity;
    private String end1;
    private String end2;

    public Venue(String country, String city, String ground, int venueCapacity, String end1, String end2) {
        this.country = country;
        this.city = city;
        this.ground = ground;
        this.venueCapacity = venueCapacity;
        this.end1 = end1;
        this.end2 = end2;
    }

    public String getCountry() {
        return this.country;
    }

    public String getCity() {
        return this.city;
    }

    public String getGround() {
        return this.ground;
    }

    public int getVenueCapacity() {
        return this.venueCapacity;
    }

    public String getEnd1() {
        return this.end1;
    }

    public String getEnd2() {
        return this.end2;
    }
}

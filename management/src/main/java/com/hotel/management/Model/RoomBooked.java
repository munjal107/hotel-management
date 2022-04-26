package com.hotel.management.Model;


import javax.persistence.*;

@Entity
public class RoomBooked {

    public RoomBooked(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booked_id")
    private long id;

    @OneToOne
    @JoinColumn(name = "amd_id")
    private Amenities amenities;

    @OneToOne
    @JoinColumn(name = "room_id")
    private Rooms rooms;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Amenities getAmenities() {
        return amenities;
    }

    public void setAmenities(Amenities amenities) {
        this.amenities = amenities;
    }

    public Rooms getRooms() {
        return rooms;
    }

    public void setRooms(Rooms rooms) {
        this.rooms = rooms;
    }
}

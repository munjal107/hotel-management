package com.hotel.management.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Booking {
    public Booking() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private long id;

    private String roomType;

//    @Temporal(TemporalType.DATE)
//    Date stayFrom;
    private String stayFrom;
    private String StayUpto;

    private double roomrate;
    private double totalBill;
    private boolean isCancelled;
    private int numberOfAdults;
    private int numberOfChildren;
    private int numberOfRooms;

    @OneToOne
    @JoinColumn(name = "hote_id")
    private Hotel hotel;

    @OneToOne
    @JoinColumn(name = "cust_id")
    private Customer customer;

    @OneToMany(cascade = CascadeType.ALL)
    private List<RoomBooked> roomBookedList;

    public List<RoomBooked> getRoomBookedList() {
        return roomBookedList;
    }

    public void setRoomBookedList(List<RoomBooked> roomBookedList) {
        this.roomBookedList = roomBookedList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getStayFrom() {
        return stayFrom;
    }

    public void setStayFrom(String stayFrom) {
        this.stayFrom = stayFrom;
    }

    public String getStayUpto() {
        return StayUpto;
    }

    public void setStayUpto(String stayUpto) {
        StayUpto = stayUpto;
    }

    public double getRoomrate() {
        return roomrate;
    }

    public void setRoomrate(double roomrate) {
        this.roomrate = roomrate;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }

    public int getNumberOfAdults() {
        return numberOfAdults;
    }

    public void setNumberOfAdults(int numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}

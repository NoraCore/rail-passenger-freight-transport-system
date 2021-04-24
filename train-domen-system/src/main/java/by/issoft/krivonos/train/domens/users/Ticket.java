package by.issoft.krivonos.train.domens.users;

import by.issoft.krivonos.train.domens.wagons.carriages.Seat;

import java.util.Date;
import java.util.UUID;

public class Ticket {
    private final UUID id;
    private Seat seat;
    private int coach;
    private int price;
    private int status;
    private Date dateandTimeofBooking;
    private String carOwner;
    private Payment method;
    private Date departure;
    private Date arrival;
    private String from;
    private String to;

    public Ticket(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }


    public int getCoach() {
        return coach;
    }

    public void setCoach(int coach) {
        coach = coach;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        price = price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getDateandTimeofBooking() {
        return dateandTimeofBooking;
    }

    public void setDateandTimeofBooking(Date dateandTimeofBooking) {
        dateandTimeofBooking = dateandTimeofBooking;
    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        carOwner = carOwner;
    }

    public Payment getMethod() {
        return method;
    }

    public void setMethod(Payment method) {
        this.method = method;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        departure = departure;
    }

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(Date arrival) {
        arrival = arrival;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        from = from;
    }

    public String getTo() {
        return to;
    }

}

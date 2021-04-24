package by.issoft.krivonos.train.domens.users;

import java.util.Objects;

public class Passenger {
    private final User user;
    private final Ticket ticket;

    public Passenger(User user, Ticket ticket) {
        this.user = user;
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "user=" + user +
                ", ticket=" + ticket +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return Objects.equals(user, passenger.user) && Objects.equals(ticket, passenger.ticket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, ticket);
    }
}

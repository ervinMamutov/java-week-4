package projects.flightReservationSystem;

import java.util.Objects;

public class Passenger {
  private final String id;
  private final String name;

  public Passenger(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public String getPassengerName() {
    return name;
  }

  public String getPassengerId() {
    return id;
  }

  @Override
  public String toString() {
    return "Passenger: " + name + " id " + id + " :: ";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Passenger passenger = (Passenger) o;
    return Objects.equals(id, passenger.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}


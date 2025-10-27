package projects.flightReservationSystem;

import java.util.List;
import java.util.Objects;

public class Flight {
  private final String id;
  private final String origin;
  private final String destination;
  private final int seat;
  private List<String> flyData;

  public Flight(String id, String origin, String destination,
                int seat) {
    this.id = id;
    this.origin = origin;
    this.destination = destination;
    this.seat = seat;
  }

  public String getFlyId() {
    return id;
  }

  public String getFlyOrigin() {
    return origin;
  }

  public String getFlyDestination() {
    return destination;
  }

  public int getFlySeat() {
//    System.out.println();
//    System.out.println("-------------");
//    System.out.println("Seat operation " + seat);
//    System.out.println("-------------");

    return seat;
  }

  public int getFlySeatAvailable(int reserved) {
//    System.out.println();
//    System.out.println("-------------");
//    System.out.println(" Reserved operation " + (seat - reserved));
//    System.out.println("-------------");

    return seat - reserved;
  }

  @Override
  public String toString() {
    return "Flight: id " + id + " origin " + origin + " destination " +
            destination;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Flight flight  = (Flight) o;
    System.out.println("--------->>>>>>>>>>><<<<<<<<<<--------");
    System.out.println("Equals operation " + Objects.equals(id, flight.id));
    return Objects.equals(id, flight.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}

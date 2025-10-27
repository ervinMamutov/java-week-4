package projects.flightReservationSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reservation {
  private final List<Flight> flights;
  private final List<Passenger> passengers;
  private final Map<Passenger, Flight> reservation;
  private int seatAvailable = 0;

  public Reservation() {
    flights = new ArrayList<>();
    passengers = new ArrayList<>();
    reservation = new HashMap<>();
  }

  public void addFlight(Flight flight) {
    flights.add(flight);
  }

  public void addPassenger(Passenger passenger) {
    passengers.add(passenger);
  }

  public void addReservation(Passenger passenger, Flight flight) {
    if (flight.getFlySeatAvailable(seatAvailable) <= 0) {
      System.out.println("The fly is full. There are no seat available");
      System.out.println(
              "Passenger " + passenger.getPassengerName() + " not registry");
    } else {
      ++seatAvailable;
      reservation.put(passenger, flight);
    }
  }

  public void cancelReservation(Passenger passenger, Flight flight) {
    if (flight.getFlySeatAvailable(seatAvailable) <= 0) {
      System.out.println("All seats are empty. This cancellation is incorrect");
    } else {
      --seatAvailable;
      reservation.remove(passenger, flight);
    }
  }

  public void showReservation() {
    reservation.forEach((key, value) -> {
      System.out.print(key);
      System.out.print(value);
      System.out.println(
              " seat available " + (value.getFlySeat() - seatAvailable));
    });
  }
}

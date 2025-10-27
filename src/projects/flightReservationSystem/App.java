package projects.flightReservationSystem;

public class App {
  Reservation reservation = new Reservation();

  public static void run() {
    Reservation reservation = new Reservation();
    Passenger p1 = new Passenger("A1234", "Albert");
    Passenger p2 = new Passenger("A1232", "John");
    Passenger p3 = new Passenger("A1235", "Alex");

    Flight f1 = new Flight(
            "A001", "Belgium", "USA", 5);

    System.out.println("To USA");

    reservation.addReservation(p1, f1);
    System.out.println("Fly seat 1 -> " + f1.getFlySeat());
    System.out.println("Seat available 1 -> " + f1.getFlySeatAvailable(1));

    reservation.addReservation(p2, f1);
    System.out.println("Fly seat 2 -> " + f1.getFlySeat());
    System.out.println("Seat available 2 -> " + f1.getFlySeatAvailable(1));

    reservation.addReservation(p3, f1);
    System.out.println("Fly seat 3 -> " + f1.getFlySeat());
    System.out.println("Seat available 3 -> " + f1.getFlySeatAvailable(1));

    reservation.cancelReservation(p1, f1);
    System.out.println("Fly seat cancel -> " + f1.getFlySeat());
    System.out.println("Seat available cancel -> " + f1.getFlySeatAvailable(1));

   // reservation.showReservation();


    System.out.println("Return to Belgium");

    Flight f2 = new Flight(
            "A002", "USA", "Belgium", 3);
    reservation.addReservation(p1, f2);
    System.out.println("Fly seat 2.1 -> " + f2.getFlySeat());
    System.out.println("Seat available 2.1 -> " + f2.getFlySeatAvailable(1));

    reservation.addReservation(p2, f2);
    System.out.println("Fly seat 2.2 -> " + f2.getFlySeat());
    System.out.println("Seat available 2.2 -> " + f2.getFlySeatAvailable(1));

    // reservation.showReservation();

  }
}

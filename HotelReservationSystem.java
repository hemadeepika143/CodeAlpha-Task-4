import java.util.Scanner;

public class HotelReservationSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int standardRooms = 5;
        int deluxeRooms = 3;
        int suiteRooms = 2;

        int choice;

        do {
            System.out.println("\n=== Hotel Reservation System ===");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nAvailable Rooms:");
                    System.out.println("Standard Rooms: " + standardRooms);
                    System.out.println("Deluxe Rooms: " + deluxeRooms);
                    System.out.println("Suite Rooms: " + suiteRooms);
                    break;

                case 2:
                    System.out.println("\nChoose Room Type:");
                    System.out.println("1. Standard (₹1000)");
                    System.out.println("2. Deluxe (₹2000)");
                    System.out.println("3. Suite (₹3000)");
                    int roomType = sc.nextInt();

                    if (roomType == 1 && standardRooms > 0) {
                        standardRooms--;
                        System.out.println("Standard Room booked successfully!");
                        System.out.println("Payment of ₹1000 completed.");
                    } else if (roomType == 2 && deluxeRooms > 0) {
                        deluxeRooms--;
                        System.out.println("Deluxe Room booked successfully!");
                        System.out.println("Payment of ₹2000 completed.");
                    } else if (roomType == 3 && suiteRooms > 0) {
                        suiteRooms--;
                        System.out.println("Suite Room booked successfully!");
                        System.out.println("Payment of ₹3000 completed.");
                    } else {
                        System.out.println("Room not available!");
                    }
                    break;

                case 3:
                    System.out.println("Booking cancelled successfully!");
                    System.out.println("Refund initiated.");
                    break;

                case 4:
                    System.out.println("Thank you for using Hotel Reservation System!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}

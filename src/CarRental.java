import java.util.Scanner; //sesudah di refactoring

public class CarRental {

    private static final double DAILY_RATE = 50.0; // Cost per day

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String carModel = getCarModel(scanner);
        int rentalDays = getRentalDays(scanner);

        if (isValidRentalDays(rentalDays)) {
            double totalCost = calculateTotalCost(rentalDays);
            displayRentalDetails(carModel, rentalDays, totalCost);
            displayThankYouMessage();
        } else {
            System.out.println("Invalid number of rental days.");
        }

        scanner.close();
    }

    private static String getCarModel(Scanner scanner) { //input model mobil
        System.out.print("Enter car model: ");
        return scanner.nextLine();
    }

    private static int getRentalDays(Scanner scanner) { //input hari sewa
        System.out.print("Enter number of days to rent: ");
        return scanner.nextInt();
    }

    private static boolean isValidRentalDays(int rentalDays) { //jumlah hari sewa
        return rentalDays > 0;
    }

    private static double calculateTotalCost(int rentalDays) { //perhitungan biaya
        return DAILY_RATE * rentalDays;
    }

    private static void displayRentalDetails(String carModel, int rentalDays, double totalCost) {
        System.out.println("Car model: " + carModel);
        System.out.println("Total rental cost for " + rentalDays + " days: $" + totalCost);
    } //menampilkan detail sewa

    private static void displayThankYouMessage() { //pesan terimakasih
        System.out.println("Thank you for your order!");
    }
}
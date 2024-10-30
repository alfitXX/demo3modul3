# CarRental Program

This Java program is a simple car rental system where users can enter the car model and the number of rental days to calculate the total rental cost. It provides an interactive experience for the user, displaying rental details and a thank-you message upon completion.

## Features

- Prompt for car model and number of rental days.
- Validate the number of rental days.
- Calculate the total cost based on a fixed daily rental rate.
- Display rental details and thank the user for their order.

## Program Structure

The `CarRental` class contains the following main methods:

- **getCarModel**: Prompts the user to enter the car model.
- **getRentalDays**: Prompts the user to enter the number of rental days.
- **isValidRentalDays**: Checks if the entered number of rental days is valid (must be greater than 0).
- **calculateTotalCost**: Calculates the total rental cost based on the number of days.
- **displayRentalDetails**: Displays the car model, rental days, and total cost.
- **displayThankYouMessage**: Displays a thank-you message.

## How to Use

1. Clone the repository or download the `CarRental.java` file.
2. Compile the program:
    ```bash
    javac CarRental.java
    ```
3. Run the program:
    ```bash
    java CarRental
    ```
4. Follow the prompts to enter the car model and number of days for rental.

## Example Output

Enter car model: Sedan 

Enter number of days to rent: 5 


Car model: Sedan 

Total rental cost for 5 days: $250.0 

Thank you for your order!


## License

This project is free to use for educational and personal purposes.

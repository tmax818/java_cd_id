package FundamentalsDay01.Assignments.CafeJava;

public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        // TODO Create 3 more drink price variables, for drip coffee, latte and cappuccino
        double mochaPrice = 3.5;

        // Customer name variables (add yours below)
        // TODO Create 3 more customer variables for Sam, Jimmy and Noah
        String customer1 = "Cindhuri";

        // Order completions (add yours below)
        // TODO Create the order status flag (true/false) for each customer
        boolean isReadyOrder1 = false;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        // ** Your customer interaction print statements will go here ** //
        // TODO Cindhuri ordered a coffee. Print to the console the correct status message, based on her order status.

        // TODO Noah ordered a cappuccino. Use an if statement to check the status of his order and print the correct status message. If it is ready, also print the message to display the total.

        // TODO Sam just ordered 2 lattes, print the message to display their total. Next, use an if statement to print the appropriate order status message. Change the isReady flag value from true to false or vice versa in order to test your control logic (if-statement).

        // TODO Jimmy just realized he was charged for a coffee but had ordered a latte. Print the total message with the new calculated total (what he owes) to make up the difference.

        // TODO Try changing the price values for each drink and isReady flags (booleans), to test if all of your logic works, even when prices and statuses are changed.
    }
}

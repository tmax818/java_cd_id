package FundamentalsDay01.Reading.SwitchAndTernaryOperators;

public class Ternary {
    public static void main(String[] args) {
        boolean isRaining = true;
        if(isRaining) {
            System.out.println("Bring an umbrella.");
        }
        else {
            System.out.println("Have fun!");
        }

        System.out.println(isRaining ? "Bring an umbrella." : "Have fun!");


    }
}

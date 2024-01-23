import java.util.Scanner;

public class GreenTae {

    private static class ProductionCalculator {

        private int remainingSugar = 0;
        private int remainingHoney = 0;
        private int remainingChrysanthemum = 0;
        private int remainingWater = 0;
        private int remainingGreenTeaLeaf = 0;

        private int totalChrysanthemumTest = 0;
        private int totalOriginalTest = 0;

        private final int WATER_PER_BOTTLE = 200;
        private final int GREEN_TEA_LEAF_PER_BOTTLE = 25;

        public void calculateProduction(int dailyResupplySugar, int dailyResupplyHoney, int dailyResupplyChrysanthemum,
                                        int dailyResupplyWater, int dailyResupplyGreenTeaLeaf) {
            // Resupply ingredients
            remainingSugar += dailyResupplySugar;
            remainingHoney += dailyResupplyHoney;
            remainingChrysanthemum += dailyResupplyChrysanthemum;
            remainingWater += dailyResupplyWater;
            remainingGreenTeaLeaf += dailyResupplyGreenTeaLeaf;

            // Produce Chrysanthemum Test
            int chrysanthemumTestBottles = (int) Math.min(
                    remainingChrysanthemum / (20),
                    Math.min(
                            remainingWater / WATER_PER_BOTTLE,
                            Math.min(
                                    remainingHoney / 75,
                                    remainingGreenTeaLeaf / GREEN_TEA_LEAF_PER_BOTTLE
                            )
                    )
            );
            remainingChrysanthemum -= chrysanthemumTestBottles * (20);
            remainingWater -= chrysanthemumTestBottles * WATER_PER_BOTTLE;
            remainingHoney -= chrysanthemumTestBottles * 75;
            remainingGreenTeaLeaf -= chrysanthemumTestBottles * GREEN_TEA_LEAF_PER_BOTTLE;

            // Produce Original Test
            int originalTestBottles = (int) Math.min(
                    remainingSugar / (50),
                    Math.min(
                            remainingWater / WATER_PER_BOTTLE,
                            remainingGreenTeaLeaf / GREEN_TEA_LEAF_PER_BOTTLE
                    )
            );
            remainingSugar -= originalTestBottles * (50);
            remainingWater -= originalTestBottles * WATER_PER_BOTTLE;
            remainingGreenTeaLeaf -= originalTestBottles * GREEN_TEA_LEAF_PER_BOTTLE;

            // Update total production
            totalChrysanthemumTest += chrysanthemumTestBottles;
            totalOriginalTest += originalTestBottles;

            // Display amount of each test produced
            System.out.println("Chrysanthemum Test produced: " + chrysanthemumTestBottles + " bottles");
            System.out.println("Original Test produced: " + originalTestBottles + " bottles");

            // Display remaining ingredients for the next day
            System.out.println("\nRemaining Ingredients for the Next Day:");
            System.out.println("Sugar: " + remainingSugar + " grams");
            System.out.println("Honey: " + remainingHoney + " grams");
            System.out.println("Chrysanthemum: " + remainingChrysanthemum + " grams");
            System.out.println("Water: " + remainingWater + " ml");
            System.out.println("Green Tea Leaf: " + remainingGreenTeaLeaf + " grams");
        }

        public void displayTotalProduction() {
            // Display total production
            System.out.println("\nTotal Production:");
            System.out.println("Chrysanthemum Test: " + totalChrysanthemumTest + " bottles");
            System.out.println("Original Test: " + totalOriginalTest + " bottles");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of ProductionCalculator
        ProductionCalculator calculator = new ProductionCalculator();

        // Loop for 30 days
        for (int day = 1; day <= 2; day++) {
            System.out.println("\nDay " + day);

            // Input for daily resupply amounts
            System.out.println("Enter the daily resupply amount for sugar (grams):");
            int dailyResupplySugar = scanner.nextInt();

            System.out.println("Enter the daily resupply amount for honey (grams):");
            int dailyResupplyHoney = scanner.nextInt();

            System.out.println("Enter the daily resupply amount for Chrysanthemum flower (grams):");
            int dailyResupplyChrysanthemum = scanner.nextInt();

            System.out.println("Enter the daily resupply amount for water (ml):");
            int dailyResupplyWater = scanner.nextInt();

            System.out.println("Enter the daily resupply amount for Green Tea Leaf (grams):");
            int dailyResupplyGreenTeaLeaf = scanner.nextInt();

            // Calculate and display production for the day
            calculator.calculateProduction(dailyResupplySugar, dailyResupplyHoney, dailyResupplyChrysanthemum,
                    dailyResupplyWater, dailyResupplyGreenTeaLeaf);
        }

        // Display total production
        calculator.displayTotalProduction();

        scanner.close();
    }
}
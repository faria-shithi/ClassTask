class Restaurant {
    public double taxRate = 0.10;
    public int estimateDeliveryTime() {
        return 40;
    }
    public double calculateTotalBill(double foodPrice) {
        double tax = foodPrice * taxRate;
        double total = foodPrice + tax;
        System.out.println("restaurant Food " + foodPrice
                + "  tax (" + (taxRate * 100) + "%)" + tax
                + "   total " + total
                + "   delivery " + estimateDeliveryTime() + " mins");
        return total;
    }
}
class FastFoodRestaurant extends Restaurant {
    public FastFoodRestaurant() {
        taxRate = 0.15;
    }
    @Override
    public int estimateDeliveryTime() {
        return 20; 
    }
}
class FineDiningRestaurant extends Restaurant {
    @Override
    public int estimateDeliveryTime() {
        return 60;
    }
}
public class Problem8b {
    public static void main(String[] args) {
        Restaurant regular = new Restaurant();
        FastFoodRestaurant fastFood = new FastFoodRestaurant();
        FineDiningRestaurant fineDining = new FineDiningRestaurant();
        System.out.println(" Regular ");
        regular.calculateTotalBill(150.0);
        System.out.println("\n FastFood");
        fastFood.calculateTotalBill(200.0);
        System.out.println("\n FineDining");
        fineDining.calculateTotalBill(450.0);
    }
}

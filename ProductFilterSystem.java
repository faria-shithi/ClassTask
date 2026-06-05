class ProductFilter {

    void filterProducts(String category) {
        System.out.println( "category"+category);
    }


    void filterProducts(double min, double max) {
        System.out.println("price range " + min + " - $" + max);
    }


    void filterProducts(String category, double min, double max) {
        System.out.println("category " + category + " price range" + min + " - " + max);
    }


    void filterProducts(String category, String brand) {
        System.out.println("Searching by Category: " + category + " | Brand: " + brand);
    }


    void filterProducts(String category, double min, double max, String brand) {
        System.out.println("category " + category + " price range" + min + " -  " + max + "  brand " + brand);
    }
}


public class ProductFilterSystem {
    public static void main(String[] args) {

        ProductFilter f1 = new ProductFilter();
        f1.filterProducts("fashion");
        f1.filterProducts(100, 500);
        f1.filterProducts("fashion", "apple");
        f1.filterProducts("Electronics", 300, 1000);
        f1.filterProducts("Electronics", 1000, 5000, "Apple");
    }
}

public class MainProduct {
    public static void main(String[] args) {
        Product product1 = new Product("Nasi Goreng", 15000);
        product1.showPrice();

        Product product2 = new Product(2, "Nasi Ayam", 25000);
        product2.showPrice();

        Product product3 = new Product(3, "Nasi Rendang", 20000);
        product3.showPrice();

        Product product4 = new Product(5, "Jambu", 139302);
        product4.showPrice();
    }
}

package interfaceClass;

public class MainInterface {
    public static void main(String[] args) {
        HasBrand brand = new HasBrandImpl("Indo Copy", 12, 13, "23-5-1990");
        System.out.println("Brand name "+ brand.getBrand());
        System.out.println("Brand price "+ brand.getPrice());
        System.out.println("Id product "+ brand.getId());
        System.out.println("Expired date "+ brand.getExpired());
    }
}
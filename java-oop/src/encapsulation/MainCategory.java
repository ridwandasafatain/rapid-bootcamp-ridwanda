package encapsulation;

public class MainCategory {
    public static void main(String[] args){
        Category category = new Category();
        category.setId(1);
        category.setName("YA makanan lah");
        category.setDesc("Makanan diusahakan sehat");
        System.out.println(category);

        System.out.println(new Category(2,"Minuman", "Minuman Sehat"));
        System.out.println(new Category(3,"Aksesoris", "Gelang aja"));
    }
}

package interfaceClass;

public class HasBrandImpl implements HasBrand{
    private String brandName;
    private Integer price;
    private Integer id;
    private String expired;

    public HasBrandImpl(String brandName, Integer price, Integer id, String expired) {
        this.brandName = brandName;
        this.price = price;
        this.id = id;
        this.expired = expired;
    }

    @Override
    public String getBrand() {
        return this.brandName;
    }
    @Override
    public Integer getPrice() {
        return this.price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getExpired() {
        return this.expired;
    }
}

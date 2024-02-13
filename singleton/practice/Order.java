package practice;

public class Order {
    private Long id;
    private String name;
    private Long quan;
    private Long price;

    public Order(Long id, String name, Long quan, Long price) {
        this.id = id;
        this.name = name;
        this.quan = quan;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getQuan() {
        return quan;
    }

    public Long getPrice() {
        return price;
    }
}

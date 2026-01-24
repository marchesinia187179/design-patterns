package Model;

public class Item {
    private String code;
    private Double price;

    public Item(String code, double price) {
        this.code = code;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public Double getPrice() {
        return price;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}

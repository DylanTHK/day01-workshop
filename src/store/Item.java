package store;

public class Item {
    
    // define private variables
    private String name;
    private Float price;
    private Integer quantity;

    // create constructor
    public Item (String newName, Float newPrice, Integer newQuantity) {
        this.name = newName;
        this.price = newPrice;
        this.quantity = newQuantity;
    }

    // define methods 
    public String getName() {
        return name;
    }
    public Float getPrice() {
            return price;
        }
        public Integer getQuantity() {
            return quantity;
        }

    // setter
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }





    
}

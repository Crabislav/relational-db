package lesson6.homework.products;

public class OrderDetails {
    private Order order;
    private Product product;
    private Long unitPrice;
    private Long quantity;
    private Long discount;

    public OrderDetails(Order order, Product product, Long unitPrice, Long quantity, Long discount) {
        this.order = order;
        this.product = product;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.discount = discount;
    }

    public Order getOrder() {
        return order;
    }

    public Product getProduct() {
        return product;
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public Long getQuantity() {
        return quantity;
    }

    public Long getDiscount() {
        return discount;
    }
}

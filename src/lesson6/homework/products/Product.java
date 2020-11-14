package lesson6.homework.products;

public class Product {
    private Long id;
    private String productName;
    private Supplier supplier;
    private Category category;
    private Long quantityPerUnit;
    private Long unitPrice;
    private Long unitsIntStock;
    private Long unitsOnOrder;
    private Integer reorderLevel;
    private Long discontinued;

    public Product(Long id, String productName, Supplier supplier, Category category, Long quantityPerUnit,
                   Long unitPrice, Long unitsIntStock, Long unitsOnOrder, Integer reorderLevel, Long discontinued) {
        this.id = id;
        this.productName = productName;
        this.supplier = supplier;
        this.category = category;
        this.quantityPerUnit = quantityPerUnit;
        this.unitPrice = unitPrice;
        this.unitsIntStock = unitsIntStock;
        this.unitsOnOrder = unitsOnOrder;
        this.reorderLevel = reorderLevel;
        this.discontinued = discontinued;
    }

    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Category getCategory() {
        return category;
    }

    public Long getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public Long getUnitsIntStock() {
        return unitsIntStock;
    }

    public Long getUnitsOnOrder() {
        return unitsOnOrder;
    }

    public Integer getReorderLevel() {
        return reorderLevel;
    }

    public Long getDiscontinued() {
        return discontinued;
    }
}

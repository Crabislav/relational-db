package lesson6.homework.products;

import java.util.Date;

public class Order {
    private Long id;
    private Customer customer;
    private Employee employee;
    private Date orderDate;
    private Date requiredDate;
    private Date shippedDate;
    private Shipper shipVia;
    private Long freight;
    private String shipName;
    private String shipAddress;
    private String shipCity;
    private String shipRegion;
    private Long shipPostalCode;
    private String shipCountry;

    public Order(Long id, Customer customer, Employee employee, Date orderDate, Date requiredDate, Date shippedDate,
                 Shipper shipVia, Long freight, String shipName, String shipAddress, String shipCity, String shipRegion,
                 Long shipPostalCode, String shipCountry) {
        this.id = id;
        this.customer = customer;
        this.employee = employee;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
        this.shipVia = shipVia;
        this.freight = freight;
        this.shipName = shipName;
        this.shipAddress = shipAddress;
        this.shipCity = shipCity;
        this.shipRegion = shipRegion;
        this.shipPostalCode = shipPostalCode;
        this.shipCountry = shipCountry;
    }

    public Long getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public Date getRequiredDate() {
        return requiredDate;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public Shipper getShipVia() {
        return shipVia;
    }

    public Long getFreight() {
        return freight;
    }

    public String getShipName() {
        return shipName;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public String getShipCity() {
        return shipCity;
    }

    public String getShipRegion() {
        return shipRegion;
    }

    public Long getShipPostalCode() {
        return shipPostalCode;
    }

    public String getShipCountry() {
        return shipCountry;
    }
}

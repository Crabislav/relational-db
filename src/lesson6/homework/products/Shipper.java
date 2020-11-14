package lesson6.homework.products;

public class Shipper {
    private Long id;
    private String companyName;
    private Long phone;

    public Shipper(Long id, String companyName, Long phone) {
        this.id = id;
        this.companyName = companyName;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Long getPhone() {
        return phone;
    }
}

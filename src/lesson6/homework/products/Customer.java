package lesson6.homework.products;

public class Customer {
    private Long id;
    private String companyName;
    private String contactName;
    private String contactTitle;
    private String address;
    private String city;
    private String region;
    private Long postalCode;
    private String country;
    private Long phone;
    private Long fax;

    public Customer(Long id, String companyName, String contactName, String contactTitle, String address, String city,
                    String region, Long postalCode, String country, Long phone, Long fax) {
        this.id = id;
        this.companyName = companyName;
        this.contactName = contactName;
        this.contactTitle = contactTitle;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.phone = phone;
        this.fax = fax;
    }

    public Long getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getRegion() {
        return region;
    }

    public Long getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    public Long getPhone() {
        return phone;
    }

    public Long getFax() {
        return fax;
    }
}

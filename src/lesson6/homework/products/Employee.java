package lesson6.homework.products;

import java.util.Date;

public class Employee {
    private Long id;
    private String lastName;
    private String firstName;
    private String title;
    private Date birthDate;
    private Date hireDate;
    private String address;
    private String city;
    private String region;
    private Long postalCode;
    private String country;
    private Long homePhone;
    private String extension;
    private String photo;
    private String notes;
    private String reportsTo;

    public Employee(Long id, String lastName, String firstName, String title, Date birthDate, Date hireDate,
                    String address, String city, String region, Long postalCode, String country, Long homePhone,
                    String extension, String photo, String notes, String reportsTo) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.title = title;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.homePhone = homePhone;
        this.extension = extension;
        this.photo = photo;
        this.notes = notes;
        this.reportsTo = reportsTo;
    }

    public Long getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getTitle() {
        return title;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Date getHireDate() {
        return hireDate;
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

    public Long getHomePhone() {
        return homePhone;
    }

    public String getExtension() {
        return extension;
    }

    public String getPhoto() {
        return photo;
    }

    public String getNotes() {
        return notes;
    }

    public String getReportsTo() {
        return reportsTo;
    }
}

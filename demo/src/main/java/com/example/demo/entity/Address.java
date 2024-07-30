package main.java.com.example.demo.entity;

import java.lang.annotation.Inherited;

@Entity
public class Address {
    @Id
    @GeneratedValues(strategy = GenerationType.IDENTITY)
    private Long addressId;
    private String street;
    private String city;
    @OneToMany(mappedBy = "address",cascade = CascadeType.ALL)
    
    private List<Employee> employees;
    public Address() {
    }
    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }
    public Long getAddressId() {
        return addressId;
    }
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }
   
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public List<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    
    

}

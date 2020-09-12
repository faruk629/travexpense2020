package be.travexpense.beans;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Objects;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {
    private Long id;
    private String street;
    private String number;
    private Locality locality;

    public Address() {

    }

    public Address(String street, String number, Locality locality) {
        this(null, street, number,locality);
    }

    public Address(Long id, String street, String number, Locality locality) {
        this.id = id;
        this.street = street;
        this.number = number;
        this.locality = locality;
    }

    @Column(name="address_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "address_street", nullable = false)
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Column(name = "address_number", nullable = false)
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    @ManyToOne(optional = false)
    @JoinColumn(name="locality_id",nullable = true, foreignKey = @ForeignKey(name="fk_locality_address"))
    public Locality getLocality() {
        return locality;
    }

    public void setLocality(Locality locality) {
        this.locality = locality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(street, address.street) &&
                Objects.equals(number, address.number) &&
                Objects.equals(locality, address.locality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, number, locality);
    }
}

package be.travexpense.beans;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

@Entity
public class Locality {
    private long id;
    private String city;
    private int zipCode;
    private List<Address> addresses;

    public Locality() throws SQLException {
    }

    public Locality(String city, int zipCode) {
        this.city = city;
        this.zipCode = zipCode;
    }

    @Column(name = "locality_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "locality_city", nullable = false)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "locality_zipCode", nullable = false)
    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }


    @OneToMany(fetch = FetchType.LAZY,mappedBy = "locality")
    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Locality locality = (Locality) o;
        return id == locality.id &&
                zipCode == locality.zipCode &&
                Objects.equals(city, locality.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, city, zipCode);
    }
}

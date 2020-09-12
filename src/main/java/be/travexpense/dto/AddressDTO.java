package be.travexpense.dto;

import be.travexpense.beans.Locality;
import be.travexpense.mappers.LocalityMapper;
import org.modelmapper.ModelMapper;

public class AddressDTO {
    private Long id;
    private String street;
    private String number;
    private LocalityDTO locality;

    public AddressDTO() {
    }

    public AddressDTO(String street, String number, Locality locality) {
        this(null,street,number,locality);
    }

    public AddressDTO(Long id, String street, String number, Locality locality) {
        this.id = id;
        this.street = street;
        this.number = number;
        this.locality = LocalityMapper.from(locality);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalityDTO getLocality() {
        return locality;
    }

    public void setLocality(LocalityDTO locality) {
        this.locality = locality;
    }
}

package be.travexpense.dto;

public class LocalityDTO {
    private Long id;
    private String city;
    private Integer zipCode;

    public LocalityDTO() {
    }

    public LocalityDTO(String city, int zipCode) {
        this(null,city,zipCode);
    }

    public LocalityDTO(Long id, String city, int zipCode) {
        this.id = id;
        this.city = city;
        this.zipCode = zipCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }
}

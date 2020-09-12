package be.travexpense.dto;

import java.time.LocalDate;

public class PriceDTO {
    private Long id;
    private LocalDate startDate;
    private LocalDate endDate;
    private double amount;

    public PriceDTO() {
    }

    public PriceDTO(LocalDate startDate, double amount) {
        this(null,startDate,null,amount);
    }

    public PriceDTO(LocalDate startDate, LocalDate endDate, double amount) {
        this(null,startDate,endDate,amount);
    }

    public PriceDTO(Long id, LocalDate startDate, LocalDate endDate, double amount) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

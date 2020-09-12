package be.travexpense.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Price",  uniqueConstraints={
        @UniqueConstraint(columnNames={"price_startDate", "price_endDate"})
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Price {
    private Long id;
    private LocalDate startDate;
    private LocalDate endDate;
    private double amount;

    public Price() {
    }

    public Price(LocalDate startDate,LocalDate endDate, double amount) {
        this(null, startDate,endDate, amount);

    }

    public Price(Long id, LocalDate startDate, LocalDate endDate, double amount) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.amount = amount;
    }

    @Column(name = "price_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "price_startDate", nullable = false)
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    @Column(name = "price_endDate", nullable = false)
    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    @Column(name = "price_amount", nullable = false)
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getCost(Long km) {
        return amount * km;
    }

    @Override
    public String toString() {
        return "Price{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", amount=" + amount +
                '}';
    }
}

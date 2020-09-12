package be.travexpense.repositories;

import be.travexpense.beans.Price;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface PriceRepository extends CrudRepository<Price,Long> {
    Price findByStartDate(LocalDate startDate);
    Price findTop1ByOrderByEndDateDesc();
    @Override
    Price save(Price price);
    @Override
    List<Price> findAll();
}

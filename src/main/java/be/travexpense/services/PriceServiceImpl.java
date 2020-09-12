package be.travexpense.services;

import be.travexpense.beans.Price;
import be.travexpense.repositories.PriceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PriceServiceImpl implements PriceService {
    private final PriceRepository repo;
    private final Logger LOGGER = LoggerFactory.getLogger(PriceServiceImpl.class);

    @Autowired
    public PriceServiceImpl(PriceRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Price> getAll() {
        return repo.findAll();
    }

    @Override
    public Price getByStartDate(LocalDate date) {
        Price price = repo.findByStartDate(date);
        if (price == null) return null;
        return price;
    }

    @Override
    public Price addPrice(Price price) {
        if (price == null) return null;
        LOGGER.info("Price : "+  price.toString());
        Price priceTmp = repo.findByStartDate(price.getStartDate());
        LOGGER.info("PriceTMP : " + priceTmp);
        LOGGER.info("LAST : " + getLast());
        if(priceTmp == null) return null;
        return null;
    }

    @Override
    public Price getLast() {
        return repo.findTop1ByOrderByEndDateDesc();
    }
}

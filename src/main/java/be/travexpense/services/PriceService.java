package be.travexpense.services;

import be.travexpense.beans.Price;

import java.time.LocalDate;
import java.util.List;

public interface PriceService {
    List<Price> getAll();
    Price getByStartDate(LocalDate date);
    Price addPrice(Price price);
    Price getLast();
}

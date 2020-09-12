package be.travexpense.mappers;

import be.travexpense.beans.Price;
import be.travexpense.dto.PriceDTO;

import java.util.ArrayList;
import java.util.List;

public class PriceMapper {
    public static PriceDTO from(Price price) {
        if(price == null) return null;
        PriceDTO priceDTO = new PriceDTO();
        priceDTO.setId(price.getId());
        priceDTO.setStartDate(price.getStartDate());
        priceDTO.setEndDate(price.getEndDate());
        priceDTO.setAmount(price.getAmount());
        return priceDTO;
    }
    public static List<PriceDTO> fromList(List<Price> prices) {
        List<PriceDTO> pricesDTO = new ArrayList<>();
        prices.stream().forEach(p -> pricesDTO.add(from(p)));
        return pricesDTO;
    }
}

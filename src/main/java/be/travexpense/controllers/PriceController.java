package be.travexpense.controllers;

import be.travexpense.beans.Price;
import be.travexpense.dto.PriceDTO;
import be.travexpense.mappers.PriceMapper;
import be.travexpense.services.PriceServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:8080",allowedHeaders = "*")
public class PriceController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PriceController.class);
    private final PriceServiceImpl service;

    @Autowired
    public PriceController(PriceServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/prices")
    public List<PriceDTO> getPrices() {
        return PriceMapper.fromList(service.getAll());
    }

    @PostMapping(value = "/price",consumes = "application/json",produces="application/json")
    public Price addPrice(@Valid @RequestBody Price price) {
        LOGGER.info("addPrice : price '{}'", price);
        return service.addPrice(price);
    }
}

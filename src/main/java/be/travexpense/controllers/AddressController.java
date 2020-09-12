package be.travexpense.controllers;

import be.travexpense.beans.Address;
import be.travexpense.dto.AddressDTO;
import be.travexpense.mappers.AddressMapper;
import be.travexpense.services.AddressServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/")
@CrossOrigin(origins= {"http://localhost:8080"},allowedHeaders = "*")
public class AddressController {
    private static final Logger LOGGER = LoggerFactory.getLogger(LocalityController.class);
    private final AddressServiceImpl service;
    @Autowired
    public AddressController(AddressServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/addresses")
    public List<AddressDTO> getAddresses() {
        return AddressMapper.fromList(service.getAddresses());
    }

    @GetMapping("/address")
    public Address getAddress() {
        return service.getAddress();
    }
    @PostMapping(value = "/address", consumes = "application/json", produces = "application/json")
    public Address addAddress(@Valid @RequestBody Address address) {
        LOGGER.info("addAddresse : address ", address);
        return service.addAddress(address);
    }
}

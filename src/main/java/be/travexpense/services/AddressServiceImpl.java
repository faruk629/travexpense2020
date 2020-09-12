package be.travexpense.services;

import be.travexpense.beans.Address;
import be.travexpense.controllers.LocalityController;
import be.travexpense.repositories.AddressRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    private static final Logger LOGGER = LoggerFactory.getLogger(LocalityController.class);
    private final AddressRepository repo;

    @Autowired
    public AddressServiceImpl(AddressRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Address> getAddresses() {
        return repo.findAll();
    }

    @Override
    public Address addAddress(Address address) {
        return repo.save(address);
    }

    public Address getAddress() {
        return new Address();
    };
}

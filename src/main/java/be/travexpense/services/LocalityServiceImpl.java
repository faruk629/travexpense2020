package be.travexpense.services;

import be.travexpense.beans.Locality;
import be.travexpense.repositories.LocalityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalityServiceImpl implements LocalityService {
    private static final Logger LOGGER = LoggerFactory.getLogger(LocalityServiceImpl.class);

    private final LocalityRepository repo;

    @Autowired
    public LocalityServiceImpl(LocalityRepository localityRepository) {
        this.repo = localityRepository;
    }

    @Override
    public Locality getByZipCode(int zipCode) {
        return repo.findFirstByZipCode(zipCode);
    }

    @Override
    public List<Locality> getLocalities() {
        return repo.findAll();
    }
}

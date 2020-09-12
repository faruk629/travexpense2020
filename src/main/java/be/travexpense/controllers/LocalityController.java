package be.travexpense.controllers;


import be.travexpense.beans.Locality;
import be.travexpense.dto.LocalityDTO;
import be.travexpense.mappers.LocalityMapper;
import be.travexpense.services.LocalityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins= {"http://localhost:8080"},allowedHeaders = "*")
public class LocalityController {
    private static final Logger LOGGER = LoggerFactory.getLogger(LocalityController.class);
    private final LocalityService localityService;

    @Autowired
    public LocalityController(LocalityService localityService) {
        this.localityService = localityService;
    }

    @GetMapping("/locality/{zipCode}")
    public LocalityDTO getLocalityByZipCode(@PathVariable("zipCode") int zipCode) {
        LOGGER.info("findByZipCode : zipCode '{}'",zipCode);
        return LocalityMapper.from(localityService.getByZipCode(zipCode));
    }

    @GetMapping("/localities")
    public List<LocalityDTO> getLocalities() {
        LOGGER.info(localityService.getLocalities()+"");
        return LocalityMapper.fromList(localityService.getLocalities());
    }
}

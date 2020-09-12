package be.travexpense.repositories;

import be.travexpense.beans.Locality;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LocalityRepository extends CrudRepository<Locality,Long> {
    Locality findFirstByZipCode(int zipCode);
    @Override
    List<Locality> findAll();

}

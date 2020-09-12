package be.travexpense.repositories;

import be.travexpense.beans.Address;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AddressRepository extends CrudRepository<Address,Long> {

    @Override
    List<Address> findAll();

    @Override
    Address save(Address address);

}

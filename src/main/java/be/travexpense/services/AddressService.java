package be.travexpense.services;

import be.travexpense.beans.Address;

import java.util.List;

public interface AddressService {
    List<Address> getAddresses();
    Address addAddress(Address address);
}

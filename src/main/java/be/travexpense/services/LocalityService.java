package be.travexpense.services;

import be.travexpense.beans.Locality;

import java.util.List;

public interface LocalityService {
    Locality getByZipCode(int zipCode);
    List<Locality> getLocalities();
}

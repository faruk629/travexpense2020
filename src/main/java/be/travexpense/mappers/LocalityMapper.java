package be.travexpense.mappers;

import be.travexpense.beans.Locality;
import be.travexpense.dto.LocalityDTO;

import java.util.ArrayList;
import java.util.List;

public class LocalityMapper {
    public static LocalityDTO from(Locality locality) {
       if(locality == null) return null;
       return new LocalityDTO(locality.getId(),locality.getCity(),locality.getZipCode());
    }
    public static List<LocalityDTO> fromList(List<Locality> localities) {
        List<LocalityDTO> localitiesDTO = new ArrayList<>();
        localities.stream().forEach(l-> localitiesDTO.add(from(l)));
        return localitiesDTO;
    }
}

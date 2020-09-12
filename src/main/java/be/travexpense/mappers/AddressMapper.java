package be.travexpense.mappers;

import be.travexpense.beans.Address;
import be.travexpense.dto.AddressDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AddressMapper {
    public static AddressDTO from(Address address) {
        if(address == null) return null;
        return new AddressDTO(address.getId(),address.getStreet(),address.getNumber(),address.getLocality());
    }
    public static List<AddressDTO> fromList(Collection<Address> addresses) {
        List<AddressDTO> addressesDTO = new ArrayList<>();
        addresses.stream().forEach(a -> addressesDTO.add(from(a)));
        return addressesDTO;
    }
}

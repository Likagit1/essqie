package ci.digitalacademy.atosmonetab.Services;

import ci.digitalacademy.atosmonetab.Models.Adress;
import ci.digitalacademy.atosmonetab.Services.dto.AdressDTO;
import java.util.List;
import java.util.Optional;

public interface AdressService {

    AdressDTO save(AdressDTO adress);

    AdressDTO update(AdressDTO adress);

    Optional<AdressDTO> findOne(Long id);

    List<AdressDTO> findAll();

    void delete(Long id);
}

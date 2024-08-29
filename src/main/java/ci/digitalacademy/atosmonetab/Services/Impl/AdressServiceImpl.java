package ci.digitalacademy.atosmonetab.Services.Impl;

import ci.digitalacademy.atosmonetab.Models.Adress;
import ci.digitalacademy.atosmonetab.Repositories.AdressRepository;
import ci.digitalacademy.atosmonetab.Services.AdressService;
import ci.digitalacademy.atosmonetab.Services.dto.AdressDTO;
import ci.digitalacademy.atosmonetab.Services.mapper.AdressMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
  public class AdressServiceImpl implements AdressService{

    private final AdressRepository adressRepository;
    private final AdressMapper adressMapper;
    @Override
    public AdressDTO save(AdressDTO adressDTO) {
      log.debug("Request to save : {}" , adressDTO);
      Adress adress = adressMapper.toEntity(adressDTO);
      adress = adressRepository.save(adress);
      return adressMapper.toDto(adress);
    }

    @Override
    public AdressDTO update(AdressDTO adressDTO) {
        Adress adress = adressMapper.toEntity(adressDTO);
        adress = adressRepository.save(adress);
        return adressMapper.toDto(adress);
    }

    @Override
    public Optional<AdressDTO> findOne(Long id) {
        return adressRepository.findById(id).map(adress -> {
          return adressMapper.toDto(adress);
        });
    }

    @Override
    public List<AdressDTO> findAll() {
        return adressRepository.findAll().stream().map(adress -> {
          return adressMapper.toDto(adress);
        }).toList();
    }

    @Override
    public void delete(Long id) {

    }


}




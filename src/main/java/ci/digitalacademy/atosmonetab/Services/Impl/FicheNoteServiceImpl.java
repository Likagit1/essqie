package ci.digitalacademy.atosmonetab.Services.Impl;
import  ci.digitalacademy.atosmonetab.Models.FicheNote;
import ci.digitalacademy.atosmonetab.Repositories.FicheNoteRepository;
import ci.digitalacademy.atosmonetab.Services.FicheNoteService;
import ci.digitalacademy.atosmonetab.Services.dto.FicheNoteDTO;
import ci.digitalacademy.atosmonetab.Services.mapper.FicheNoteMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class FicheNoteServiceImpl implements FicheNoteService{

    private final FicheNoteRepository ficheNoteRepository;

    @Override
    public FicheNoteDTO save(FicheNoteDTO ficheNoteDTO) {
        log.debug("Request to save : {}" , ficheNoteDTO);
        FicheNote ficheNote = FicheNoteMapper.toEntity(ficheNoteDTO);
        ficheNote = ficheNoteRepository.save(ficheNote);
        return FicheNoteMapper.toDto(ficheNote);
    }

    @Override
    public FicheNoteDTO update(FicheNoteDTO ficheNoteDTO) {
        FicheNote ficheNote = FicheNoteMapper.toEntity(ficheNoteDTO);
        ficheNote = ficheNoteRepository.save(ficheNote);
        return FicheNoteMapper.toDto(ficheNote);    }

    @Override
    public Optional<FicheNoteDTO> findOne(Long id) {
        return ficheNoteRepository.findById(id).map(ficheNote -> {
            return FicheNoteMapper.toDto(ficheNote);
        });    }

    @Override
    public List<FicheNoteDTO> findAll() {
        return ficheNoteRepository.findAll().stream().map(ficheNote -> {
            return FicheNoteMapper.toDto(ficheNote);
        }).toList();
    }

    @Override
    public void delete(Long id) {

    }
}

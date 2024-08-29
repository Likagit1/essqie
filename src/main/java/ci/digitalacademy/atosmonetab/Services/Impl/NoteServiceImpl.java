package ci.digitalacademy.atosmonetab.Services.Impl;
import ci.digitalacademy.atosmonetab.Models.Note;
import ci.digitalacademy.atosmonetab.Repositories.NoteRepository;
import ci.digitalacademy.atosmonetab.Services.NoteService;
import ci.digitalacademy.atosmonetab.Services.dto.NoteDTO;
import ci.digitalacademy.atosmonetab.Services.mapper.NoteMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j

public class NoteServiceImpl implements NoteService {

    private final NoteRepository noteRepository;

    @Override
    public NoteDTO save(NoteDTO noteDTO) {
        log.debug("Request to save : {}" , noteDTO);
        Note note = NoteMapper.toEntity(noteDTO);
        note = noteRepository.save(note);
        return NoteMapper.toDto(note);
    }

    @Override
    public NoteDTO update(NoteDTO noteDTO) {
        Note note = NoteMapper.toEntity(noteDTO);
        note = noteRepository.save(note);
        return NoteMapper.toDto(note);    }

    @Override
    public Optional<NoteDTO> findOne(Long id) {
        return noteRepository.findById(id).map(note -> {
            return NoteMapper.toDto(note);
        });    }

    @Override
    public List<NoteDTO> findAll() {
        return noteRepository.findAll().stream().map(note -> {
            return NoteMapper.toDto(note);
        }).toList();
    }

    @Override
    public void delete(Long id) {

    }
}

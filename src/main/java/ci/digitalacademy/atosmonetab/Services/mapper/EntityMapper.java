package ci.digitalacademy.atosmonetab.Services.mapper;

public interface EntityMapper <D , E> {
    D toDto(E entity);

    E toEntity(D dto);
}

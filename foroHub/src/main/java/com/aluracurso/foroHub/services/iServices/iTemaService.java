package com.aluracurso.foroHub.services.iServices;

import com.aluracurso.foroHub.models.dtos.tema.TemaActualizarDTO;
import com.aluracurso.foroHub.models.dtos.tema.TemaDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface iTemaService {

    List<TemaDto> findAll();
    Page<TemaDto> paginate(Pageable pageable);
    TemaDto findById(Integer id);
    TemaDto save(TemaDto temaDto);
    TemaDto update(Integer id, TemaActualizarDTO temaActualizarDTO);
    Boolean delete(Integer id);

}

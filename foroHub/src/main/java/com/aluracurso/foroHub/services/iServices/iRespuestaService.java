package com.aluracurso.foroHub.services.iServices;

import com.aluracurso.foroHub.models.dtos.respuesta.RespuestaDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface iRespuestaService {

    List<RespuestaDTO> findAll();
    Page<RespuestaDTO> paginate(Pageable pageable);
    RespuestaDTO findById(Integer id);
    RespuestaDTO save(RespuestaDTO respuestaDTO);
    RespuestaDTO update(Integer id, RespuestaDTO respuestaDTO);
    Boolean delete(Integer id);

}

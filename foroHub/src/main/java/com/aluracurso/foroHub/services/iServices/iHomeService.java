package com.aluracurso.foroHub.services.iServices;

import com.aluracurso.foroHub.models.dtos.tema.Genero;
import com.aluracurso.foroHub.models.dtos.tema.TemaDto;

import java.time.LocalDate;
import java.util.List;

public interface iHomeService {

    List<TemaDto> findByGenero(Genero genero);
    List<TemaDto> getTemasByDate(LocalDate localDate);


}

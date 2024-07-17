package com.aluracurso.foroHub.services;



import com.aluracurso.foroHub.models.dtos.tema.Genero;
import com.aluracurso.foroHub.models.dtos.tema.TemaDto;
import com.aluracurso.foroHub.services.iServices.iHomeService;

import java.time.LocalDate;
import java.util.List;

public class HomeService implements iHomeService {

    @Override
    public List<TemaDto> findByGenero(Genero genero) {
        return null;
    }

    @Override
    public List<TemaDto> getTemasByDate(LocalDate localDate) {
        return null;
    }
}

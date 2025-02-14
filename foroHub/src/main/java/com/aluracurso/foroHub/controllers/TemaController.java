package com.aluracurso.foroHub.controllers;


import com.aluracurso.foroHub.models.dtos.tema.TemaActualizarDTO;
import com.aluracurso.foroHub.models.dtos.tema.TemaDto;
import com.aluracurso.foroHub.services.iServices.iTemaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class TemaController {

    @Autowired
    private iTemaService temaService;

    @GetMapping(value = "/admin/temas/list")
    private List<TemaDto> findAll(){
        return temaService.findAll();
    }

    @GetMapping(value = "/admin/temas")
    private Page<TemaDto> paginate(@PageableDefault(sort = "createdAt",direction = Sort.Direction.ASC ,size = 10 ) Pageable pageable){
        return temaService.paginate(pageable);
    }

    @GetMapping(value = "/temas/{id}")
    private TemaDto findById(@PathVariable(value = "id") Integer id){
        return temaService.findById(id);
    }

    @PostMapping(value = "/crearTema")
    private TemaDto save(@RequestBody @Valid TemaDto temaDto){
        return temaService.save(temaDto);
    }

    @PutMapping(value = "/temas/{id}")
    private TemaDto update(@PathVariable(value = "id") Integer id, @RequestBody @Valid TemaActualizarDTO temaActualizarDTO){
        return temaService.update(id,temaActualizarDTO);
    }

    @DeleteMapping(value = "/temas/{id}")
    private Boolean delete(@PathVariable(value = "id") Integer id){
        return temaService.delete(id);
    }

}

package com.aluracurso.foroHub.models.dtos.usuario;


import com.aluracurso.foroHub.models.dtos.Role;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UsuarioDTO {

    private Integer id;
    private String nombre;
    private String email;
    private String password;
    private Role role;
    private Boolean activo;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}

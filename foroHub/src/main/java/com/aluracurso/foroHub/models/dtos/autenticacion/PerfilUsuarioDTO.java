package com.aluracurso.foroHub.models.dtos.autenticacion;

import com.aluracurso.foroHub.models.dtos.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PerfilUsuarioDTO {

    private Integer id;
    private String nombre;
    private String email;
    private String password;
    private Role role;

}

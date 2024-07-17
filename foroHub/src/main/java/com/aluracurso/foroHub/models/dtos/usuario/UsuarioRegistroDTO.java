package com.aluracurso.foroHub.models.dtos.usuario;

import com.aluracurso.foroHub.models.dtos.Role;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class UsuarioRegistroDTO {

    @NotNull
    @Size(min = 3, message = "Nombre debe tener almenos 3 caracteres!")
    @Size(max = 45, message = "Nombre puede tener maximo 45 caracteres!")
    private String nombre;

    @NotNull
    @Email
    private String email;

    @NotEmpty
    @Pattern(regexp = "[a-z0-9-]+")
    @Size(min = 5, message = "El password debe tener al menos 5 caracteres!")
    private String password;

//    @NotNull
   private Role role;

    private String filePerfil;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getFilePerfil() {
        return filePerfil;
    }

    public void setFilePerfil(String filePerfil) {
        this.filePerfil = filePerfil;
    }
}

package com.aluracurso.foroHub.controllers;


import com.aluracurso.foroHub.exceptions.BadRequestExcepton;
import com.aluracurso.foroHub.models.Usuario;
import com.aluracurso.foroHub.models.dtos.Role;
import com.aluracurso.foroHub.models.dtos.autenticacion.PerfilUsuarioDTO;
import com.aluracurso.foroHub.models.dtos.usuario.UsuarioRegistroDTO;
import com.aluracurso.foroHub.repository.iUsuarioRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@RestController
@RequestMapping(value = "/api")
@AllArgsConstructor
public class CuentaController {

    private final iUsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public CuentaController(iUsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping(value = "/registro")
    public PerfilUsuarioDTO registro(@RequestBody @Validated UsuarioRegistroDTO usuarioRegistroDTO){
        boolean emailExists = usuarioRepository.existsByEmail(usuarioRegistroDTO.getEmail());
        if (emailExists){
            throw new BadRequestExcepton("ERROR EMAIL DUPLICADO: El email ya existe!");
        }

        Usuario usuario = new ModelMapper().map(usuarioRegistroDTO,Usuario.class);
        usuario.setPassword(passwordEncoder.encode(usuarioRegistroDTO.getPassword()));
        usuario.setActivo(Boolean.TRUE);
        usuario.setRole(Role.USER);
        usuario.setCreatedAt(LocalDateTime.now());
        usuarioRepository.save(usuario);
        return new ModelMapper().map(usuario, PerfilUsuarioDTO.class);
    }

}

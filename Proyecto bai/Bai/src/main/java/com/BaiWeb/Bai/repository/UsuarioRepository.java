package com.BaiWeb.Bai.repository;

import com.BaiWeb.Bai.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Object> findByNombre(String nombre);
}

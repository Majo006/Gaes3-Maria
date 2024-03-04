package com.BaiWeb.Bai.repository;

import com.BaiWeb.Bai.entity.CitaEmpleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaEmpleadoRepository extends JpaRepository<CitaEmpleado, Long> {
}

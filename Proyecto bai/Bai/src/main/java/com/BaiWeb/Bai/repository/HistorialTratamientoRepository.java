package com.BaiWeb.Bai.repository;

import com.BaiWeb.Bai.entity.HistorialTratamiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialTratamientoRepository extends JpaRepository<HistorialTratamiento, Long> {
}

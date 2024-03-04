package com.BaiWeb.Bai.repository;

import com.BaiWeb.Bai.entity.EstadoCita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoCitaRepository extends JpaRepository<EstadoCita, Long> {
}

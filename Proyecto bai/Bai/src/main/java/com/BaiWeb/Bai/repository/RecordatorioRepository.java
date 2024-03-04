package com.BaiWeb.Bai.repository;

import com.BaiWeb.Bai.entity.Recordatorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordatorioRepository extends JpaRepository<Recordatorio,Long> {
}

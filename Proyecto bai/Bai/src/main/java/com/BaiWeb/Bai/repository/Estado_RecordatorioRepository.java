package com.BaiWeb.Bai.repository;

import com.BaiWeb.Bai.entity.Estado_Recordatorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Estado_RecordatorioRepository extends JpaRepository<Estado_Recordatorio, Long> {
}

package com.BaiWeb.Bai.repository;

import com.BaiWeb.Bai.entity.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminstradorRepository extends JpaRepository<Administrador, Long> {
}

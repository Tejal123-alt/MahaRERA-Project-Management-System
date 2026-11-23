package com.rera.mitra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rera.mitra.entity.Rera;

@Repository
public interface ReraRepository extends JpaRepository<Rera, Integer> {

}

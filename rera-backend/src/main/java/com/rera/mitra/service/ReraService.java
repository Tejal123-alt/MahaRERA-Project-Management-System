package com.rera.mitra.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rera.mitra.entity.Rera;
import com.rera.mitra.repository.ReraRepository;

@Service
public class ReraService {

    private final ReraRepository reraRepository;

    public ReraService(ReraRepository reraRepository) {
        this.reraRepository = reraRepository;
    }

    public List<Rera> getAllProjects() {
        return reraRepository.findAll();
    }

    public Optional<Rera> getProjectById(Integer id) {
        return reraRepository.findById(id);
    }
}

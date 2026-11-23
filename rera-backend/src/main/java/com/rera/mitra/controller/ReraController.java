package com.rera.mitra.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.rera.mitra.entity.Rera;
import com.rera.mitra.service.ReraService;

@RestController
@RequestMapping("/api/projects")
@CrossOrigin(origins = "*")
public class ReraController {

    private final ReraService reraService;

    public ReraController(ReraService reraService) {
        this.reraService = reraService;
    }

    @GetMapping
    public List<Rera> getAllProjects() {
        return reraService.getAllProjects();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rera> getProjectById(@PathVariable Integer id) {
        return reraService.getProjectById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}

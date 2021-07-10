package com.simulazione2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simulazione2.entita.Entita;
import com.simulazione2.service.EntitaService;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@Transactional
public class EntitaController {

    @Autowired
    EntitaService categoriesService;

    @GetMapping
    public ResponseEntity<List<Entita>> getAll() {
        return ResponseEntity.ok().body(categoriesService.getAll());
    }
}

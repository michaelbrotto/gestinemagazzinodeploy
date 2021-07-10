package com.simulazione2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simulazione2.entita.Entita;
import com.simulazione2.iServie.IEntitService;
import com.simulazione2.repository.EntitaRepository;
@Service
public class EntitaService implements IEntitService{
@Autowired
private EntitaRepository repository;
@Override
public List<Entita> getAll() {
	return repository.findAll();
}
}

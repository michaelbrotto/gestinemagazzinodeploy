package com.simulazione2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simulazione2.entita.Entita;

@Repository
public interface EntitaRepository extends JpaRepository<Entita,Integer>{

}

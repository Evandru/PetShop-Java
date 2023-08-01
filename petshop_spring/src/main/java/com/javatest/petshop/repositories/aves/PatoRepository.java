package com.javatest.petshop.repositories.aves;

import com.javatest.petshop.entities.classes.ave.especies.Pato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatoRepository extends JpaRepository<Pato, Long> {

}
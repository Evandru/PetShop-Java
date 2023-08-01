package com.javatest.petshop.repositories.aves;

import com.javatest.petshop.entities.classes.ave.especies.Penguim;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PenguimRepository extends JpaRepository<Penguim, Long> {

}
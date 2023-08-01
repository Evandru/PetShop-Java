package com.javatest.petshop.repositories.aves;

import com.javatest.petshop.entities.classes.ave.especies.Pardal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PardalRepository extends JpaRepository<Pardal, Long> {

}
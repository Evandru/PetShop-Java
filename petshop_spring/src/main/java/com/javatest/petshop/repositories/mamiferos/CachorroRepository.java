package com.javatest.petshop.repositories.mamiferos;

import com.javatest.petshop.entities.classes.mamifero.especies.Cachorro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CachorroRepository extends JpaRepository<Cachorro, Long> {

}
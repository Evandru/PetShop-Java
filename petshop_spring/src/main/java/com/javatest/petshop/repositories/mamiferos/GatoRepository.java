package com.javatest.petshop.repositories.mamiferos;

import com.javatest.petshop.entities.classes.mamifero.especies.Gato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GatoRepository extends JpaRepository<Gato, Long> {

}
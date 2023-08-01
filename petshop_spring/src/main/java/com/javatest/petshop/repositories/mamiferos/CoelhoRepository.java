package com.javatest.petshop.repositories.mamiferos;

import com.javatest.petshop.entities.classes.mamifero.especies.Coelho;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoelhoRepository extends JpaRepository<Coelho, Long> {

}
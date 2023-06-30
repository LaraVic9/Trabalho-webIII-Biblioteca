package com.example.trabalhowebiiibiblioteca.repositories;

import com.example.trabalhowebiiibiblioteca.domain.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Livro, Integer> { }

package com.example.trabalhowebiiibiblioteca.services;

import com.example.trabalhowebiiibiblioteca.domain.Livro;
import com.example.trabalhowebiiibiblioteca.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class LivroService {

    @Autowired
    LivroRepository repository;

    public List<Livro> findAll(){

        return repository.findAll();
    }

    public Livro findById(Integer id){
        if(!repository.existsById(id)){
            throw new IllegalArgumentException("O id informado não existe");
        }
        return repository.findById(id).get();
    }

    public Livro save(Livro livro){
        return repository.save(livro);
    }

    public Livro create(Livro livro) {
        return repository.save(livro);
    }

    public Livro update(Livro livro) {

        if (!repository.existsById(livro.getId())){
            throw new NoSuchElementException("Id do livro não encontrado");
        }

        return repository.save(livro);
    }

    public void deleteById(Integer id) {
        if (!repository.existsById(id)){
            throw new NoSuchElementException("Id do livro não encontrado");
        }

        repository.deleteById(id);
    }
}
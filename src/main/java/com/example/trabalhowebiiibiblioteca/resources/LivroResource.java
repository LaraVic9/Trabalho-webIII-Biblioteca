package com.example.trabalhowebiiibiblioteca.resources;

import com.example.trabalhowebiiibiblioteca.domain.Livro;
import com.example.trabalhowebiiibiblioteca.services.LivroService;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.UIResource;
import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroResource {

    LivroService service;

    @Autowired
    public LivroResource(LivroService service){
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity<List<Livro>> findAll(){

        Livro l1 = new Livro(1, "A Colina Escarlate",  "16/10/2015","Nancy Holder", 0);
        service.save(l1);

        Livro l2 = new Livro(2, "O Lado mais Sombrio",  "01/01/2013","A. G. Howard", 1);
        service.save(l2);

        List<Livro> categories = service.findAll();

        return ResponseEntity.status(HttpStatus.OK).body(categories);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livro> findById(@PathVariable Integer id){
        Livro livro = service.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(livro);
    }

    @PostMapping()
    public ResponseEntity<Livro> create(@RequestBody  Livro livro){
        livro = service.create(livro);

        return ResponseEntity.status(HttpStatus.CREATED).body(livro);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Livro> update(@PathVariable Integer id, @RequestBody Livro livro) {

        livro.setId(id);
        livro = service.update(livro);

        return ResponseEntity.status(HttpStatus.OK).body(livro);

    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id) {

        service.deleteById(id);

    }

}
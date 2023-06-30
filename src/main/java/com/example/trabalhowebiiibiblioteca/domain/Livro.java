package com.example.trabalhowebiiibiblioteca.domain;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
//import java.util.Locale;


public class Livro {

    private Integer id;

    private String name;
    private String autor;
    private String date;
    private LivroStatus status;


    private void status(){
        String disponivel;
        String emprestado;
        String indisponivel;
    };

    public Livro(){}

    public Livro(String name) {
        this.name = name;
    }



    public Livro(Integer id, String name, String date, String autor, Integer livroStatus) {
        this.id = id;
        this.name = name;
        this.autor = autor;
        this.date = date;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(LocalDate birthDate) {
        this.date = date;
    }



    public void setStatus(Integer LivroStatus) {
        if(LivroStatus == 0) {
            this.status = com.example.trabalhowebiiibiblioteca.domain.LivroStatus.DISPONIVEL;
        } else if(LivroStatus == 1) {
            this.status = com.example.trabalhowebiiibiblioteca.domain.LivroStatus.INDISPONIVEL;
        } else if(LivroStatus == 2) {
            this.status = com.example.trabalhowebiiibiblioteca.domain.LivroStatus.EMPRESTADO;
        }
    }

    public LivroStatus getStatus(){return status;}

    String pattern = "dd/MM/yyyy";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);


}

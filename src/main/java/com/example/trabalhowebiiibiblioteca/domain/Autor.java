package com.example.trabalhowebiiibiblioteca.domain;

import java.util.Objects;

public class Autor {
    private Integer id;
    private String name;

    public Autor(Integer id, String name) {
        setId(id);
        setName(name);
    }

    public Autor(String name) {
        setName(name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Autor other = (Autor) obj;
        return Objects.equals(id, other.id) && Objects.equals(name, other.name);
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
}

package com.example.pruebasconcurrencia;

import java.util.List;

public class Alumnos {
    private List<ObjetoAlumno> alumnos;

    public List<ObjetoAlumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<ObjetoAlumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "alumnos=" + alumnos +
                '}';
    }
}

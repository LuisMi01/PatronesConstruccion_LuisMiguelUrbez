package org.example;

import org.example.ambulancias.Ambulancia;
import org.example.builders.AmbulanciaBuilder;
import org.example.builders.Builder;
import org.example.builders.BuilderCompuesto;
import org.example.builders.BuilderSimple;
import org.example.director.Director;

public class Main {
public static void main(String[] args) {
    Director director = new Director();

    AmbulanciaBuilder baseSimpleBuilder = new AmbulanciaBuilder() {
        @Override
        public void construirNombre(String nombre) {

        }

        @Override
        public void construirNumAmbulancias(int numAmbulancias) {

        }

        @Override
        public void construirTiempoMedioAsistencia(int tiempoMedioAsistencia) {

        }
    };
    director.setBaseBuilder(baseSimpleBuilder);
    director.construirBase();
    Builder baseSimple = director.getBase();
    }
}

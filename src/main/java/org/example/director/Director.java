package org.example.director;

import org.example.builders.AmbulanciaBuilder;
import org.example.builders.Builder;

public class Director {
        private AmbulanciaBuilder baseBuilder;

        public void setBaseBuilder(AmbulanciaBuilder baseBuilder) {
            this.baseBuilder = baseBuilder;
        }

        public Builder getBase() {
            return baseBuilder.getBase();
        }

        public void construirBase() {
            baseBuilder.crearNuevaBase();
            baseBuilder.construirNombre("Nombre de la base");
            baseBuilder.construirNumAmbulancias(0);
            baseBuilder.construirTiempoMedioAsistencia(0);
        }
}


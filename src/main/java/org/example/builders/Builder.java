package org.example.builders;

import org.example.ambulancias.Ambulancia;
import org.example.components.GPSNavigator;
import java.util.ArrayList;
import java.util.List;


public class Builder {

    private String nombre;
    private int numAmbulancias;
    private int tiempoMedioAsistencia;
    private List<Builder> basesSimples;

    public Builder() {
        basesSimples = new ArrayList<Builder>();
    }

    public static void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void setNumAmbulancias(int numAmbulancias) {
        this.numAmbulancias = numAmbulancias;
    }

    public static void setTiempoMedioAsistencia(int tiempoMedioAsistencia) {
        this.tiempoMedioAsistencia = tiempoMedioAsistencia;
    }

    public String getNombre() {
        return nombre;
    }

    public static int getNumAmbulancias() {
        return numAmbulancias;
    }

    public static int getTiempoMedioAsistencia() {
        return tiempoMedioAsistencia;
    }

    public static void agregarBaseSimple(Builder baseSimple) {
        basesSimples.add(baseSimple);
    }

    public void removerBaseSimple(Builder baseSimple) {
        basesSimples.remove(baseSimple);
    }

    public int getNumAmbulanciasCompuesta() {
        int numAmbulanciasCompuesta = numAmbulancias;
        for (Builder baseSimple : basesSimples) {
            numAmbulanciasCompuesta += baseSimple.getNumAmbulancias();
        }
        return numAmbulanciasCompuesta;
    }

    public int getTiempoMedioAsistenciaCompuesta() {
        int tiempoMedioAsistenciaCompuesta = tiempoMedioAsistencia;
        for (Builder baseSimple : basesSimples) {
            tiempoMedioAsistenciaCompuesta = (tiempoMedioAsistenciaCompuesta + baseSimple.getTiempoMedioAsistencia()) / 2;
        }
        return tiempoMedioAsistenciaCompuesta;
    }
}


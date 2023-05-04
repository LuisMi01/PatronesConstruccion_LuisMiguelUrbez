package org.example;

import org.example.Builder.CarBuilder;
import org.example.Builder.CarManualBuilder;
import org.example.ambulancias.Ambulancia;
import org.example.ambulancias.Manual;
import org.example.director.Director;

public class Main {
public static void main(String[] args) {
    Director director = new Director();
    CarBuilder builder = new CarBuilder();
    director.constructSportsCar(builder);

    // The final product is often retrieved from a builder object, since
    // Director is not aware and not dependent on concrete builders and
    // products.
    Ambulancia car = builder.getResult();
    System.out.println("Car built: Ambulancia");


    CarManualBuilder manualBuilder = new CarManualBuilder();

    // Director may know several building recipes.
    director.constructSportsCar(manualBuilder);
    Manual carManual = manualBuilder.getResult();
    System.out.println("\nCar manual built:\n" + carManual.print());
}
}

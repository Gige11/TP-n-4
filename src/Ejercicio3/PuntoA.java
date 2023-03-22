package Ejercicio3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PuntoA {

    public static void main(String[] args) throws IOException {

        String ruta = "src/Ejercicio3/Nombres.txt";

        int contador = 1;
        for (String linea : Files.readAllLines(Paths.get(ruta))){
            System.out.println(contador + "-" + linea);
            contador++;
        }
    }
}

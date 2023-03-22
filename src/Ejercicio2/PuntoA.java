package Ejercicio2;

import java.io.IOException;
import java.nio.file.*;

public class PuntoA {
    public static void main(String[] args) throws IOException {

        String ruta = "src/Ejercicio2/Numeros.txt";


        System.out.println("El resultado de la multiplicacion es= "+operarValores(ruta,false));

    }
    public static int operarValores(String ruta, boolean suma) throws IOException {

            int resultado;

            if(suma == true){
                resultado = 0;
            }else {
                resultado = 1;
            }

            for (String linea : Files.readAllLines(Paths.get(ruta))){
                if (suma ==true){
                    resultado = resultado + Integer.parseInt(linea);
                }
               else{
                    resultado = resultado * Integer.parseInt(linea);
                }
            }

        return resultado;

    }

}

package Ejercicio1;

import java.util.Scanner;

public class PuntoC {
    public static void main(String[] args) {

        //Prueba sin numeros
        int[] numeros = new int[3];
        Character orden = 'g';

        AnalizarArreglo(numeros,orden);

        //Prueba con numeros
        int[] numeros2 = {8,3,5};
        Character orden2 = 'd';

        AnalizarArreglo(numeros2,orden2);
    }

    public static void AnalizarArreglo(int[] numeros, Character orden){

        Scanner consola = new Scanner(System.in);

        if(numeros[0] == 0){
            System.out.println("Ingrese el primer numero: ");
            int num1 = consola.nextInt();
            numeros[0] = num1;
        }
        if (numeros[1] == 0){
            System.out.println("Ingrese el segundo numero: ");
            int num2 = consola.nextInt();
            numeros[1] = num2;
        }
        if (numeros[2] == 0){
            System.out.println("Ingrese el tercer numero: ");
            int num3 = consola.nextInt();
            numeros[2] = num3;
        }
        if (orden != 'a' && orden != 'd'){
            System.out.println("Ingrese la letra 'a' para ordenar de forma ascendente y 'd' para forma descendente");
            orden = consola.next().charAt(0);
        }
        ordenarNumeros(numeros,orden);
    }
    public static void ordenarNumeros(int[] numeros, char orden){
        int aux;
        if(orden == 'a'){
            for (int i = 0; i < numeros.length - 1; i++) {
                for (int j = 0; j < numeros.length - i - 1; j++) {
                    if (numeros[j + 1] < numeros[j]) {
                        aux = numeros[j + 1];
                        numeros[j + 1] = numeros[j];
                        numeros[j] = aux;
                    }
                }
            }
        }else if (orden == 'd'){
            for (int i = 0; i < numeros.length - 1; i++) {
                for (int j = 0; j < numeros.length - i - 1; j++) {
                    if (numeros[j + 1] > numeros[j]) {
                        aux = numeros[j + 1];
                        numeros[j + 1] = numeros[j];
                        numeros[j] = aux;
                    }
                }
            }
        }else {
            System.out.println("La letra ingresada es incorrecta");
        }
        System.out.println("El vector ordenado es: ");
        for (int x = 0; x < numeros.length; x++){
            System.out.println(numeros[x]);
        }
    }
}

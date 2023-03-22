package Ejercicio1;
import java.util.Scanner;

public class PuntoB {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int num1 = consola.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = consola.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int num3 = consola.nextInt();
        System.out.println("Ingrese la letra A para ordenar de forma ascendente y D para forma descendente");
        char orden = consola.next().charAt(0);

        int numeros[] = {num1,num2,num3};
        ordenarNumeros(numeros,orden);

    }

    public static void ordenarNumeros(int numeros[], char orden){

        int aux;

        if(orden == 'd'){
            for (int i = 0; i < numeros.length - 1; i++) {
                for (int j = 0; j < numeros.length - i - 1; j++) {
                    if (numeros[j + 1] < numeros[j]) {
                        aux = numeros[j + 1];
                        numeros[j + 1] = numeros[j];
                        numeros[j] = aux;
                    }
                }
            }
        }else if (orden == 'a'){
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

        for (int x = 0; x < numeros.length; x++){
            System.out.println(numeros[x]);
        }
    }
}

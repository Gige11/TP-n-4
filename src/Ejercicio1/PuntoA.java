package Ejercicio1;

public class PuntoA {

    public static void main(String[] args) {

        int numeros[] = {10,3,7};
        char orden = 'a';

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

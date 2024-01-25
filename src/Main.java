
import java.util.Random;
import java.util.Scanner;

public class Main {

    /*es la firma del método principal (main method) que se utiliza como punto de entrada para la ejecución de un programa.*/
    public static void main(String[] args)
    {

        /*Crear programa solicitará al usuario que ingrese el elemento a buscar por consola. Luego, realizará la búsqueda y mostrará si el elemento fue encontrado o no. */
        Scanner scan = new Scanner(System.in);

        // Solicitar al usuario que ingrese el tamaño del array
        System.out.print("Ingrese el tamaño del array: ");
        int tamanoArray = scan.nextInt();

        // Crear un array de enteros con el tamaño especificado por el usuario
        int[] numers = new int[tamanoArray];

        // Rellenar el array solicitando al usuario que ingrese valores para cada posición
        for (int i = 0; i < numers.length; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            numers[i] = scan.nextInt();
        }
        // Solicitar al usuario que ingrese el elemento a buscar
        System.out.print("Ingrese el elemento a buscar: ");
        int elementoBuscado = scan.nextInt();

        // Variable para indicar si el elemento fue encontrado o no
        boolean encontrado = false;

        // Bucle para buscar el elemento en el array
        for (int i = 0; i < numers.length; i++) {
            if (numers[i] == elementoBuscado) {
                encontrado = true;
                break;
            }
        }

        // Mostrar si el elemento fue encontrado o no
        if (encontrado) {
            System.out.println("El elemento " + elementoBuscado + " fue encontrado.");
        } else {
            System.out.println("El elemento " + elementoBuscado + " no fue encontrado.");
        }//

        // Cerrar el scanner al finalizar su uso
        scan.close();

       /*Suma de elementos en un arreglo:
Este programa calcula la suma de todos los elementos en un arreglo.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números:");
        int cantidadNumeros = scanner.nextInt();

        int[] numeros = new int[cantidadNumeros];
        int suma = 0;
        int indice = 0;

        while (indice < cantidadNumeros) {
            System.out.println("Ingrese el número " + (indice + 1) + ":");
            numeros[indice] = scanner.nextInt();
            suma += numeros[indice];
            indice++;
        }

        System.out.println("La suma es: " + suma);

        // Cerrar el scanner al finalizar
        scanner.close();


        /*Bucle do-while para calcular la suma de números hasta que el usuario decida parar.*/
        // Crear un objeto Scanner para la entrada de usuario
        Scanner sc = new Scanner(System.in);

        // Inicializar variables para almacenar la suma y el número ingresado por el usuario
        int sum = 0;
        int number;

        // Iniciar el bucle do-while que continuará hasta que el usuario ingrese 0
        do {
            // Solicitar al usuario que ingrese un número
            System.out.print("Ingresa un número (o 0 para detener): ");

            // Leer el número ingresado por el usuario
            number = sc.nextInt();

            // Acumular el número ingresado en la suma total
            sum += number;

            // Continuar el bucle si el número ingresado no es 0
        } while (number != 0);

        // Imprimir la suma total una vez que el usuario decide detenerse
        System.out.println("La suma total es: " + sum);

        // Cerrar el objeto Scanner para evitar pérdida de recursos
        sc.close();

        /**/
        // Declaración e inicialización de un array de enteros
        int[] numbers = {2, 4, 6, 8, 10};

        // Utilización del bucle for-each para elevar al cuadrado cada elemento y mostrar el resultado
        System.out.println("Elementos del array elevados al cuadrado:");
        for (int numero : numbers) {
            int cuadrado = numero * numero;
            System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
        }
      }
    }

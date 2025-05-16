package cifrado_lab;

import java.util.Scanner;

public class Cifrado_lab {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");
        int opcion = 0;

        //Menú opciones
        while (opcion != 4) {
            System.out.println("---MENU---");
            System.out.println("1. Cifrado César");
            System.out.println("2. Filtrar");
            System.out.println("3. Código Enigma");
            System.out.println("4. Salir del programa");

            System.out.print("Ingrese la opción que desea ingresar: ");
            opcion = scanner.nextInt();
            switch (opcion) {

                case 1:

                    //Se almacena una variable con las letras del alfabeto para usar el índice del string en el ciclo for
                    String abecedarioMayuscula = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                    String abecedarioMinuscula = "abcdefghijklmnopqrstuvwxyz";

                    String mensajeCifrado = "";
                    String mensajeOriginal;

                    int desplazamiento,
                     tamanioMensaje,
                     posicionOriginal,
                     posicionNueva;

                    System.out.print("Favor ingrese una frase: ");
                    mensajeOriginal = scanner.next();

                    System.out.print("Favor ingrese cuantos espacios deseas que se desplaze: ");
                    desplazamiento = scanner.nextInt();

                    //Se resta 1 ya que empieza a contar desde 1 y no de 0
                    tamanioMensaje = mensajeOriginal.length() - 1;

                    for (int i = 0; i <= tamanioMensaje; i++) {
                        char posicionCaracter = mensajeOriginal.charAt(i);

                        if (abecedarioMayuscula.indexOf(posicionCaracter) != -1) { //En caso de ser mayúscula se usa el string del abecedario mayúscula
                            posicionOriginal = abecedarioMayuscula.indexOf(posicionCaracter);
                            posicionNueva = (posicionOriginal + desplazamiento) % 26; //Se usa %26 para no exceder los límites del string y retornar al principio de ser necesario
                            mensajeCifrado += abecedarioMayuscula.charAt(posicionNueva);

                        } else if (abecedarioMinuscula.indexOf(posicionCaracter) != -1) { //Se verifica lo mismo que el anterior, pero en minúscula
                            posicionOriginal = abecedarioMinuscula.indexOf(posicionCaracter);
                            posicionNueva = (posicionOriginal + desplazamiento) % 26;
                            mensajeCifrado += abecedarioMinuscula.charAt(posicionNueva);

                        } else { //Si no se encontró el char en ninguno de los 2 string, se conserva el char
                            mensajeCifrado += posicionCaracter;
                        }
                    }

                    System.out.print("Menaje cifrado: ");
                    System.out.println(mensajeCifrado);
                    break;
                case 2:
                    System.out.println("---Filtrar---");
                    System.out.println("Ingrese una frase completa de su preferencia");
                    String FraseUsuario = scanner.next();
                    System.out.println("ingrese un numero entero positivo");
                    while (numerocesar <= 0) {
                        numerocesar = scanner.nextInt();
                        if (numerocesar <= 0) {
                            System.out.println("su numero no es valido");
                            System.out.println("ingrese un numero valido");
                        }
                    }
                    break;
                case 3:

                    break;
                default:
                    System.out.println("su opcion no e s valida, ingrese una funcion existente");
                    break;

            }

        }

        System.out.println("Ingrese una frase de su preferencia;");
        String oracionUsuario = scanner.next();

    }

}

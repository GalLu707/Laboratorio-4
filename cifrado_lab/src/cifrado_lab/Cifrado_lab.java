package cifrado_lab;

import java.util.Scanner;

public class Cifrado_lab {

    public static void main(String[] args) {

        int numerocesar = 0;
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("---MENU---");
            System.out.println("1. cifrado");
            System.out.println("2. Filtrar");
            System.out.println("3. Codigo Enigma");
            System.out.println("4. Salir del programa");

            System.out.println("ingrese a la opcion que desea ingresar:");
            opcion = scanner.nextInt();
            switch (opcion) {

                case 1:
                    String abecedarioMayuscula = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //Se almacena una variable con las letras del alfabeto para usar el índice del string en el ciclo for
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

                    tamanioMensaje = mensajeOriginal.length() - 1;

                    for (int i = 0; i <= tamanioMensaje; i++) {
                        char posicionCaracter = mensajeOriginal.charAt(i);

                        if (abecedarioMayuscula.indexOf(posicionCaracter) != -1) {
                            posicionOriginal = abecedarioMayuscula.indexOf(posicionCaracter);
                            posicionNueva = (posicionOriginal + desplazamiento) % 26;
                            mensajeCifrado += abecedarioMayuscula.charAt(posicionNueva);
                        } else if (abecedarioMinuscula.indexOf(posicionCaracter) != -1) {
                            posicionOriginal = abecedarioMinuscula.indexOf(posicionCaracter);
                            posicionNueva = (posicionOriginal + desplazamiento) % 26;
                            mensajeCifrado += abecedarioMinuscula.charAt(posicionNueva);
                        } else {
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

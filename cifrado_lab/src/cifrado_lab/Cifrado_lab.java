package cifrado_lab;

import java.util.Scanner;

public class Cifrado_lab {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        int opcion = 0;

        //Menú opciones
        while (opcion != 4) {
            System.out.println("---MENU---");
            System.out.println("1. Cifrado César");
            System.out.println("2. Filtrar");
            System.out.println("3. Código Enigma");
            System.out.println("4. Salir del programa");

            System.out.println("Ingrese la opción que desea ingresar: ");
            opcion = scanner.nextInt();
            switch (opcion) {

                case 1:
                    System.out.println("---CIFRADO CESAR---");

                    //Se almacena una variable con las letras del alfabeto para usar el índice del string en el ciclo for
                    String abecedarioMayuscula = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                    String abecedarioMinuscula = "abcdefghijklmnopqrstuvwxyz";

                    String mensajeCifrado = "";
                    String mensajeOriginal;

                    int desplazamiento,
                     tamanioMensaje,
                     posicionOriginal,
                     posicionNueva;

                    System.out.println("Favor ingrese una frase: \n");
                    mensajeOriginal = scanner.next();

                    System.out.println("Favor ingrese cuantos espacios deseas que se desplaze: \n");
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

                    System.out.println("Menaje cifrado: ");
                    System.out.println(mensajeCifrado);
                    break;
                case 2:
                    System.out.println("---FILTRAR---");
                    String frase,
                     palabraEvaluar;

                    int longitudMinima,
                     longitudFrase;

                    System.out.print("Favor ingrese una frase: ");
                    frase = scanner.next();

                    System.out.print("Favor ingrese la longitud mínima para imprimir: ");
                    longitudMinima = scanner.nextInt();

                    palabraEvaluar = "";
                    frase += " "; //se agrega un espacio para que detecte la última palabra

                    longitudFrase = frase.length() - 1;

                    for (int i = 0; i <= longitudFrase; i++) { //for para crear la palabra a evaluar a partir de la variable frase
                        char caracterFrase = frase.charAt(i);
                        if (caracterFrase != ' ') { //se asume que un espacio da fin a una palabra
                            if (".,:;¿?¡!".indexOf(caracterFrase) == -1) { //se evalua si caracterFrase contiene un signo de puntuación para así no añadirlo
                                palabraEvaluar += caracterFrase;
                            }
                        } else {
                            if (palabraEvaluar.length() > longitudMinima) {
                                System.out.println(palabraEvaluar);
                            }
                            palabraEvaluar = ""; //se reinicia la variable para continuar con la frase siguiente
                        }
                    }
                    break;
                case 3:

                    int menuEnigma = 0,
                     cantidadPares,
                     longitudTexto;

                    String textoIngresado, textoEncriptado, textoDesencriptado, mitadPares, mitadImpares;

                    System.out.println("---Código Enigma---");

                    while (menuEnigma != 3) {
                        System.out.println("--MENU--");
                        System.out.println("1. Encriptar texto");
                        System.out.println("2. Desencriptar texto");
                        System.out.println("3. regresar ");

                        System.out.print("Ingrese la opcion a la que desea ingresar: ");
                        menuEnigma = scanner.nextInt();

                        switch (menuEnigma) {
                            case 1:
                                System.out.println("---Encriptar Texto---");
                                System.out.print("Ingrese un texto a encriptar: ");
                                textoIngresado = scanner.next();

                                textoEncriptado = "";

                                longitudTexto = textoIngresado.length();

                                for (int i = 0; i < longitudTexto; i++) {
                                    if (i % 2 == 0) {
                                        textoEncriptado += textoIngresado.charAt(i);
                                    }
                                }

                                for (int i = 0; i < longitudTexto; i++) {
                                    if (i % 2 != 0) {
                                        textoEncriptado += textoIngresado.charAt(i);
                                    }
                                }

                                System.out.println("Texto encriptado: " + textoEncriptado);
                                break;

                            case 2:
                                System.out.println("---Desencriptar Texto---");
                                System.out.print("Ingrese un texto a desencriptar: ");
                                textoIngresado = scanner.next();

                                textoDesencriptado = "";

                                longitudTexto = textoIngresado.length();

                                cantidadPares = (longitudTexto + 1) / 2;

                                mitadPares = textoIngresado.substring(0, cantidadPares);
                                mitadImpares = textoIngresado.substring(cantidadPares);

                                for (int i = 0; i < longitudTexto; i++) {
                                    if (i % 2 == 0) {
                                        textoDesencriptado += mitadPares.charAt(i / 2);
                                    } else {
                                        textoDesencriptado += mitadImpares.charAt(i / 2);
                                    }
                                }

                                System.out.println("Texto desencriptado: " + textoDesencriptado);

                                break;
                            case 3:
                                System.out.println("Saliendo de codigo enigma :)");
                                break;
                            default:
                                System.out.println("Opción no válida. Ingrese una opción existente: ");
                                break;
                        }
                    }

                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Su opción no es válida. Ingrese una opción existente: ");
                    break;

            }

        }
    }

}

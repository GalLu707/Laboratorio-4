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
                    System.out.println("---CIFRADO---");

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

                    System.out.println("Favor ingrese una frase: \n");
                    frase = scanner.next();

                    System.out.println("Favor ingrese la longitud mínima para imprimir: \n");
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
                    
                    System.out.println("---Codigo Enigma---");
                    while(minimenu!=3){
                     System.out.println("--MENU--");
                    System.out.println("a. Encriptar texto");
                    System.out.println("b. Desencriptar texto");
                    System.out.println("c. regresar ");
                    
                    System.out.println("ingrese la opcion a la que desea ingresar");
                    string minimenu= scanner.nextInt();
                    switch(minimenu!= "c"){
                            case "a":
                                System.out.println("---encriptar texto---");
                                
                                
                                break;
                            case "b":
                                System.out.println("---desencriptar texto---");
                                
                                
                                break;     
                            case "c":
                                System.out.println("saliendo de codigo enigma :)");
                                break;
                            default: 
                                System.out.println("opcion no valida");
                                break;   
                    }
                    }
                    
                    

                    break;
                case 4: 
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Su opción no es válida. Ingrese una función existente: ");
                    break;

            }

        }
    }

}

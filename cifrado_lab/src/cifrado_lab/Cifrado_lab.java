/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cifrado_lab;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Cifrado_lab {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

    int numerocesar=0;
    Scanner obj= new Scanner(System.in);
    obj.useDelimiter("\\n");
   int opcion=0;
    while(opcion!= 4){
        System.out.println("---MENU---");
        System.out.println("1. cifrado");
        System.out.println("2. Filtrar");
        System.out.println("3. Codigo Enigma");
        System.out.println("4. Salir del programa");

        System.out.println("ingrese a la opcion que desea ingresar:");
        opcion= obj.nextInt();
        switch(opcion){

            case 1:
                System.out.println("hola");
                break;
            case 2:
                System.out.println("---Filtrar---");
                System.out.println("Ingrese una frase completa de su preferencia");
                String FraseUsuario= obj.next();
                 System.out.println("ingrese un numero entero positivo");
    while (numerocesar<=0){
         numerocesar=obj.nextInt();
    if(numerocesar<=0){
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
    String oracionUsuario = obj.next();

    }
    
}

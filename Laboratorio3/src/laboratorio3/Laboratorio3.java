/*Programa que muestra la lista de Jugadores con sus respectivos datos.
 */
package laboratorio3;

import java.util.Scanner;

/**
 * @author Dennis Leo
 */
public class Laboratorio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Scanner entrada = new Scanner(System.in);
        //Variables
        String cadena= "";
        String nombre = "";
        String apellido = "";
        String valorU = "";
        int contador = 0;
        int goles = 0;
        int tGoles = 0;
        double sueldo = 0;
        double tsueldo = 0;
        double sueldoS = 0;
        boolean bandera = true;
        System.out.println("LISTA DE JUGADORES");
        //Utilizando String.format
        cadena = String.format("%s%s\n", cadena,
                "REPORTE DE LISTA DE JUGADORES >>\nNombre\t\tApellido\t\tGoles"
                        + "\t\tSueldo");
        //Ciclo while
        while (bandera == true) {
            
            contador = contador +1;//contador
            //Ingresar datos
            System.out.println("Ingrese su nombre:");
            nombre = entrada.nextLine();//Datos ingresados por usuario

            System.out.println("Ingrese su apellido:");
            apellido = entrada.nextLine();//Datos ingresados por usuario
            
            System.out.println("Ingrese los goles:");
            goles = entrada.nextInt();//Datos ingresados por usuario
            tGoles = tGoles + goles;//Suma de goles
            
            System.out.println("Ingrese el sueldo:");
            sueldo = entrada.nextDouble();
            sueldoS = sueldoS + sueldo;//Suma de sueldo
            tsueldo =  sueldoS / contador ;//Promedio de sueldo
                                   
            cadena = String.format("%s%s\t\t%s\t\t%d\t\t%.2f$\n", cadena, 
                    nombre, apellido, goles, sueldo);
                        
            entrada.nextLine();//Limpiar Buffer
            //Opción de usuario 
            //si desea ingresar a otro jugador o mostrar reporte
            System.out.println("Ingrese (n) si desea agregar a otro jugador o "
                    + "(r) si desea mostrar el reporte: ");
            valorU = entrada.nextLine();
            if (valorU.equals("n")) {
                bandera = true;
            } else {
                if (valorU.equals("r")) {
                    bandera = false;
                }
            }
        }
        //Mostrar Datos
        cadena = String.format("%sTotal Goles= %d\nPromedio Sueldo= %.2f", 
                cadena, tGoles, tsueldo);
        System.out.printf("%s", cadena);
    }
}

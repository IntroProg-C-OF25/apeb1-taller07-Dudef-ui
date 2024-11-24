/***
 * Generar una solución que permita ingresar jugadores de fútbol; por cada jugador se debe solicitar: Nombre el jugador, 
 * Posición en el campo de juego, Edad, Estatura.
 * El ciclo de ingreso de información deberá terminar cuando el usuario lo decida. Se debe imprimir el siguiente reporte 
 * (usar una cadena de acumulación):
 * Listado de Jugadores
 * 1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
 * 2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
 * 3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
 * 4. Ángel Mena -Delantero-, edad 32, estatura 1.75
 * 5. Michael Estrada -Delantero-, edad 27, estatura 1.93
 * Promedio de edades:  26.8
 * Promedio de estaturas: 1.87
 */
import java.util.Scanner;
public class Ejercicio4_JugadoresFutbol {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        StringBuilder recopilacion = new StringBuilder("");
        String nombre, posicion, seguir;
        int edad = 0, ciclos = 0;
        double estatura = 0, promedad = 0, promestatura = 0;
        do{
            System.out.print("DIME EL NOMBRE DEL JUGADOR: ");
                nombre = teclado.nextLine();
            System.out.print("DIME LA POSICION EN EL CAMPO DEL JUGADOR: ");
                posicion = teclado.nextLine();
            System.out.print("DIME LA EDAD DEL JUGADOR: ");
                edad = teclado.nextInt();
            System.out.print("DIME LA ESTATURA DEL JUGADOR(EN METROS): ");
                estatura = teclado.nextDouble();
                teclado.nextLine();
                promedad+=edad;
                promestatura+=estatura;
            ciclos++;
            //USE LA CLASE STRING BUILDER 23/11/2024
            recopilacion.append(ciclos).append("- ").append(nombre).append(" -").append(posicion).append("-, ")
            .append(" EDAD  ").append(edad).append(", ESTATURA  ").append(estatura).append("\n");
            System.out.println("¿QUIERES INGRESAR LOS DATOS DE OTRO JUGADOR? ");
            seguir = teclado.nextLine();
        }while(seguir.equalsIgnoreCase("SI"));
        //PROMEDIOS FUERA DEL CICLO PARA QUE NO SE DIVIDAN VARIAS VECES ALTERANDO EL RESULTADO
            promedad = (promedad)/ciclos;
            promestatura = (promestatura)/ciclos;
            System.out.println(recopilacion.toString());
            System.out.println("PROMEDIO EDADES: " + promedad);
            System.out.println("PROMEDIO ESTATURA: " + promestatura);
    }
}
/***
 * run:
 * DIME EL NOMBRE DEL JUGADOR: Alexander Dominguez
 * DIME LA POSICION EN EL CAMPO DEL JUGADOR: Arquero
 * DIME LA EDAD DEL JUGADOR: 32
 * DIME LA ESTATURA DEL JUGADOR(EN METROS): 1.95
 * ¿QUIERES INGRESAR LOS DATOS DE OTRO JUGADOR? 
 * si
 * DIME EL NOMBRE DEL JUGADOR: Xavier Arreaga
 * DIME LA POSICION EN EL CAMPO DEL JUGADOR: Defensa
 * DIME LA EDAD DEL JUGADOR: 24
 * DIME LA ESTATURA DEL JUGADOR(EN METROS): 1.85
 * ¿QUIERES INGRESAR LOS DATOS DE OTRO JUGADOR? 
 * si
 * DIME EL NOMBRE DEL JUGADOR: Moisés Caicedo
 * DIME LA POSICION EN EL CAMPO DEL JUGADOR: Mediocentro
 * DIME LA EDAD DEL JUGADOR: 19
 * DIME LA ESTATURA DEL JUGADOR(EN METROS): 1.88
 * ¿QUIERES INGRESAR LOS DATOS DE OTRO JUGADOR? 
 * si
 * DIME EL NOMBRE DEL JUGADOR: Ángel Mena
 * DIME LA POSICION EN EL CAMPO DEL JUGADOR: Delantero
 * DIME LA EDAD DEL JUGADOR: 32
 * DIME LA ESTATURA DEL JUGADOR(EN METROS): 1.75
 * ¿QUIERES INGRESAR LOS DATOS DE OTRO JUGADOR? 
 * si
 * DIME EL NOMBRE DEL JUGADOR: Michael Estrada
 * DIME LA POSICION EN EL CAMPO DEL JUGADOR: Delantero
 * DIME LA EDAD DEL JUGADOR: 27
 * DIME LA ESTATURA DEL JUGADOR(EN METROS): 1.93
 * ¿QUIERES INGRESAR LOS DATOS DE OTRO JUGADOR? 
 * no
 * 1- Alexander Dominguez -Arquero-,  EDAD  32, ESTATURA  1.95
 * 2- Xavier Arreaga -Defensa-,  EDAD  24, ESTATURA  1.85
 * 3- Moisés Caicedo -Mediocentro-,  EDAD  19, ESTATURA  1.88
 * 4- Ángel Mena -Delantero-,  EDAD  32, ESTATURA  1.75
 * 5- Michael Estrada -Delantero-,  EDAD  27, ESTATURA  1.93
 * PROMEDIO EDADES: 26.8
 * PROMEDIO ESTATURA: 1.8719999999999999
 * BUILD SUCCESSFUL (total time: 1 minute 36 seconds)
 */
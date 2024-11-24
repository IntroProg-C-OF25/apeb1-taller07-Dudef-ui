/***
 * Problema 5
 * Generar un programa Java que permita ingresar 4 estudiantes; por cada uno de ellos ingresar el nombre del estudiante, el promedio de ciclo. 
 * Presentar el siguiente reporte
 * Estudiante 1	10	Aprobado
 * Estudiante 2	6.9	Reprobado
 * Estudiante 3	7	Aprobado
 * Estudiante 4	5	Reprobado
 * Atención; con base al valor del promedio, usted debe asignar en cada registro el tipo Aprobado o Reprobado.
 */

import java.util.Scanner;
public class Problema5_ReporteEstudiantes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre, estado;
        double prom;
        int cont = 1;
        while(cont <= 4){
            System.out.print("DAME EL NOMBRE DEL ESTIDUANTE N" + cont +": ");
            nombre = teclado.next();
            System.out.print("DAME EL PROMEDIO DEL ESTUDIANTE N" + cont + ": ");
            prom = teclado.nextDouble();
            teclado.nextLine();
            if (prom < 7){
                estado = "Reprobado";
                System.out.printf("| %s\t| %s\t| %s\t\n", "NOMBRE ", "PROMEDIO", "ESTADO" );
                System.out.printf("| %s\t        | %.2f\t\t| %s\t", nombre, prom, estado);
            cont++; 
                System.out.println("");
            }else{
                estado = "Aprovado";
                System.out.printf("| %s\t| %s\t| %s\t\n", "NOMBRE ", "PROMEDIO", "ESTADO" );
                System.out.printf("| %s\t        | %.2f\t\t| %s\t", nombre, prom, estado);
            cont++; 
                System.out.println("");
            }
        }
    }
}
/***
 * run:
 * DAME EL NOMBRE DEL ESTIDUANTE N1: NOMBRE1
 * DAME EL PROMEDIO DEL ESTUDIANTE N1: 10
 * | NOMBRE 	| PROMEDIO	| ESTADO	
 * | NOMBRE1	        | 10.00		| Aprovado	
 * DAME EL NOMBRE DEL ESTIDUANTE N2: NOMBRE2
 * DAME EL PROMEDIO DEL ESTUDIANTE N2: 6.5
 * | NOMBRE 	| PROMEDIO	| ESTADO	
 * | NOMBRE2	        | 6.50		| Reprobado	
 * DAME EL NOMBRE DEL ESTIDUANTE N3: NOMBRE3
 * DAME EL PROMEDIO DEL ESTUDIANTE N3: 7
 * | NOMBRE 	| PROMEDIO	| ESTADO	
 * | NOMBRE3	        | 7.00		| Aprovado	
 * DAME EL NOMBRE DEL ESTIDUANTE N4: NOMBRE4
 * DAME EL PROMEDIO DEL ESTUDIANTE N4: 5
 * | NOMBRE 	| PROMEDIO	| ESTADO	
 * | NOMBRE4	        | 5.00		| Reprobado	
 * BUILD SUCCESSFUL (total time: 36 seconds)
 */
/***
 * Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados. Por cada empleado se debe solicitar el nombre, 
 * numero de días trabajados y costo del día trabajo. Calcular el valor a cancelar por la empresa para cada empleado. 
 * Presentar un reporte como el siguiente:
 * Nombre 1	10	$2.5	$25
 * Nombre 2	11	$2	$22
 * Nombre 3	9	$3	$27
 * Nombre 4	5	$4	$20
 * Nombre 5	12	$2	$24
 */
import java.util.Scanner;
public class Problema3_Empleados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 1;
        double nDias = 0, costoDias = 0, valort = 0;
        String nombre;
        while(cont <= 5){
            System.out.print("DIME EL NOMBRE DEL EMPLEADO N" + cont + ": " );
            nombre = teclado.nextLine();
            System.out.print("DIME LA CANTIDAD DE DIAS TRBAJADOS: ");
            nDias = teclado.nextDouble();
            System.out.print("DIME EL VALOR DEL DIA DE TRABAJO: ");
            costoDias = teclado.nextDouble();
            teclado.nextLine();
            valort = nDias * costoDias;
            cont++;
            System.out.printf("|%s\t | %s| %s | %s \n", "NOMBRE", "DIAS TRABAJADOS", "COSTO POR DIA", "VALOR A PAGAR");
            System.out.printf("|%s | %.2f\t  | %.2f\t  | %.2f\t\n ", nombre, nDias, costoDias, valort);
            System.out.println("");
        }
    }
}
/***
 * run:
 * DIME EL NOMBRE DEL EMPLEADO N1: NOMBRE1
 * DIME LA CANTIDAD DE DIAS TRBAJADOS: 10
 * DIME EL VALOR DEL DIA DE TRABAJO: 2.5
 * |NOMBRE	 | DIAS TRABAJADOS| COSTO POR DIA | VALOR A PAGAR 
 * |NOMBRE1 | 10.00	  | 2.50	  | 25.00
 * 
 * DIME EL NOMBRE DEL EMPLEADO N2: NOMBRE2
 * DIME LA CANTIDAD DE DIAS TRBAJADOS: 11
 * DIME EL VALOR DEL DIA DE TRABAJO: 2
 * |NOMBRE	 | DIAS TRABAJADOS| COSTO POR DIA | VALOR A PAGAR 
 * |NOMBRE2 | 11.00	  | 2.00	  | 22.00
 * 
 * DIME EL NOMBRE DEL EMPLEADO N3: NOMBRE3
 * DIME LA CANTIDAD DE DIAS TRBAJADOS: 9
 * DIME EL VALOR DEL DIA DE TRABAJO: 3
 * |NOMBRE	 | DIAS TRABAJADOS| COSTO POR DIA | VALOR A PAGAR 
 * |NOMBRE3 | 9.00	  | 3.00	  | 27.00
 * 
 * DIME EL NOMBRE DEL EMPLEADO N4: NOMBRE4
 * DIME LA CANTIDAD DE DIAS TRBAJADOS: 5
 * DIME EL VALOR DEL DIA DE TRABAJO: 4
 * |NOMBRE	 | DIAS TRABAJADOS| COSTO POR DIA | VALOR A PAGAR 
 * |NOMBRE4 | 5.00	  | 4.00	  | 20.00	
 * 
 * DIME EL NOMBRE DEL EMPLEADO N5: NOMBRE5
 * DIME LA CANTIDAD DE DIAS TRBAJADOS: 12
 * DIME EL VALOR DEL DIA DE TRABAJO: 2
 * |NOMBRE	 | DIAS TRABAJADOS| COSTO POR DIA | VALOR A PAGAR 
 * |NOMBRE5 | 12.00	  | 2.00	  | 24.00	
 * 
 * BUILD SUCCESSFUL (total time: 1 minute 53 seconds)
 */
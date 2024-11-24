/***
 * Una empresa de comercialización de computadoras realiza el proceso de venta haciendo un descuento por tipo de cliente: 
 * Si es cliente tipo 1 hay un descuento del 10% Si es cliente tipo 2 hay un descuento del 20% En caso que sea otro tipo de cliente, no hay descuento. 
 * Generar un proceso que permita ingresar 7 ventas: por cada venta preguntar los siguiente datos:
 * Nombre del cliente
 * Costo de la computadora (solo se vende una computadora por transacción)
 * Tipo de cliente Presentar el siguiente reporte: Cliente tipo 1, compra computadora con precio $100
 */
import java.util.Scanner;
public class Problema6_EmpresaComputadores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        double costo = 0;
        int tipocliente = 0, cont = 1;
        do{
            System.out.print("DIME EL NOMBRE DEL CLIENTE: ");
                nombre = teclado.nextLine();
            System.out.print("DIME EL COSTO DE LA COMPUTADORA: ");
                costo = teclado.nextDouble();
            System.out.print("DIME EL TIPO DE CLIENTE: ");
                tipocliente = teclado.nextInt();
            teclado.nextLine();
            if(tipocliente == 1){
                costo = costo * 0.9;
            }else if(tipocliente == 2){
                costo = costo * 0.8;
            }
            //System.out.printf("%s\t %s\t %.0f\t %s\t %.2f\t\n", nombre,"TIPO",tipocliente,"COMPRA COMPUTADORA CON PRECIO: ", costo);
            System.out.println( cont + "." + nombre + " Cliente tipo: " + tipocliente + " COMPRA COMPUTADORA CON PRECIO: " + costo ); 
            cont++;
        }while(cont <= 7);        
    }
}
/***
 * run:
 * 
 * DIME EL NOMBRE DEL CLIENTE: Cliente1
 * DIME EL COSTO DE LA COMPUTADORA: 111
 * DIME EL TIPO DE CLIENTE: 1
 * 1.Cliente1 Cliente tipo: 1 COMPRA COMPUTADORA CON PRECIO: 99.9
 * DIME EL NOMBRE DEL CLIENTE: Cliente2
 * DIME EL COSTO DE LA COMPUTADORA: 200
 * DIME EL TIPO DE CLIENTE: 2
 * 2.Cliente2 Cliente tipo: 2 COMPRA COMPUTADORA CON PRECIO: 160.0
 * DIME EL NOMBRE DEL CLIENTE: Cliente3
 * DIME EL COSTO DE LA COMPUTADORA: 111
 * DIME EL TIPO DE CLIENTE: 3
 * 3.Cliente3 Cliente tipo: 3 COMPRA COMPUTADORA CON PRECIO: 111.0
 * DIME EL NOMBRE DEL CLIENTE: Cliente4
 * DIME EL COSTO DE LA COMPUTADORA: 300
 * DIME EL TIPO DE CLIENTE: 1
 * 4.Cliente4 Cliente tipo: 1 COMPRA COMPUTADORA CON PRECIO: 270.0
 * DIME EL NOMBRE DEL CLIENTE: Cliente5
 * DIME EL COSTO DE LA COMPUTADORA: 500
 * DIME EL TIPO DE CLIENTE: 2
 * 5.Cliente5 Cliente tipo: 2 COMPRA COMPUTADORA CON PRECIO: 400.0
 * DIME EL NOMBRE DEL CLIENTE: Cliente6
 * DIME EL COSTO DE LA COMPUTADORA: 600
 * DIME EL TIPO DE CLIENTE: 0
 * 6.Cliente6 Cliente tipo: 0 COMPRA COMPUTADORA CON PRECIO: 600.0
 * DIME EL NOMBRE DEL CLIENTE: Cliente7
 * DIME EL COSTO DE LA COMPUTADORA: 700
 * DIME EL TIPO DE CLIENTE: 2
 * 7.Cliente7 Cliente tipo: 2 COMPRA COMPUTADORA CON PRECIO: 560.0
 * 
 * BUILD SUCCESSFUL (total time: 1 minute 54 seconds)
 */
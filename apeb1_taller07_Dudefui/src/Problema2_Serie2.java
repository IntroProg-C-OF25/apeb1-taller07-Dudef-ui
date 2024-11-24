/***
 * Problema 2
 * Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 * 5/10, 10/12, 15/14, 20/16, 25/18, 30/20
 */
import java.util.Scanner;
public class Problema2_Serie2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int cont = 5, limite, num = 1, num2 = 10;
        System.out.print("DAME EL LIMITE: ");
        limite = teclado.nextInt();
        while(num <= limite){
            System.out.print(cont + "/" + num2 + ", ");
            cont = cont + 5;
            num++;
            num2 = num2 + 2;
        }
        System.out.println("");
    }
}


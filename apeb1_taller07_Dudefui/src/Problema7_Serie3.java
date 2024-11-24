/***
 * Generar e imprimir la siguiente serie:
 * sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 */
import java.util.Scanner;
public class Problema7_Serie3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 1, cont2 = 1, lim = 10;
        while(cont2<=lim){
            if(cont2 % 2 == 0){
                System.out.print("+("+cont+"/"+cont2+")");
            }else{
                System.out.print("-("+cont+"/"+cont2+")");
            }
            cont2++;
        }
        System.out.println("");
    }
}
/***
 * run:
 * -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 * BUILD SUCCESSFUL (total time: 0 seconds)
 */
/*
*Gonzalez Valadez Jose Leonardo 
 */
package matriz.pkg1;
import java.util.Scanner;
/**
 *
 * @author Angel
 */
public class Matriz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
       int n,m ,c; 
       System.out.println("Ingrese la medida de la base");
       n=teclado.nextInt();
       System.out.println("Ingrese la medida de la altura");
       m=teclado.nextInt();
  char matriz [][] = new char[n][m];
  for(int i=0; i< matriz.length; i++){
      for(int j=0; j<matriz[0].length;j++){
          if(i==0||i==n-1||j==0||j==m-1){
              matriz[i][j]='x';
          }
              else{
                      matriz[i][j]=' ';
              }
          System.out.print(matriz[i][j]+" ");
    }
      System.out.println();
}
  }}
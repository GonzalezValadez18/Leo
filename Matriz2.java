/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz.pkg2;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class Matriz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Scanner teclado = new Scanner(System.in);
       int n,m ,c; 
          System.out.println("Dimension del cuadrado de la diagonal");
    int a = teclado.nextInt();

    char[][]arreglo = new char[a][a];

    for ( int i=0; i < arreglo.length ;i++){
          for (int j=0;  j<arreglo.length;j++){
                int x = i + 1;
                if(j == (a - x)){
                    arreglo[i][j] = ' ';
                    System.out.print(arreglo[i][j] + " ");
                }
                else{
                   arreglo[i][j] = 'x';
                   System.out.print(arreglo[i][j] + " ");
                }
          }  
           System.out.println();
    }}
    
    
}

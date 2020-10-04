/*
---------GONZALEZ VALADEZ JOSE LEONARDO---------------
-------------------3S11-------------------------------
 */
package brackets;

import java.util.Scanner;
//Se anade la clase stack al programa.
import java.util.Stack;
//En la clase Brackets se declara lo siguiente... 
public class Brackets {
      //Inicia la clase principal
    public static void main(String[] args) {
        //Se crea una pila con la clase stack (pila).
        Stack <Character> pila64=new Stack<>();
        //se importa la clase Scanner para ingresar datos desde el teclado
        Scanner entra= new Scanner(System.in);
        //Se pide que ingrese la cadena de Brackets
        System.out.println("Ingresa la cadena con los parentesis, corchetes o llaves"); 
        //Escribe es declarado como una variable de cadena de caracteres string
        String Caracteres =entra.next();
        //Aqui se declara la pilaStack como un arreglo tipo char que contendra y leera lo ingresado en la pila con valo String
        //.toCharArray convierte una cadena de caracter tipo String en un arreglo
        char pcll [ ]=Caracteres.toCharArray();
       //Se declara un valor de tipo boleano (true,false) como correcto
        boolean correcto=true;
        //Ahora recorre cuno a uno los caracteres de la pila.
        for (int i = 0; i < pcll.length; i++) {
            //Si el caracter pertenece a la pila de abrir
            if(VerificarAbrir(pcll[i]))
                //.push lo agrega a la pila en la posicion i 
                pila64.push(pcll[i]);
            else{
                //si la pila esta vacia 
                if (pila64.isEmpty()) {
                    //la pila sera falsa o erronea
                    correcto=false;
                    //se rompe la condicion
                    break;
                    //.peek es el tope o cima de la pila                   
                    //Si el tope de la pila es diferente a el valor inverso de la posicion actual del caracter de apertura
                }if(pila64.peek()!=ValorInverso(pcll[i])){
                    //entonces la condicion no se cumplo y no hace falta seguir evaluando
                    correcto = false;
                    //se rompe la condicion
                    break;
                   /*si no se cumple ninguna de las condiciones anteriores entonces la pila esta correcta y se procedera a eliminar...
                   el tope de la pila*/
                }else
                    //.pop elimina el ultimo elemento de la pila
                    pila64.pop();
            }}
        //.isEmpty verifica si la pila no esta vacia
        //El siguienten if verifica si la pila es diferente a vacia sera false por lo tanto no sera una cadena valida 
       if(!pila64.isEmpty())
           correcto = false;
       //El siguienten if verifica si la pila esta vacia el boolean sera correcto(true) y sera una cadena balanceada o correcta
       if(correcto)
            System.out.println("\033[32m---ES UNA ENTRADA VALIDA---\nLa pila quedo vacia por lo tanto la cadena fue correctamente cerrada");
       //si las pila no se vacio por completo la pila se detectara como invalida.
       else
            System.out.println("\033[35m---NO ES UNA ENTRADA VALIDA---\nVerifica tu entrada puede que existan caracteres de mas o esten mal acomodados\n ");
    }
    //Se crean 2 arreglos tipo char uno con los corchetes de apertura y otro con los de cierre
   //arreglo con carecteres de apertura
    static char abrir[]= {'(','[','{'};
   //arreglo con caracteres de cierre
      static char cerrar[]= {')',']','}'};
    //Esta funcion recorre el arreglo abrir para determinar si es un caracter ingresado de apertura    
    //Se declara como caracter de entrada tipo char
      static boolean VerificarAbrir(char caracter){
          for (int i = 0; i < abrir.length; i++) 
              if (abrir[i]==caracter) 
           return true;
                  return false;
          }
      static char ValorInverso(char caracter){
          for (int i = 0; i < abrir.length; i++) 
              //si el arreglo agrrir rn la posicion i es igual al cacarcter de entrada
              if (abrir[i]==caracter)
                  //se retorna el valor de la misma posicion pero del arreglo cerrar
                  return cerrar[i];
          //de igual forma si no fue encontrado en los de apertura lo buscara en los de cierre
          for (int i = 0; i < cerrar.length; i++) 
              //y un if igual al de abrir pero invertido
          if(cerrar[i]==caracter)
              //y si m coincide con cerrar en la posicion i regresa el valor en la misma posicion pero del arreglo abrir
              return abrir[i];
          //de no ser encontrado regresa un espacio vacio
                  return ' ';
      }}

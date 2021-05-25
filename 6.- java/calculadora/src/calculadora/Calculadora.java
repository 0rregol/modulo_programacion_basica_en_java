/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.Scanner;
/**
 *
 * @author orregol
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double num1, num2, res;
        int op, ope;
        do{
          System.out.println("Ingrese numero");    
        num1 = leer.nextDouble();
        System.out.println("Ingrese otro numero");    
        num2 = leer.nextDouble();
         System.out.println("Elija Operacion 1.- suma, 2.- resta, 3.- multiplicacion, 4.- division");    
        ope = leer.nextInt();
        switch(ope){
            case 1: res=num1+num2;
              System.out.println("el resultado de "+num1+" + "+num2+" = "+res);
            break;
            case 2: res=num1-num2;
             System.out.println("el resultado de "+num1+" - "+num2+" = "+res);
            break;
            case 3: res=num1*num2;
             System.out.println("el resultado de "+num1+" * "+num2+" = "+res);
            break;
            case 4: res=num1/num2;
             System.out.println("el resultado de "+num1+" / "+num2+" = "+res);
            break;
        }
        System.out.println("Desea Realizar otra Operacion 1.- si, 2.- no ");
        op = leer.nextInt();
      
        }while(op==1);
        System.out.println("Gracias por calcular con nosotros");
        // TODO code application logic here
    }
    
}

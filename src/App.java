
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
    Scanner hola=new Scanner(System.in);

    System.out.println("ingrese un numero:");
    byte num=hola.nextByte();
     int lista[]=new int[5];

     lista[4]=num;
     for(int i=0;i<lista.length;i++){
        System.out.println("la posicion es:"+i+"y el valor es:"+lista[i]);

        
     }





    }
}

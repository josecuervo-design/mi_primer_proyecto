import java.util.Scanner;
public class Ejercios {
    public static void main(String[] args) {
      int num=0;
       double saldo=0;
       double entrada=0;
       String contraseña="pepito12345";
       String contra1;
       String usua1;
       String usuario="carlos";
       double dinero;
           Scanner opc= new Scanner(System.in);
    do{
   
       System.out.println("====================================");
       System.out.println("BIENVENIDO A BANCOLOMBIA");
       System.out.println("que desea realizar ");
       System.out.println("1.ver saldo");
       System.out.println("2.ingresar dinero");
       System.out.println("3.retirar dinero");
       System.out.println("4.Salir");
       System.out.println("====================================");
      System.out.println("opcion:");
    
     
       num=opc.nextInt();
       opc.nextLine();

       switch (num) {
        case 1:
            System.out.println("ingrese su usuario:");
            usua1=opc.nextLine();
            System.out.println("ingrese su contraseña:");
            contra1=opc.nextLine();
            if(!contraseña.equals(contra1) && usuario.equals(usua1)){
                System.out.println("contraseña o usuario incorrectos");
            }else{
            System.out.println("ingrese su contraseña;");
            System.out.println("TU SALDO ES DE "+saldo);
            
            }
           
            break;

        case 2:

            System.out.println("ingrese la cantidad de dinero :");
            entrada=opc.nextDouble();
            saldo+=entrada;
            System.out.println("el nuevo saldo es : "+saldo);


            
            break;
        
        case 3:
            System.out.println("que cantidad de dinero desea retirar:");
            dinero=opc.nextDouble();
            if(saldo<dinero){
                System.out.println("no se puede retirar esa cantidad");
            }else{
            saldo=saldo-dinero;
            System.out.println("has retirado exitosamente:"+dinero);
            System.out.println("saldo actual:"+saldo);
            

            }
           
            break;
       
        default:
            break;
       }

    }while(num!=4);
     
      
       
    opc.close();



    }
}
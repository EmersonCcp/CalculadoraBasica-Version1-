package calculadorabasica;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in); 
        int seleccion=0,sw=0,opcion=0;
        
        do{                              //ciclo principal
            while(opcion<1||opcion>2){  //validacion para que no ingrese numero distinto a 1 y 2
                System.out.println("Bienvenido a la Calculadora Basica");
            System.out.println("Desea realizar alguna operacion?\n1.Si   2.No");
            opcion=in.nextInt();
            }
            
            if(opcion==1){
                while(seleccion<1||seleccion>5){  //menu de opciones e ingreso de seleccion
                    System.out.println("---------------");
                   System.out.println("1. Sumar\n2. Restar\n3. Multiplicacion\n4. Division\n5. Salir\nElige una opcion:");
                seleccion=in.nextInt(); 
                }
                
                switch(seleccion){  //switch para las distintas operaciones
                    case 1:
                        Operaciones mensajeroS=new Sumar();
                        mensajeroS.IngresoDatos();
                        mensajeroS.Operacion();
                        break;
                    case 2:
                        Operaciones mensajeroR=new Resta();
                        mensajeroR.IngresoDatos();
                        mensajeroR.Operacion();
                        break;
                    case 3:
                        Operaciones mensajeroM=new Multiplicacion();
                        mensajeroM.IngresoDatos();
                        mensajeroM.Operacion();
                        break;
                    case 4:
                        Operaciones mensajeroD=new Division();
                        mensajeroD.IngresoDatos();
                        mensajeroD.Operacion();
                        break;
                    case 5:
                        sw=1;
                        break;
                        
                }
                
                
            }else if(opcion==2){  //para cerrar el programa
               sw=1;
            }
            opcion=0;  //vaciar opcion
            seleccion=0;//vaciar seleccion de operacion
            
        }while(sw!=1);
    }

}

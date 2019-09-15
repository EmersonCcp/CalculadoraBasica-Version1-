package calculadorabasica;

import java.util.Scanner;

public abstract class Operaciones {

    Scanner in = new Scanner(System.in);
    protected double num1, num2, resultado; //variables para operar

    public void IngresoDatos() {   //Metodo para el ingreso de datos
        System.out.print("Ingrese el primer valor:");
        num1 = in.nextDouble();
        System.out.print("Ingrese el segundo valor:");
        num2 = in.nextDouble();

    }
    
    public abstract void Operacion();  //metodo abstracto

}

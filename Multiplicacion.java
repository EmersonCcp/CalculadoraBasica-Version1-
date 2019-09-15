
package calculadorabasica;


public class Multiplicacion extends Operaciones{
    @Override
    public void Operacion(){
        resultado=num1*num2;
        System.out.println("El resultado de la multiplicacion es: "+resultado);
        System.out.println("-------------------------------------------------");
    }
}

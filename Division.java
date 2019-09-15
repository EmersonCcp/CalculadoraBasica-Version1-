
package calculadorabasica;


public class Division extends Operaciones{
    @Override
    public void Operacion(){
        resultado=num1/num2;
        System.out.println("El resultado de la division es: "+resultado);
        System.out.println("-------------------------------------------------");
    }
}

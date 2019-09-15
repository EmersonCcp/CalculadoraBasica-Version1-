
package calculadorabasica;


public class Resta extends Operaciones{
    @Override
    public void Operacion(){
        resultado=num1-num2;
        System.out.println("El resultado de la resta es: "+resultado);
        System.out.println("----------------------------------------");
    }
}

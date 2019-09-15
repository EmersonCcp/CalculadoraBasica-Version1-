package calculadorabasica;

public class Sumar extends Operaciones{

    @Override
    public void Operacion(){
        resultado=num1+num2;
        System.out.println("El resultado de la suma es: "+resultado);
        System.out.println("----------------------------------------");
    }
    
}

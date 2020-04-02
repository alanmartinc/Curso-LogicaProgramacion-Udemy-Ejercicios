package contadordigitos;

public class ContadorDigitos {

    public static void main(String[] args) {
        
        int num = 2;
        
        if (num > 0 && num <= 9999) {
        
        if (num < 10) {
            System.out.println("El número tiene 1 digito");
        }
        
        if (num >= 10 && num <= 99) {
            System.out.println("El número tiene 2 digitos");
        }
        
        if (num >= 100 && num <= 999){
            System.out.println("El número tiene 3 digitos");
        }
        
        if (num >= 1000 && num <= 9999){
            System.out.println("El número tiene 4 digitos");
        }
        
        }
        
        else {
            System.out.println("Introduce un número positivo entre 1 y 9999.");
        }
        
    }
    
}

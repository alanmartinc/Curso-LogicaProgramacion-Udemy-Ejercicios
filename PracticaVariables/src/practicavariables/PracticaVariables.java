package practicavariables;

public class PracticaVariables {

    public static void main(String[] args) {
        
        int n1 = 2, n2 = 5, n3 = 0;  
        
        n3 = n2 - n1;
        n2 = 2;
        n1 = n3 + n2;
        n3 = n2 * n3;
        n2 = n3 / n1;
        
        System.out.println("El valor de n1 = " +n1);
        System.out.println("El valor de n2 = " +n2);
        System.out.println("El valor de n3 = " +n3);
        
    }
    
}

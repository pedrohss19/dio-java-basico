package repeticoes;
public class ExemploBreakContinue {
    public static void main(String[] args) {
        
        for( int numero = 1; numero <= 5; numero ++){
            if(numero == 3)
                break;
            //Interrompe o laço
            System.out.println(numero);
        }

        for( int numero = 1; numero <= 5; numero ++){
            if(numero == 3)
                continue;
            //Interrompe a iteração atual
            System.out.println(numero);
        }
    }
}

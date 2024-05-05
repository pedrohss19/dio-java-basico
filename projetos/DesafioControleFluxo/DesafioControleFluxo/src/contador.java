import java.util.Scanner;

public class contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o 1° número: ");
        int parametroUm = sc.nextInt();
        System.out.println("Entre com o 2° número");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        finally{
        sc.close();
        }
    }

    static void contar( int parametroUm, int parametroDois)throws ParametrosInvalidosException{
        if (parametroUm > parametroDois) 
            throw new ParametrosInvalidosException();
        
        int contagem = parametroDois - parametroUm;

        for( int i = 1; i <= contagem; i++){
            System.out.println(i);
        }      
    }
}
